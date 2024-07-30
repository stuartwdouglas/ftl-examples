package ftl.verb

import xyz.block.ftl.Verb


@Verb(export = true)
fun hello(name: String): String = "Hello $name"