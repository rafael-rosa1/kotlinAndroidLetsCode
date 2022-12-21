package aula8.exercicio

import kotlin.math.pow


abstract class GeradorSenha<T>(val qtdeCaracteres: Int) {
    abstract fun gerarSenha(): T
}

class GeradorSenhaNumerica(qtdeCaracteres: Int) : GeradorSenha<Int>(qtdeCaracteres) {
    override fun gerarSenha(): Int {
        val valorMinimo = 10.0.pow(qtdeCaracteres - 1).toInt()
        val valorMaximo = ((10.0.pow(qtdeCaracteres)) - 1).toInt()
        return (valorMinimo..valorMaximo).random()
    }
}

class GeraSenhaAlfanumerica (qtdeCaracteres: Int): GeradorSenha<String> (qtdeCaracteres) {
    override fun gerarSenha(): String {
        val caracteres : String = ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!*?+")
        return (1..qtdeCaracteres).map { caracteres.random() }.joinToString("")
    }

}

fun main() {
//    val senhaNumerica = GeradorSenhaNumerica(8)
//    repeat(15) {
//    println(senhaNumerica.gerarSenha())
//    }

    val senhaTexto = GeraSenhaAlfanumerica(8)
    repeat(15){
        println(senhaTexto.gerarSenha())
    }
}