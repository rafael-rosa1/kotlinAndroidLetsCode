
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

//fun main()  {
//
//    val tempo = measureTimeMillis {
//        val soma1 = soma(10, 2)
//        val soma2 = soma(9, 8)
//        val soma3 = soma(9, 11)
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
//        launch { cumprimenta("Rafael") }
//    }
//    print("Olá, boa noite ")
//    println()
//    println("$tempo ms")
//    val tempo = measureTimeMillis {
//        val soma1 = async { soma(10,2) }
//        val soma2 = async { soma(10,10) }
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