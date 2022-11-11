fun main() {
//    Exercicios:
//
//    1 - Fa?a um algoritimo que receba o comprimento do lado de um
//    quadrado e calcule sua ?rea e seu per?metro.
//
//    Exemplo:
//
//    Digite o lado do do quadrado:
//    12
//    A area do quadrado e de 144 e seu perimetro de 48

    println("Digite o lado do quadrado:")
    val lado: Double = readln().toDouble()

    val area = lado*lado

    val perimetro = lado*4

    println("A área do quadrado é $area e o perimetro é $perimetro")
}