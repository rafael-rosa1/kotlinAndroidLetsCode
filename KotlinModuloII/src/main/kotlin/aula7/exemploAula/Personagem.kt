package aula7.exemploAula

open class Personagem(
    val dano: Int = 10,
    val defesa: Int = 5,
    val podeVoar: Boolean = false
)

class Guerreiro : Personagem(dano = 10, defesa = 5)

class Mago : Personagem(dano = 7, defesa = 8, podeVoar = true)

class Controle(val mouse: Mouse, val teclado: Teclado)

fun main() {

    val guerreiro = Guerreiro()
    val mago = Mago()

    val controleGuerreiro = Controle(
        mouse = object : Mouse() {
            override fun cliqueEsquerdo() {
                println("Usar espada para atacar(${guerreiro.dano} de dano.)")
            }

            override fun cliqueDireito() {
                println("Usar escudo para atacar(${guerreiro.defesa} de dano.)")
            }
        },
        teclado = object : Teclado {
            override val teclasDisponiveis: List<Char>
                get() = listOf('w', 's', 'd', 'a', 'e')

            override fun pressionarTecla(tecla: Char) {
                if(tecla !in teclasDisponiveis) {
                    println("Tecla inválida!")
                    return
                }
                println(when(tecla) {
                    'w' -> "cima"
                    's' -> "baixo"
                    'd' -> "direita"
                    'a' -> "esquerda"
                    'e' -> "super ataque com espada"
                    else -> {}
                })
            }
        })

    val controleMago = Controle(
        mouse = object : Mouse() {
            override fun cliqueEsquerdo() {
                println("Usar magia para atacar(${mago.dano} de dano.)")
            }

            override fun cliqueDireito() {
                println("Usar magia para atacar(${mago.defesa} de dano.)")
            }
        },
        teclado = object : Teclado {
            override val teclasDisponiveis: List<Char>
                get() = listOf('w', 's', 'd', 'a', 'e', 'q')

            override fun pressionarTecla(tecla: Char) {
                when (tecla) {
                    'w' -> println("cima")
                    's' -> println("baixo")
                    'd' -> println("direita")
                    'a' -> println("esquerda")
                    'e' -> println("super ataque com magia")
                    'q' -> println("voar")
                }
            }
        })

    controleGuerreiro.mouse.cliqueDireito()
    controleGuerreiro.teclado.pressionarTecla('w')
}