package coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking<Unit> {
    val coroutineScope = CoroutineScope(Dispatchers.Default)
    val stateFlow = MutableStateFlow("Author: Filip ")

    println(stateFlow.value)

    coroutineScope.launch {
        stateFlow.collect {
            println("collect: " + it)
        }
    }

    stateFlow.value = "1111"
    stateFlow.tryEmit("2222")

    coroutineScope.launch {
        stateFlow.emit("3333")
    }
    Thread.sleep(50)
    coroutineScope.cancel()

    while (coroutineScope.isActive) {

    }
}


/// https://waynestalk.com/en/kotlin-coroutine-flow-tutorial-en/