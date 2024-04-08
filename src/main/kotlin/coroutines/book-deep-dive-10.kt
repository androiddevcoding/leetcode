package coroutines

import kotlinx.coroutines.*
import kotlin.concurrent.thread

suspend fun main(): Unit = coroutineScope {
    runBlocking {
        this.launch { // same as just launch
            delay(1000L)
            println("World!")
        }
        launch { // same as this.launch
            delay(2000L)
            println("World!")
        }
        println("Hello,")
    }
}



