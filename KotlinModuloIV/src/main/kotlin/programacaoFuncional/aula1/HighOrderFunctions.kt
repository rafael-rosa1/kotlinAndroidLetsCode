package programacaoFuncional.aula1

fun main() {
    mostraSoma(::somar)

    val calc = calculadora(20.0,10.0, dividir)
    val calc2 = calculadora(20.0,10.0, subtrair)
    println(calc)
    println(calc2)
}

fun somar(a: Int, b: Int): Int {
    val somar = a + b
    return somar
}

fun mostraSoma(s:(Int, Int) -> Int) {
    val resultado = s(20, 10)
    println(resultado)
}

//FunctionType
val dividir: (Double, Double) -> Double = {x, y -> x/y}
val subtrair: (Double, Double) -> Double = {x, y -> x-y}

//Aplicar a HOF
fun calculadora(x: Double, y: Double, operacao:(Double, Double) -> Double): Double {
    return operacao(x, y)
}


