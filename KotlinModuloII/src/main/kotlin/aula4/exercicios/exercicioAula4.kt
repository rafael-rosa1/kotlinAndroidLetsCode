package aula4.exercicios

fun Boolean.traduz() {
    if(this) {
        println("Verdade verdadeira")
    } else {
        println("Lenda Urbana")
    }
}

fun main() {

    val verdadeOuMentira = true

    verdadeOuMentira.traduz()
}

