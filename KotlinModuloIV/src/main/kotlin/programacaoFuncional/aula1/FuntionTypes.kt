package programacaoFuncional.aula1

fun main() {

    println(calculaDesconto(100.0, 10.0))

}

// calcula descontos
val calculaDesconto: (Double, Double) -> Double = { valor, desconto ->

    (desconto*valor)/100
}