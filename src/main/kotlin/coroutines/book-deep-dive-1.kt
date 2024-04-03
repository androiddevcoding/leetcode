package coroutines

import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val l = buildList {
        repeat(3) {
            add("User$it")
            println("L: added user")
        }
    }

    val l2 = l.map {
        println("L: Processing")
        "Processed $it"
    }

    val s = sequence {
        repeat(3) {
            yield("User$it")
            println("S: Added user")
        }
    }

    val s2 = s.map {
        println("L: Processing")
        "Processed $it"
    }
}
