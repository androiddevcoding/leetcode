package coroutines


import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    doWo4rld()
}

suspend fun doWo4rld() = coroutineScope {
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello")
}