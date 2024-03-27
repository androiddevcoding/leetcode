package coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.flow.*

fun main() = runBlocking<Unit> {
    val coroutineScope = CoroutineScope(Dispatchers.Default)
    val flow = channelFlow<Int> {
        launch {
            delay(1000)
            send(1)
        }
        launch {
            delay(1000)
            send(2)
        }
        launch {
            delay(1000)
            send(3)
        }
    }

    coroutineScope.launch {
        flow.collect {
            println("it: " + it)
        }
    }

    val channel = produce<Int> {

    }

    channel.consumeEach {

    }

    while (coroutineScope.isActive) {

    }
}


