fun main() {

    val divisor: MutableList<Int?> = mutableListOf()
    val dividendo: MutableList<Int?> = mutableListOf()

    repeat(3) {
        println("Digite o ${it.inc()} divisor")
        val entrada = readln().toIntOrNull()
        divisor.add(entrada)
    }

    repeat(3) {
        println("Digite o ${it.inc()} dividendo")
        val entrada = readln().toIntOrNull()
        dividendo.add(entrada)
    }

    for(i in dividendo.indices) {
        var dividido = dividendo[i]
        var divisor = divisor[i]
        try {

        println("O resultado da divisão entre $dividido e $divisor é: ${dividido!!/divisor!!}")
        } catch (e: ArithmeticException) {
            println("Não pode fazer divisão por zero")
        } catch (e: NullPointerException) {
            println("Nao podemos realizar a operação com nulos")
        } finally {
            println("Fim do laço")
        }
    }
}
