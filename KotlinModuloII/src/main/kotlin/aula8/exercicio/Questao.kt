package aula8.exercicio

import aula8.exercicio.Dificuldade.FACIL
import aula8.exercicio.Dificuldade.MEDIO

class Questao<T>(val enunciado: String, val resposta: T, val dificuldade: Dificuldade) {

    fun mostraResposta() {

        if (resposta is Boolean) {
            println(
                """
            Enunciado: $enunciado
            Resposta: ${if (resposta) "Verdadeiro" else "Falso"}
            Dificultade: $dificuldade
        """.trimIndent()
            )
        } else {
            println(
                """
            Enunciado: $enunciado
            Resposta: $resposta
            Dificultade: $dificuldade
        """.trimIndent()
            )
        }
    }
}

enum class Dificuldade {
    FACIL, MEDIO, DIFICIL
}

fun main() {


    val questao1 = Questao(enunciado = "A soma de 425 e 1292 é 2.", resposta = false, dificuldade = FACIL)

    val questao2 = Questao(enunciado = "2 + 2 = ???", resposta = 4, dificuldade = FACIL)

    val questao3 = Questao(enunciado = "Quem descobriu o Brasil?", resposta = "Pedro Alvares Cabral", dificuldade = MEDIO)

    questao1.mostraResposta()
    questao2.mostraResposta()
    questao3.mostraResposta()

}
