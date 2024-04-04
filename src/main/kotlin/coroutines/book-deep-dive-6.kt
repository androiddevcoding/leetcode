package coroutines

import kotlinx.coroutines.*

fun interface FlowCollector<T> {
    suspend fun emit(value: T)
}

interface Flow1<T> {
    suspend fun collect(collector: FlowCollector<T>)
}

fun <T> flow1(builder: suspend FlowCollector<T>.() -> Unit) = object : Flow1<T> {
    override suspend fun collect(collector: FlowCollector<T>) {
        builder(collector)
    }
}
fun main() {
    runBlocking {
          val f: Flow1<String> = flow1 {
              emit("a")
              emit("b")
              emit("c")
          }

        f.collect { print(it) }
        f.collect { print(it) }
    }
}
