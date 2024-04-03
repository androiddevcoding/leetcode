package coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

private fun CoroutineScope.makeChannel() = produce {
    println("Channel staterd")
    for (i in 1..3) {
        delay(1000)
        send(i)
    }
}

fun main() {
    runBlocking {
        val channel = makeChannel()

        delay(5000)
        println("Calling channel...")
        for (value in channel) {
            println(value)
        }
        println("Consuming again...")
        for (value in channel) {
            println(value)
        }
    }
}
