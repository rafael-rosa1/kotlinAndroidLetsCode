package aula2

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

fun main2() {
    val name = CoroutineName("Koroutine")
    val element: CoroutineContext.Element = name
    val context: CoroutineContext = element

    println(context)

    val job = Job()
    val jobElement: CoroutineContext.Element = job
    val jobContext: CoroutineContext = jobElement

    println(jobContext)
}