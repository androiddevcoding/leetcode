package coroutines

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.runBlocking

fun simple321() = (1..3).asFlow()

fun main() = runBlocking<Unit> {
    simple321().onCompletion { cause ->
        println("Flow complete with $cause")
    }.collect { value ->
        check(value <= 1) { " Collected $value" }
        println(value)
    }
}
