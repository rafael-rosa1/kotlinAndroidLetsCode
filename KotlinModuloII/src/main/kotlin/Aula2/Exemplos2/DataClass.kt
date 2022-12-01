package Aula2.Exemplos2

data class Guerreiro(
    val nome: String,
    val vida: Int = 20,
    val nivel: NivelGuerreiro
)

class Guerreiro2(
    val nome: String,
    val vida: Int = 20,
    val nivel: String
)

fun main() {
    val guerreiro1 = Guerreiro2(nome = "El matador", nivel = "Soldado")
    val guerreiro2 = Guerreiro2(nome = "El matador", nivel = "Soldado")

//    val guerreiro2 = Guerreiro2(nome = "Zezinho Zica", nivel = "Newbie")

    println(guerreiro1.toString())
    println(guerreiro2.toString())
    println(guerreiro2.equals(guerreiro1))

}