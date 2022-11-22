
fun main() {
//    val podeSerNula: String? = "abcde"
//
//    val substring = podeSerNula?.substring(0,2)
//
//    println(substring)
//
//
//    println(podeSerNula)
//    Produto(
//        nome = "Chocolate",
//        preco = 4.99,
//        descricao = null,
//        categoria = null
//
//    )
//
//    var stringNula: String? = null
//
//    stringNula?.let { println(it) }
//
//    var lista : MutableList<Int?> = mutableListOf()
////    val listaQuePodeSerNula = List<Init?>null
//    repeat (3) {
//        println("Dgite o ${it.inc()} número")
//        val entrada = readln()
//    }
//
//    lista.forEach { numero ->
//        numero?.let {
//            println(it)
//        }
//    }

    println("Digite sua idade")
    val idade: Int? = readln().toIntOrNull()

    try {
        when (idade) {
            in 0..17 -> throw MenorDeIdadeException()
            in 18..Int.MAX_VALUE -> println("Acesso permitido")
            null -> throw NullPointerException()
        }
    } catch (e: MenorDeIdadeException){
        println("Proibido para menores de 18 anos")
    } catch (e: NullPointerException){
        println("Digite uma idade valida")
    } catch (e: Exception){
        println("Erro genérico")
    }


}

class MenorDeIdadeException : Exception() {
    override fun getLocalizedMessage(): String {
        return "Erro: acesso permitido apenas para maiores de 18 anos"
    }
}



//data class Produto(
//    val nome: String,
//    val preco: Double,
//    val descricao: String? = null,
//    val categoria: String? = null
//)
