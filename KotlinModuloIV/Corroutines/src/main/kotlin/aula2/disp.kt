package aula2

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main1() = runBlocking {

    launch(Dispatchers.IO) {
        println(coroutineContext)

        withContext(Dispatchers.Default){
            println(coroutineContext)
        }
    }
    println("")
}