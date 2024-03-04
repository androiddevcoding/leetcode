package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
//    val sum = (1..5).asFlow().fold(100) { accumulator, value ->
//        println("accumulator=$accumulator, value=$value")
//        accumulator + value
//    }
//    println("Sum of 1..3 is $sum.sin")
//
//
fun double(value: Int) = flow {
    emit(value)
    delay(100)
    emit(value)
}

    (1..3).asFlow()
        .flatMapConcat {
            double(it)
        }
        .collect {
            println(it)
        }

}


/// https://waynestalk.com/en/kotlin-coroutine-flow-tutorial-en/