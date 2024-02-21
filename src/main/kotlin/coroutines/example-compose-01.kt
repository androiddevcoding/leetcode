package coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis


fun main() = runBlocking {
    val time = measureTimeMillis {
        val one = async { doSom1() }
        val two = async { doSom2() }
        println("The answer is ${one.await() + two.await()}")
    }
    println("Completed in $time ms")
}

suspend fun doSom1(): Int {
    delay(1000L)
    return 10
}

suspend fun doSom2(): Int {
    delay(1500)
    return 20
}