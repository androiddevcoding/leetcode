package coroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis


fun main() = runBlocking {
    val time = measureTimeMillis {
        println("The answer is ${concurrentSum()}")
    }
    println("Completed in $time ms")
}

suspend fun concurrentSum(): Int = coroutineScope {
    val one = async { doSom1() }
    val two = async { doSom2() }
    one.await() + two.await()
}