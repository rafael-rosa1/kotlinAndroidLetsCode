package Aula2.Exemplos2

class Retangulo(val comprimento: Double, larguraInicial: Double) {

    var largura: Double = larguraInicial
    set(value) {
        field = if(value > 0) value else 0.0
    }

    val area: Double
        get() = comprimento*largura

    fun calculaVolume() {
        //o parametro larguraInicial não pode ser usado diretamente dentro do escopo da classe
    }
}

fun main() {

    val meuRetangulo = Retangulo(10.0, -2.0)
    //set ainda nao entrou em ação largura não mudou pra zero
    println(meuRetangulo.largura)
    meuRetangulo.largura = -2.0
    // agora o set (=) entrou em ação o valor de largura será zero

    println(meuRetangulo.largura)
}