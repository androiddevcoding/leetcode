package coroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis


fun main() {
    val time = measureTimeMillis {
        val one =  oneAsyns()
        val two =  twoAsyns()
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