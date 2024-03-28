package coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableSharedFlow

/**
 * Пример использования extraBufferCapacity для MutableSharedFlow
 */
fun main() = runBlocking {
    val coroutineScope = CoroutineScope(Dispatchers.Default)
    val stateFlow = MutableSharedFlow<Int>(extraBufferCapacity = 2)
    // Для понимания разницы замените stateFlow на:
    // val stateFlow = MutableSharedFlow<Int>(extraBufferCapacity = 0)
    // Данные приходит перестанут

    println(stateFlow.replayCache)

    coroutineScope.launch {
        stateFlow.collect {
            delay(1000)
            println("collect1: $it")
        }
    }

    delay(120)

    // Если использовать emit а не tryemit данных приходить будут так как:
    // tryEmit(в отличие от emit) не является приостанавливающей функцией
    // https://github.com/Kotlin/kotlinx.coroutines/issues/2387?ref=blog.danlew.net#issuecomment-727220851

    stateFlow.tryEmit(1)
    stateFlow.tryEmit(2)

    while (coroutineScope.isActive) {

    }
}


