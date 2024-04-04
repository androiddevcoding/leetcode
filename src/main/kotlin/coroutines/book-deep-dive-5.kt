package coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

private fun usersFlow(): Flow<String> = flow {
    repeat(3) {
        delay(1000)
        val ctx = currentCoroutineContext()
        val name = ctx[CoroutineName]?.name
        emit("User$it in $name")
    }
}

fun main() {
    runBlocking {
        val users = usersFlow()
        withContext(CoroutineName("Name")) {
            val job = launch {
                users.collect {
                    println(it)
                }
            }
            launch {
                delay(2100)
                println("I got enought")
                job.cancel()
            }
        }
    }
}
