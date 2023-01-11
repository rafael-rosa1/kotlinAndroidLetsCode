package aula7.exercicio

import Carteira
import Cliente

interface Fisica {
    fun deposito(valor: Double)
    fun saque(valor: Double)
}

interface Digital {
    fun transferenciaPix(valor: Double, conta: Carteira)
    fun investir(valor: Double)
    fun guardar(valor: Double)
}



