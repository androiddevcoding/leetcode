package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    fun simple(): Flow<Int> = (1..3).asFlow().onEach {
        delay(1000)
    }

    simple().onEach {
        println("Event: $it")
    }.launchIn(this)

    println("Done!")
}
