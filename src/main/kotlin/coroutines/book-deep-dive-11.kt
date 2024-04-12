package coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

var counter1 = 0

suspend fun main(): Unit = runBlocking {
    val lock = Any()
    massiveRun {
        synchronized((lock)) {
            counter1++
        }
    }
    println(counter1)
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
