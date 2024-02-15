package coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch(Dispatchers.Default) {
        try {
            repeat(5) { i ->
                println("job: I'm sleeping $i ...")
                delay(500)
            }
        } finally {
            withContext(NonCancellable) {
                println("finally")
                delay(1000L)
            }
        }
    }
    delay(1300L) // delay a bit
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() // cancels the job and waits for its completion
    println("main: Now I can quit.")
}