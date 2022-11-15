fun main() {

    do {
        println("Informe uma nota entre zero e dez (0-10):")
        val nota = readln().toInt()
        if (nota !in 0..10) {
            println("Nota inválida!")
        } else {
            println("A note informada foi $nota")
        }
    } while (nota !in 0..10)
}