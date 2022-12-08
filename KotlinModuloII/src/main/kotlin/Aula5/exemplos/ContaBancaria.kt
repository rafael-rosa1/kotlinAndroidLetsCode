package Aula5.exemplos

import java.text.NumberFormat
import java.util.*



class ContaBancaria{
    var saldo: Double = 100.0
        private set

    fun depositar(valor: Double) {
        saldo += valor
    }

    fun sacar(valor: Double) {
        if(valor > saldo) {
            println("Saldo insuficiente. (Saldo = ${saldo.formataMonetario()})")
            return
        } else {
            saldo -= valor
        }
    }
}

fun Double.formataMonetario(): String {
    return NumberFormat.getCurrencyInstance(Locale.getDefault()).format(this)
}


fun main() {

    val minhaContaBancaria = ContaBancaria()
    with(minhaContaBancaria) {
        println("O meu saldo é ${saldo.formataMonetario()}")
        depositar(100.0)
        sacar(1000.0)
        println("O meu saldo é ${saldo.formataMonetario()}")
    }
}