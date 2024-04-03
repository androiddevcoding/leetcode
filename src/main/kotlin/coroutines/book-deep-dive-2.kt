package coroutines

import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    fun m(i: Int): Int {
        print("m$i ")
        return i * i
    }

    fun f(i: Int): Boolean {
        print("f$i ")
        return i >= 10
    }

    listOf(1, 2, 3, 4, 5, 6, 7, 8, 10)
        .map {
            m(it)
        }
        .find {
            f(it)
        }
        .let {
            print(it)
        }

    println()

    sequenceOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        .map {
            m(it)
        }
        .find {
            f(it)
        }
        .let {
            print(it)
        }
}
