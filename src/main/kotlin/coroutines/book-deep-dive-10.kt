package coroutines

import kotlinx.coroutines.*


suspend fun main(): Unit = coroutineScope {
    val job = Job()
    launch(job) {
            do {
                Thread.sleep(200)
                println("Printing") } while (isActive)

    }
    delay(1000)
    job.cancelAndJoin()
    println("Cancelled successfully")
    delay(1000)

}




