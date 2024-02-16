package coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

fun main() = runBlocking {
    val channel = Channel<Int>()
    launch {
        for (x in 1..56) {
            channel.send(x * x)
        }
    }
    repeat(5) {
        println(channel.receive())
    }
    println("done")
}