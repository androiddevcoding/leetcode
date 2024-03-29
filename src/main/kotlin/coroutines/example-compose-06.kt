package coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


fun main() = runBlocking<Unit> {
    try {
        faildeConcurrentSum()
    } catch (e: java.lang.ArithmeticException) {
        println("Computation failed with ArithmeticException")

    }
}

suspend fun faildeConcurrentSum(): Int = coroutineScope {
    val one = async {
        try {
            delay(Long.MAX_VALUE)
            42
        } finally {
            println("First child was cancelled")
        }
    }
    val two = async<Int> {
        println("Second child throws an exception")
        throw ArithmeticException()
    }
    one.await() + two.await()
}