package aula2

import kotlinx.coroutines.*

private suspend fun apiCall1(): String {
    delay(2000L)
    return "chamou o endpoint 1"
}

private suspend fun apiCall2(): String {
    delay(2000L)
    return "chamou o endpoint 2"
}

fun main() = runBlocking {
    launch(Dispatchers.IO) {
        val apiCall1 = async { apiCall1() }
        val apiCall2 = async { apiCall2() }

        println(apiCall1.await())
    }
    println("")
}

