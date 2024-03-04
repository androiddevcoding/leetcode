package coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

fun main() = runBlocking<Unit> {
    val coroutineScope = CoroutineScope(Dispatchers.Default)
    val sharedFlow = MutableSharedFlow<Int>()

    sharedFlow.tryEmit(1)
    sharedFlow.tryEmit(2)
    sharedFlow.tryEmit(3)

    sharedFlow.onEach {
        println("Emiting: $it")
    }.launchIn(coroutineScope)

    coroutineScope.launch {
        sharedFlow.emit(4)
        sharedFlow.emit(5)
        coroutineScope.cancel()
    }

    while (coroutineScope.isActive) {

    }
}
