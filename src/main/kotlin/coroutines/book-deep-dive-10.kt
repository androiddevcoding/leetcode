package coroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withTimeout


suspend fun test(): Int = withTimeout(1500) {
    delay(1000)
    println("Still thinking")
    delay(1000)
    println("Done!")
    42
}


suspend fun main(): Unit = coroutineScope {
    launch { // 1
        launch { // 2, cancelled by its parent
            delay(2000)
            println("Will not be printed")
        }
        withTimeout(1000) { // we cancel launch
            delay(1500)
        }
    }
    launch { // 3
        delay(2000)
        println("Done")
    }
}



