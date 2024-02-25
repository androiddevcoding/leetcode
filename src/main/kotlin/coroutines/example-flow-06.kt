package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

fun simple1(): Flow<Int> = flow {
    for (i in 1..99) {
        delay(100)
        println("Emitting $i")
        emit(i)
    }
}

fun main() = runBlocking<Unit> {
    withTimeoutOrNull(250) {
        simple().collect { value -> println(value) }

    }
    println("Done")

    (1..3).asFlow().collect { print("$it ") }
}


/// https://kotlinlang.org/docs/coroutine-context-and-dispatchers.html#dispatchers-and-threads