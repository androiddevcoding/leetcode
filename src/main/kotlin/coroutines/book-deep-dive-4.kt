package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

private fun makeFlow() = flow {
    println("Flow started")
    for (i in 1..3) {
        delay(1000)
        emit(i)
    }
}

fun main() {
    runBlocking {
        val flow = makeFlow()

        delay(1000)
        println("Calling flow...")
        flow.collect { value ->
            println(value)
        }
        println("Consuming again...")
        flow.collect { value ->
            println(value)
        }
    }
}
