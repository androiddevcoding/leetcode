package coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

fun main() = runBlocking {
    val channel = Channel<Int>()
    launch {
        for (x in 1..56) {
            channel.send(x * x)
        }
        channel.close()
    }

    for (y in channel) println(y)
    println("done")
}