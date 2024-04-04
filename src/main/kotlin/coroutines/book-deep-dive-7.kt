package coroutines

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.random.Random
var counter = 0

private fun Flow<*>.counter(): Flow<Int> {
    return this.map {
        counter++
        List(100) { Random.nextLong() }.shuffled().sorted()
        counter
    }
}

fun main() {
    runBlocking {
        val f1 = List(1_000) { "$it" }.asFlow()
        val f2 = List(1_000) { "$it" }.asFlow()
        .counter()
        launch { println(f1.counter().last()) } // 1000
        launch { println(f1.counter().last()) } // 1000
        launch { println(f2.last()) } // less than 2000
        launch { println(f2.last()) } // less than 2000
    }
}
