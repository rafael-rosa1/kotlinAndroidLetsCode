package aula5.exercicios

import aula5.exemplos.formataMonetario
import java.text.NumberFormat
import java.util.*

fun Double.formataMonetario(): String {
    return NumberFormat.getCurrencyInstance(Locale.getDefault()).format(this)
}

class Cliente2(val nome: String, val sobrenome: String, private var senha: Int) {

    private var saldo = 0.0
    fun buscarSaldo(): Double {
        return saldo
    }

    fun depositar(valor: Double) {
        saldo += valor
    }

    fun sacar(valor: Double) {
        if (valor > saldo) {
            println("Saldo insuficiente. (Saldo = ${saldo.formataMonetario()}")
        } else {
            saldo -= valor
        }
    }

    inner class Carteira2(private var senhaDaCarteira: Int) {

        var saldoCarteira: Double = saldo

        val chavesPix: MutableList<String> = mutableListOf()

        fun criarChavePix(chavePix: String) {
            if (chavesPix.size >= 3) {
                println("Máximo de chaves pix atingido")
            } else {
                chavesPix.add(chavePix)
            }
        }

        fun enviarPix(valor: Double) {
            if (valor > saldoCarteira) {
                println("Saldo insuficiente. (Saldo = ${saldoCarteira.formataMonetario()}")
            } else {
                saldoCarteira -= valor
                saldo = saldoCarteira
            }
        }

        fun receberPix(valor: Double) {
            saldoCarteira += valor
            saldo = saldoCarteira
        }
    }
}

fun main() {
    val clienteRafael = Cliente2("Rafael", "Rosa", 123456)

    val carteiraRafael = clienteRafael.Carteira2(123456)


    println(clienteRafael.buscarSaldo().formataMonetario())
    println(carteiraRafael.saldoCarteira)
    clienteRafael.depositar(100.0)
    println(clienteRafael.buscarSaldo().formataMonetario())
    println(carteiraRafael.saldoCarteira)
    clienteRafael.sacar(50.0)
    println(clienteRafael.buscarSaldo().formataMonetario())
    println(carteiraRafael.saldoCarteira)

    carteiraRafael.criarChavePix("rafael@gmail.com")
    carteiraRafael.criarChavePix("rafael@gmail.com")
    carteiraRafael.criarChavePix("rafael@gmail.com")
    carteiraRafael.criarChavePix("rafael@gmail.com")
    println(carteiraRafael.chavesPix)

    carteiraRafael.receberPix(100.0)

    println(clienteRafael.buscarSaldo().formataMonetario())
    println(carteiraRafael.saldoCarteira)


}