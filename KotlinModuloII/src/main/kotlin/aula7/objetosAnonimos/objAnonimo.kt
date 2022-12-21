package aula7.objetosAnonimos

import aula7.objetosAnonimos.Cor.*
import aula7.sealedClass.ResultadoBuscaUsuario

interface AcaoCliqueBotao{
    fun clique()
    fun cliqueLongo()
    fun duploClique()
}

enum class Cor{
    VERDE, VERMELHO, CINZA
}

class Botao(val text: String, val cor: Cor, val acaoCliqueBotao: AcaoCliqueBotao? = null)

fun main() {

    val botaoConfirmar: Botao = Botao("Confirmar", VERDE, acaoCliqueBotao = object : AcaoCliqueBotao {
        override fun clique() {
            println("Clique no botão confirmar!")
        }

        override fun cliqueLongo() {
            println("Clique longo no botão confirmar!")
        }

        override fun duploClique() {
            println("Clique duplo no botão confirmar!")
        }
    })


    val botaoResetar: Botao = Botao("Confirmar", VERMELHO, acaoCliqueBotao = object : AcaoCliqueBotao {
        override fun clique() {
            println("Clique no botão RESETAR!")
        }

        override fun cliqueLongo() {
            println("Clique longo no botão RESETAR!")
        }

        override fun duploClique() {
            println("Clique duplo no botão RESETAR!")
        }
    })
    val botaoNeutro: Botao = Botao("Confirmar", CINZA, acaoCliqueBotao = object : AcaoCliqueBotao {
        override fun clique() {
            println("Clique no botão neutro!")
        }

        override fun cliqueLongo() {
            println("Clique longo no botão neutro!")
        }

        override fun duploClique() {
            println("Clique duplo no botão neutro!")
        }
    })

    botaoResetar.acaoCliqueBotao?.let {
        it.clique()
        it.cliqueLongo()
        it.duploClique()
    }
    

}