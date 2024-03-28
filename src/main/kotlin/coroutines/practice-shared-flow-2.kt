package coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableSharedFlow

/**
 * Пример использования replay для MutableSharedFlow
 */
fun main() = runBlocking {
    val coroutineScope = CoroutineScope(Dispatchers.Default)
    val stateFlow = MutableSharedFlow<Int>(replay = 2)
    // Для понимания разницы замените stateFlow на:
    // val stateFlow = MutableSharedFlow<Int>(replay = 0)
    // Данные приходит перестанут

    stateFlow.tryEmit(1)
    stateFlow.tryEmit(2)

    println(stateFlow.replayCache)

    coroutineScope.launch {
        stateFlow.collect {
            println("collect1: $it")
        }
    }

    coroutineScope.launch {
        stateFlow.collect {
            println("collect2: $it")
        }
    }

    delay(1000)
}


