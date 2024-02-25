package coroutines

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis


fun main() {
    val time = measureTimeMillis {
        val one = oneAsyns()
        val two = twoAsyns()
        one.start()
        two.start()
        runBlocking {
            println("The answer is ${one.await() + two.await()}")
        }
    }
    println("Completed in $time ms")
}

@OptIn(DelicateCoroutinesApi::class)

fun oneAsyns() = GlobalScope.async {
    doSom1()
}

@OptIn(DelicateCoroutinesApi::class)

fun twoAsyns() = GlobalScope.async {
    doSom2()
}