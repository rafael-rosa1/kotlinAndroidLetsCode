fun main() {
    var listaNumeros: MutableList<Int> = mutableListOf()

    while(listaNumeros.size < 15) {
        println("Informe um n�mero")
        val numero = readln().toInt()
        listaNumeros.add(numero)
    }

    println(listaNumeros.reversed())
}