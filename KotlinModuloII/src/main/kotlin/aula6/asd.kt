package aula6

open class Carro1( val marca: String,
                   val modelo: String,
                   val ano: Int,
                   val potenciaCv: Int
                   ){
    fun descricao() {
        println("O carro é da marca $marca, modelo $modelo, ano $ano e possui $potenciaCv cv de potencia")
    }
}

class Up: Carro1(marca = "Volkaswagem", modelo = "Up", ano = 2018, potenciaCv = 200)

fun main() {

    val meuUp = Up()
    

}

