package Aula1.Exercicio1



class Empresa(val nome: String, val cnpj: String) {

    val funcionarios: MutableList<Funcionario2> = mutableListOf()

    fun adicionaFuncionario(funcionario: Funcionario2) {
        funcionarios.add(funcionario)
    }

    fun listaFuncionarios() {
        funcionarios.forEach { it ->
            println("$it\n")
        }
    }

    override fun toString(): String {
        return """
            $nome - CNPJ: $cnpj
        """.trimIndent()
    }
}