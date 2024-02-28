package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import java.lang.System.currentTimeMillis

fun simple5(): Flow<String> = flow {
    for (i in 1..3) {
        println("Emitting $i")
        emit(i)
    }
}.map { value ->
    check(value <= 1) { "Crashed on $value" }
    "string $value"
}
fun main() = runBlocking<Unit> {
      simple5()
          .catch { e ->
              emit("Caught $e") } // emit on exception
          .collect{
          println(it)
      }
}
// https://kotlinlang.org/docs/flow.html#transparent-catch
// https://github.com/Kotlin/kotlinx.coroutines/blob/master/kotlinx-coroutines-core/jvm/test/guide/example-flow-29.kt

