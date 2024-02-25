package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

suspend fun performRequest(request: Int): String {
    delay(1000)
    return "response $request"
}

fun main() = runBlocking<Unit> {
    (1..5).asFlow().map { performRequest(it) }.collect {
        println(it)
    }
}


/// https://kotlinlang.org/docs/coroutine-context-and-dispatchers.html#dispatchers-and-threads