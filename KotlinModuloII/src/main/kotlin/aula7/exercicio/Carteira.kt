package aula7

abstract class Carteira(var senha: Int, val saldo: Double, val extrato: String)

interface CarteiraFisica{
    fun deposito()
    fun saque()
    fun pagarBoleto()
}

interface CarteiraDigital{
    fun transferenciaPix()
    fun pagarBoleto()
    fun investir()
    fun guardar()
}
