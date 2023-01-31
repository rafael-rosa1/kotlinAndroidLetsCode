package aula1
import kotlinx.coroutines.*

//fun aula1.main()  {
//
//    val tempo = measureTimeMillis {
//        val soma1 = aula1.soma(10, 2)
//        val soma2 = aula1.soma(9, 8)
//        val soma3 = aula1.soma(9, 11)
//
//        println("T1: $soma1")
//        println("T2: $soma2")
//        println("T3: $soma3")
//    }
//
//    println("Tempo de execução: $tempo")
//}

fun main() = runBlocking {

    cumprimentaNomeCompleto("Rafael", "Rosa")

    println(" Tudo bem?")



//    val tempo = measureTimeMillis {
//        launch { aula1.cumprimenta("Rafael") }
//    }
//    print("Olá, boa noite ")
//    println()
//    println("$tempo ms")
//    val tempo = measureTimeMillis {
//        val soma1 = async { aula1.soma(10,2) }
//        val soma2 = async { aula1.soma(10,10) }
//
//        println("T1: ${soma1.await()}")
//        println("T2: ${soma2.await()}")
//    }
//
//    println("Tempo de execução: $tempo")
}
suspend fun soma(a: Int, b: Int): Int {
    delay(1000L)
    return a + b
}

suspend fun cumprimenta(nome: String) {
    delay(2000L)
    print(nome)
}

suspend fun cumprimentaNomeCompleto(nome: String, sobrenome: String) = coroutineScope {
    launch {
        delay(3000L)
        print(" $sobrenome")
    }

    launch {
        delay(2000L)
        print(nome)
    }

    print("Boa noite ")
}