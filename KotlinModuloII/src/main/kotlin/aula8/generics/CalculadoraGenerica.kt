package aula8.generics

abstract class CalculadoraGenerica<T>(val primeiroValor: T, val segundoValor: T) {
    abstract fun soma(): T
    abstract fun subtrai(): T
    fun descricaoValores() {
        println("Os dois valores ($primeiroValor e $segundoValor) são do tipo ${primeiroValor!!::class}")
    }
}


class CalculadoraString(primeiroValor: String, segundoValor: String) : CalculadoraGenerica<String>(
    primeiroValor,
    segundoValor
) {
    override fun soma(): String {
        return "$primeiroValor $segundoValor"
    }

    override fun subtrai(): String {
        return primeiroValor.replace(segundoValor, "")
    }
}

class CalculadoraInt(primeiroValor: Int, segundoValor: Int) : CalculadoraGenerica<Int>(
    primeiroValor,
    segundoValor
) {
    override fun soma(): Int {
        return primeiroValor.plus(segundoValor)
    }

    override fun subtrai(): Int {
        return primeiroValor.minus(segundoValor)
    }
}

fun main() {
    val minhaCalculadoraString = CalculadoraString("abcdef", "abc")
    with(minhaCalculadoraString) {
        println(primeiroValor)
        println(segundoValor)
        descricaoValores()
        println(soma())
        println(subtrai())

        val minhaCalculadoraInt = CalculadoraInt(2, 2)
        with(minhaCalculadoraInt) {
            println(primeiroValor)
            println(segundoValor)
            descricaoValores()
            println(soma())
            println(subtrai())
        }
    }
}