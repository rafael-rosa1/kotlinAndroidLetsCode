import aula7.exercicio.Digital
import aula7.exercicio.Fisica

abstract class Carteira {
    protected var saldo: Double = 0.0
    protected var poupanca: Double = 0.0
    protected var investimento: Double = 0.0
    fun pagarBoleto(valor: Double) {
        if(valor <= saldo) {
            saldo -= valor
            println("Boleto Pago com sucesso")
        } else {
            println("Saldo insuficiente")
        }
    }

    fun consultaSaldo(): Double {
        return saldo
    }
    fun adicionaSaldo(valor: Double) {
        saldo += valor
    }
}
 open class CarteiraFisica() : Carteira(), Fisica {
    override fun deposito(valor: Double) {
        saldo += valor
        println("Deposito realizado com sucesso - R$ $valor")
    }

    override fun saque(valor: Double) {
        if(valor <= saldo) {
            saldo -= valor
            println("Saque realizado com sucesso")
        } else {
            println("Saldo insuficiente")
        }
    }
}

open class CarteiraDigital() : Carteira(), Digital {
    override fun transferenciaPix(valor: Double, conta: Carteira) {
        if(valor <= saldo) {
            saldo -= valor
            conta.adicionaSaldo(valor)

        } else {
            println("Saldo insuficiente - R$ $saldo")
        }
    }

    override fun investir(valor: Double) {
        if(valor <= saldo) {
            saldo -= valor
            investimento += valor
        }
    }

    override fun guardar(valor: Double) {
        saldo -= valor
        poupanca += valor
    }

}

open class CarteiraPremium() : Carteira(), Fisica, Digital {
    override fun deposito(valor: Double) {
        saldo += valor
        println("Deposito realizado com sucesso - R$ $valor")
    }

    override fun saque(valor: Double) {
        if(valor <= saldo) {
            saldo -= valor
            println("Saque realizado com sucesso")
        } else {
            println("Saldo insuficiente")
        }
    }

    override fun transferenciaPix(valor: Double, conta: Carteira) {
        if(valor <= saldo) {
            saldo -= valor
            conta.adicionaSaldo(valor)
        } else {
            println("Saldo insuficiente - R$ $saldo")
        }
    }

    override fun investir(valor: Double) {
        if(valor <= saldo) {
            saldo -= valor
            investimento += valor
        }
    }

    override fun guardar(valor: Double) {
        saldo -= valor
        poupanca += valor
    }
}