package aula7.exercicio

import Cliente
import ClienteDigital
import ClienteNormal
import ClientePremium

fun main() {

    val clienteNormal = ClienteNormal("Rafael", "Rosa", "12323", senha = 1234)

    clienteNormal.carteiraFisica.deposito(100.0)
    clienteNormal.carteiraFisica.saque(50.0)
    clienteNormal.carteiraFisica.pagarBoleto(40.0)
    println(clienteNormal.carteiraFisica.consultaSaldo())

    val clienteDigital = ClienteDigital("Valentina", "Rosa", "123123213", 12345)
    val clientePremium = ClientePremium("Pedro", "Rosa", "1112323", 123123)
    clienteDigital.carteiraDigital.adicionaSaldo(100.0)
    clienteDigital.carteiraDigital.transferenciaPix(50.0, clientePremium.carteiraPremium)

    println(clienteDigital.carteiraDigital.consultaSaldo())
    println(clientePremium.carteiraPremium.consultaSaldo())

}