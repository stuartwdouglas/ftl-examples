package ftl.verb

import io.quarkus.logging.Log
import xyz.block.ftl.*
import java.util.function.Consumer


@Export
@Verb
fun hello(name: Person): String = "Hello From Verb ${name.first} ${name.last}"


@Export
@TopicDefinition(name = "myTopic")
interface MyTopic : Topic<Person>

@Cron("1s")
fun cron(@Config("CUSTOMER_TOKEN_TBD") secret: String, topic: MyTopic) {
    Log.error("cron method invoked " + secret)
    topic.publish(Person(first = "Test", last = secret, greeting = "Hi"))
}

@Subscription(name = "test", topic = "myTopic")
fun subscribe(person: Person, client: HelloClient) {
    Log.error("subscription invoked " + client.call(person))
}


@VerbClientDefinition(module = "verb", name = "hello")
interface HelloClient : VerbClient<Person, String>