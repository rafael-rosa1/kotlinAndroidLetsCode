package Aula1.Exercicio1

import java.text.NumberFormat
import java.util.*

class Funcionario(
    val nome: String,
    val cpf: String,
    var endereco: Endereco,
    var email: String,
    var empresa: Empresa,
    var salario: Double,
    var cargo: String
) {

    init {
    empresa.adicionaFuncionario(this)
    }

    fun trocaCargo(novoCargo: String) {
        this.cargo = novoCargo
    }

    fun aumento10Porcento() {
        this.salario *= 1.1
    }

    fun diminuiSalario10PorCento() {
        this.salario *= 0.9
    }

    fun trocaEmpresa(novaEmpresa: Empresa) {
        this.empresa = novaEmpresa;
    }


    private val currencyFormatter = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"))
    override fun toString(): String {
        return """
            Nome: $nome
            CPF: $cpf
            Endereco: $endereco
            email: $email
            Empresa: $empresa
            Cargo: $cargo
            Salário: ${currencyFormatter.format(salario)}
        """.trimIndent()
    }


}