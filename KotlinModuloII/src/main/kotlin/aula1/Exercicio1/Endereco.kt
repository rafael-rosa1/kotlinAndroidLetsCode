package aula1.Exercicio1

class Endereco(val logradouro: String, val bairro: String, val numero: Int) {
    override fun toString(): String {
        return """ Rua: $logradouro, $numero - $bairro"""
    }
}