package coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
   val result = withTimeoutOrNull(1300L) {
       repeat(1000){ i ->
           println("Sleep $i")
           delay(500L)
       }
   }
    println("result: " + result)
}