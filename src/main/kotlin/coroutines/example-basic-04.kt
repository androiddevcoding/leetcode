package coroutines


import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    doWorld12()
}

suspend fun doWorld12() = coroutineScope {
    launch {
        delay(2000L)
        println("World 2!")
    }
    launch {
        delay(1000L)
        println("World 1")
    }
    println("Hello")
}