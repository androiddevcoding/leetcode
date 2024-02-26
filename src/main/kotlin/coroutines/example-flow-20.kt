package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import java.lang.System.currentTimeMillis


fun main() = runBlocking<Unit> {
    val nums = (1..3).asFlow().onEach {
        delay(300)
    }
    val strs = flowOf("one", "two", "three").onEach {
        delay(400)
    }
    val startTime = currentTimeMillis()

    nums.combine(strs) { a, b ->
        "$a -> $b"
    }.collect { value ->
        println("$value at ${currentTimeMillis() - startTime} ms from start")
    }
}


/// https://kotlinlang.org/docs/flow.html#flattening-flows