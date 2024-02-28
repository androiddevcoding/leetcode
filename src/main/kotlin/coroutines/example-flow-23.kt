package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import java.lang.System.currentTimeMillis

fun requestFlow1(i: Int): Flow<String> = flow {
    emit("$i First")
    delay(500)
    emit("$i Second")
}
fun main() = runBlocking<Unit> {
   val startTime = currentTimeMillis()
    (1..3).asFlow().onEach { delay(100) }
        .flatMapLatest { requestFlow1(it) }
        .collect { value -> // collect and print
            println("$value at ${currentTimeMillis() - startTime} ms from start")
        }
}

