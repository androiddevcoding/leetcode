package coroutines

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.transform
import kotlinx.coroutines.runBlocking


fun main() = runBlocking<Unit> {
    (1..5).asFlow().transform {
        emit("Making request $it")
        emit(performRequest(it))
    }.collect {
        println(it)
    }
}


/// https://kotlinlang.org/docs/flo=w.html#size-limiting-operators