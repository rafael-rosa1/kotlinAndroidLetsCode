fun main() {

    println("Digite um número:")
    val tabuada = readln().toInt()

    println("Tabuada do $tabuada")

    for (i in 1..10) {
        println("$i x $tabuada = ${i*tabuada}")
    }
}