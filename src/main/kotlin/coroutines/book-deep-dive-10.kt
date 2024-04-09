package coroutines

import kotlinx.coroutines.*


suspend fun main(): Unit =  runBlocking {
    launch(Job()) { // the new job replaces one from parent
        delay(1000)
        println("Will not be printed")
    }
}




