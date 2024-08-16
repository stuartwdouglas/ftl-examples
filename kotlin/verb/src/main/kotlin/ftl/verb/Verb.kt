package ftl.verb

import ftl.builtin.CatchRequest
import ftl.payments.Transaction_eventsSubscription
import ftl.payments.WidenedPaymentEvent
import ftl.tbdex.Message
import io.quarkus.logging.Log
import xyz.block.ftl.*


@Export
@Verb
fun hello(name: Person): String = "Hello From Verb ${name.first} ${name.last}"


@Export
@TopicDefinition("myTopic")
interface MyTopic : Topic<Person>

@Cron("1s")
fun cron(@Config("CUSTOMER_TOKEN_TBD") secret: String, topic: MyTopic) {
    Log.error("cron method invoked " + secret)
    topic.publish(Person(first = "Test", last = secret, greeting = "Hi"))
}

@Retry(count = 1, maxBackoff = "2s", minBackoff = "1s", catchVerb = "failure")
@Transaction_eventsSubscription
fun subscribe(person: WidenedPaymentEvent) {
    Log.error("subscription invoked ")
}

@Export
@Verb()
fun failure(person: CatchRequest<WidenedPaymentEvent>) {
    Log.error("failed ")
}


@VerbClientDefinition(module = "verb", name = "hello")
interface HelloClient : VerbClient<Person, String>
