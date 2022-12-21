package aula7.sealedClass

import aula7.Carteira
import aula7.sealedClass.ResultadoBuscaUsuario.*
import kotlin.random.Random

data class Usuario(val nomeUsuario: String, val senha: String)

sealed class ResultadoBuscaUsuario {
    data class Sucesso(val valor: Usuario, val mensagem: String) : ResultadoBuscaUsuario()
    object Carregando : ResultadoBuscaUsuario() {

    }
    data class Falha(val erro: String) : ResultadoBuscaUsuario()
}

fun buscaUsuario(): ResultadoBuscaUsuario {
    val usuarioAleatorio = Usuario("Rafael", "1234")

    return when(Random.nextInt(0,3)) {
        0 -> Sucesso(usuarioAleatorio, "Sucesso ao buscar usuário")
        1 -> Carregando
        2 -> Falha("Falha ao buscar usuário")
        else -> Carregando
    }
}

fun main() {
    repeat(6) {
        val resposta = buscaUsuario()
        when(resposta) {
            is Sucesso -> println("${resposta.mensagem}. O usuário foi ${resposta.valor}")
            is Carregando -> { println("Carregando...")}
            is Falha -> println(resposta.erro)
        }
    }
}