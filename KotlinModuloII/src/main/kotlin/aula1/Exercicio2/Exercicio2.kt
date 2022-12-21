package aula1.Exercicio2

fun main() {
    val cachorro = Animal(
        "Cachorro",
        "Vira-lata",
        "Caramelo",
        5
    )
    val audi = Carro(
        "Audi",
        "TT",
        2022,
        "vermelho"
    )
    val rafael = Pessoa(
        "Rafael",
        "Rosa",
        "12345678900",
        32,
        180,
        cachorro,
        audi
    )

    println(rafael)
}