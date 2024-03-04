package coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking<Unit> {
    val coroutineScope = CoroutineScope(Dispatchers.Default)
    val sharedFlow = flow {
        emit(1)
        emit(2)
        emit(3)

        Thread.sleep(50)
        coroutineScope.cancel()
    }.shareIn(coroutineScope, started = SharingStarted.Lazily)


    sharedFlow.onEach {
        println("Emiting: $it")
    }.launchIn(coroutineScope)


    while (coroutineScope.isActive) {

    }
}
