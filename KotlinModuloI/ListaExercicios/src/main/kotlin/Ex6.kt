fun main() {

    val numeros: MutableList<Int> = mutableListOf()

    while(numeros.size < 10) {
        println("Informe um número")
        val input = readln().toInt()
        numeros.add(input)
    }

    var maior = Int.MIN_VALUE
    var menor = Int.MAX_VALUE

    for(numero in numeros) {
        if(numero > maior) {
            maior = numero
        } else if( numero < menor) {
            menor = numero
        }
    }

    println("O maior valor é $maior e o menor valor é $menor")
}