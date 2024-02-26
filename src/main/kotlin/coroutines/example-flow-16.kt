package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis


fun main() = runBlocking<Unit> {
    val time = measureTimeMillis {
        simple()
            .collectLatest {value ->
                println("Collecting $value")
                delay(300) // pretend we are processing it for 300 ms
                println("Done $value")
            }
    }
    println("Collected in $time ms")
}


/// https://kotlinlang.org/docs/flo=w.html#size-limiting-operators