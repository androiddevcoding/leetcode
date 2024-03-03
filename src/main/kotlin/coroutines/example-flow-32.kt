package coroutines

import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.runBlocking

fun simple32() = flow {
    emit(1)
    throw RuntimeException()
}

fun main() = runBlocking<Unit> {
    simple32().onCompletion {
        if (it != null) println("Flow completed exceptionally!")
    }.catch {
        println("Caught exception")
    }.collect {
        println(it)
    }
}
