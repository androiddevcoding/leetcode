package coroutines

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.reduce
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val sum = (1..5).asFlow().reduce { accumulator, value ->
        println("accumulator=$accumulator, value=$value")
        accumulator + value
    }
    println("Sum of 1..3 is $sum")

}


/// https://waynestalk.com/en/kotlin-coroutine-flow-tutorial-en/