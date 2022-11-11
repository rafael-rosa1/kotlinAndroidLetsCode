fun main() {

    println("Digite o valor da base do triangulo:")
    val base: Double = readln().toDouble()

    println("Digite a altura do triangulo")
    val altura: Double = readln().toDouble()

    val area = (base*altura)/2

    println("O triangulo de base $base e altura $altura tem area igual a $area")

}