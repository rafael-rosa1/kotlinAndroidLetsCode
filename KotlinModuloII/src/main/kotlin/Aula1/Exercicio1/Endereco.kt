package Aula1.Exercicio1

import kotlin.math.log

class Endereco(val logradouro: String, val bairro: String, val numero: Int) {
    override fun toString(): String {
        return """ Rua: $logradouro, $numero - $bairro"""
    }
}