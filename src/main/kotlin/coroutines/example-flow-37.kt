package coroutines

import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.cancellable
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
//    fun foo(): Flow<Int> = flow {
//        for (i in 1..5) {
//            println("Emitting $i")
//            emit(i)
//        }
//    }
//
//    foo().collect {
//        if (it == 3) cancel()
//        println(it)
//    }

    (1..5).asFlow().cancellable().collect { value ->
        if (value == 3) cancel()
        println(value)
    }

}
