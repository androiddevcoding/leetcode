package coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {

    val sharedFlow = MutableSharedFlow<Int>(2)

    sharedFlow.onEach {
        println("Emiting: $it")
    }.launchIn(this)

    sharedFlow.onEach {
        println("hello: $it")
    }.launchIn(this)

    sharedFlow.emit(5)
    sharedFlow.emit(3)

    Thread.sleep(50)
}
