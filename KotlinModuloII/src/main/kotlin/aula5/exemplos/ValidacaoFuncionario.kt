package aula5.exemplos

import aula5.exemplos.Cargo.*

data class Empresa(val nome: String, val listaFuncionarios: MutableList<Funcionario> = mutableListOf()) {

    fun adicionaFuncionario(novoFuncionario: Funcionario) {
        listaFuncionarios.add(novoFuncionario)
    }

}

data class Funcionario(
    val nome: String,
    val sobrenome: String,
    val cpf: String,
    val telefone: String,
    val cargo: Cargo
)

enum class Cargo(val salario: Double) {
    DESCONHECIDO(0.0),
    VENDEDOR(salario = 2000.0),
    GERENTE(salario = 6000.0),
    DIRETOR(salario = 10000.0)
}

data class FormularioFuncionario(
    val nome: String,
    val sobrenome: String,
    val cpf: String,
    val telefone: String,
    val cargo: Cargo
)



fun FormularioFuncionario.validaFormulario(): Funcionario? {
    // se todos os campos estiverem validos retorna uma instância de Funcionario
    // se pelo menos um campo estiver invalido, retorna null

    fun formataCpf(): String {
        val padraoEsperado: Regex = "([0-9]{3})([0-9]{3})([0-9]{3})([0-9]{2})".toRegex()
        val padraoFormatado = "$1.$2.$3-$4"
        val cpfFormatado = this.cpf.replace(padraoEsperado, padraoFormatado)
        return cpfFormatado
    }

    fun formataTelefoneComDDD(): String {
        val padraoEsperado: Regex = "([0-9]{2})([0-9]{4,5})([0-9]{4})".toRegex()
        val padraoFormatado = "($1)$2-$3"
        val telefoneFormatado = this.telefone.replace(padraoEsperado, padraoFormatado)
        return telefoneFormatado
    }

    return Funcionario(
        nome = this.nome.ifBlank { return null },
        sobrenome = this.sobrenome.ifBlank { return null },
        cpf = if (this.cpf != formataCpf()) formataCpf() else { return null },
        telefone = if (this.telefone != formataTelefoneComDDD()) formataTelefoneComDDD() else { return null },
        cargo = if (this.cargo.ordinal != 0) this.cargo else { return null }
    )
}

fun main() {
    // solicitar o preenchimento do formulario por um usuario

    val empresa = Empresa("Santander")

    val formularioFuncionario = FormularioFuncionario(
        nome = "Rafael",
        sobrenome = "Rosa",
        cpf = "12345678900",
        telefone = "11930670202",
        cargo = VENDEDOR
    )

    val funcionarioValidado: Funcionario? = formularioFuncionario.validaFormulario()

    if(funcionarioValidado != null) {
        empresa.adicionaFuncionario(funcionarioValidado)
        println(empresa)
    } else {
        println("(!) Um ou mais campos do formulário foram inseridos de forma inválida!")
    }
}