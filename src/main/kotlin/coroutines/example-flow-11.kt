package coroutines

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.reduce
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val sum = (1..5).asFlow().map {
        it
    }.reduce { accumulator, value ->
        println("" + accumulator + " " + value)
        accumulator + value
    }
    println("sum: " + sum)
}


/// https://kotlinlang.org/docs/flo=w.html#size-limiting-operators