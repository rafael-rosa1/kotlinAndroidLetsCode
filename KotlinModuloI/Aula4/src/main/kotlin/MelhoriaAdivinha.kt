fun main() {

    var continuar = false
    var tentativas = 0
    var qtdeJogos = 1
    val listaNumerosSecretos: MutableList<Int> = mutableListOf()

    do {
        println("Digite o número minimo")
        val min = readln().toInt()
        println("Digite o número máximo")
        val max = readln().toInt()

        val randomNumber = (min..max).random()
        listaNumerosSecretos.add(randomNumber)

        do {
            println("Tente adivinhar o número gerado")
            val number = readln().toInt()
            tentativas++
            when {
                number > randomNumber -> println("tente um número menor")
                number < randomNumber -> println("tente um número maior")
                else -> println(
                    """
                    Você acertou!!!
                    Número secreto: $randomNumber
                """.trimIndent()
                )
            }

        } while (number != randomNumber)

        println("Quer continuar? [S/N]")
        val escolha = readln().lowercase()
        continuar = escolha == "s"
        if(continuar) qtdeJogos++
    } while (continuar)
    println("""
        Total de jogos: $qtdeJogos
        Total jogadas: $tentativas
        Média de jogadas por partida: ${tentativas/qtdeJogos.toDouble()}
        Numeros secretos: $listaNumerosSecretos
    """.trimIndent())
}