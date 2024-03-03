package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import java.lang.System.currentTimeMillis


fun main() = runBlocking<Unit> {
    try {
        (1..3).asFlow().collect {
            print(it)
        }
    } finally {
        println("Done")
    }
}
