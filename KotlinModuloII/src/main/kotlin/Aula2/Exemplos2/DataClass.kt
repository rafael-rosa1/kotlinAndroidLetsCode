package Aula2.Exemplos2

import Aula2.Exemplos2.NivelGuerreiro.*
import kotlin.random.Random

// Exemplo: Data Class
//
// O que possui de diferente de uma classe convencional?
//      (*) .toString() personalizado, para apresentar com clareza os valores dos atributos do objeto;
//      (**) Objetos dessa classe ir�o possuir por padr�o o m�todo.copy(), que possibilita criar um objeto com
//          todos os campos copiados de um primeiro objeto;
//      (***) .equals() e .hasCode() personalizados, se dois objetos tiverem todos os atributos com valores iguais,
//          a resposta ser� true (s�o iguais) para o .equals() e ter�o o mesmo valor de c�digo hash.

// Uma CASA e ANIMAL DE ESTIMACAO -> internas do Guerreiro
data class Guerreiro(
    val nome: String,
    var vida: Int = VIDA_INICIAL,
    var nivel: NivelGuerreiro = NIVEL_INICIAL,
    var casa: Casa? = null
) {

    var animalDeEstimacao: AnimalDeEstimacao? = null

    // Nested Class -> ser� possivelmente acessada de forma externa
    data class Casa(val tamanho: Int, val recuperacao: Int) {
        fun descansar() {
            // Aumentar a vida do guerreiro somando "recuperacao"
        }
    }

    // Inner Class -> acess�vel apenas internamente no escopo do Guerreiro
    inner class AnimalDeEstimacao(val nome: String, val dano: Int) {
        private val multiplicadorDeDano = Random.nextInt(1, 2)
        fun golpear(): Int {
            return dano * multiplicadorDeDano
        }
    }

    companion object {
        const val VIDA_INICIAL = 20
        val NIVEL_INICIAL = SOLDADO

        var multiplicadorDano = 1
        fun buscarDescricao(): String {
            return "O guerreiro � um personagem que veio da Terra M�dia e vive nos anos de 900a.C ..."
        }
    }

    fun golpear(): Int {
        return nivel.arma.dano
    }

    fun golpeMultiplo(): Int {
        return nivel.arma.dano * multiplicadorDano
    }

    fun superGolpe(): Int {
        return nivel.superDano() + (animalDeEstimacao?.dano ?: 0)
    }

    fun ganhouUmCachorro(animal: AnimalDeEstimacao) {
        animalDeEstimacao = animal
    }

    fun mudaNivel() {
        vida *= 2
        nivel = when(nivel) {
            SOLDADO -> GUARDA
            GUARDA -> GENERAL
            GENERAL -> {
                animalDeEstimacao = AnimalDeEstimacao(nome = "Unic�rnio", dano = 80)
                CELESTIAL
            }
            CELESTIAL -> {
                animalDeEstimacao = AnimalDeEstimacao(nome = "Drag�o Negro de Olhos Vermelhos", dano = 120)
                APOCALIPTICO
            }
            APOCALIPTICO -> DEUS_DOS_DEUSES
            else -> {
                vida /= 2
                println("Aviso: N�vel m�ximo j� alcan�ado!")
                nivel
            }
        }
    }

}

class Guerreiro2(
    val nome: String,
    var vida: Int = 20,
    var nivel: String
)

fun main() {
    // Criando um objeto do tipo Guerreiro
    val guerreiro1 = Guerreiro(nome = "Adalberto Guerreiro")
    // Uso do m�todo copy()
    val guerreiro2 = guerreiro1.copy()

    val guerreiro3 = Guerreiro2(nome = "Adalberto Guerreiro", nivel = "Soldado")
    val guerreiro4 = Guerreiro2(nome = "Adalberto Guerreiro", nivel = "Soldado")
    // Objetos atrav�s de data class
    println(guerreiro1.toString())
    println(guerreiro2.toString())
    // A fun��o .equals() (representada por ==)
    println(guerreiro2 == guerreiro1)

    // Objetos atrav�s de class
    println(guerreiro3.toString())
    println(guerreiro4.toString())
    // A fun��o .equals() (representada por ==)
    println(guerreiro4 == guerreiro3)
    val guerreiroJoao = Guerreiro(nome = "Jo�o")
    val guerreiroJose = Guerreiro(nome = "Jos�")

    println(Guerreiro.multiplicadorDano)
    println(guerreiroJoao.golpeMultiplo())
    println(guerreiroJose.golpeMultiplo())

    println()

    // Usu�rio acabou de comprar o pacote premium de guerreiro... seu dano ser� maior!
    Guerreiro.multiplicadorDano = 2
    println(Guerreiro.multiplicadorDano)
    println(guerreiroJoao.golpeMultiplo())
    println(guerreiroJose.golpeMultiplo())

    println()

    println(Guerreiro.buscarDescricao())

    // Guerreiro ganhou uma casa! Comprou com diamantes (dinheiro)

    val casaPremium = Guerreiro.Casa(tamanho = 100, recuperacao = 200)
    guerreiroJoao.casa = casaPremium

//    guerreiroJoao.ganhouUmCachorro(Guerreiro.AnimalDeEstimacao()) // ERRO -> n�o � poss�vel
//    instanciar um AnimalDeEstimacao fora da classe principal

}