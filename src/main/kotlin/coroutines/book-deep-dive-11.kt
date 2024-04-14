package coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withPermit

var counter1 = 0
val mutext = Mutex()

class MessagesRepository {
    private val messages = mutableListOf<String>()
    private val dispatcher = Dispatchers.IO.limitedParallelism(1)

    suspend fun add(message: String) = withContext(dispatcher) {
        delay(1000) // we simulate network call
        messages.add(message)
    }
}


suspend fun main(): Unit = coroutineScope {
    val semaphore = Semaphore(1)
    repeat(5) {
        launch {
            semaphore.withPermit {
                delay(1000)
                println(it)
            }
        }
    }
}

suspend fun massiveRun(action: suspend () -> Unit) = withContext(Dispatchers.Default) {
    repeat(1000) {
        launch {
            repeat(1000) {
                action()
            }
        }
    }
}
