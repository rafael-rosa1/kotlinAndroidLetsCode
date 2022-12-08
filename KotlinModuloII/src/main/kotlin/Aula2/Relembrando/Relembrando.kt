package Aula2.Relembrando

class Funcionario3(
    val nome: String,
    val sobrenome: String,
    var cargo: String,
    var salario: Double
) {
    override fun toString(): String {
        return """
            Funcionario(nome=$nome, sobrenome=$sobrenome, cargo=$cargo, salario=$salario)
        """.trimIndent()
    }
}

class Empresa(
    val nome: String,
    val cnpj: String,
    val segmento: String,
    private val listaFuncionarios: MutableList<Funcionario3> = mutableListOf()
) {

    fun inserirFuncionario(funcionario: Funcionario3) {

        listaFuncionarios.add(funcionario)

    }

    fun mostrarFuncionarios() {
        println("mostrarFuncionarios = ${listaFuncionarios.toList()}")
    }

    fun removerFuncionario(nome: String, sobrenome: String) {
        val retornoDaBusca = buscaFuncionariosNaLista(nome, sobrenome)
        val retornoDaRemocao: Boolean = listaFuncionarios.remove(retornoDaBusca)

        if(retornoDaRemocao) {
            println("Funcionário removido com sucesso")
        } else {
            println("Funcionário não se encontrava na lista")
        }
    }

    private fun buscaFuncionariosNaLista(nome: String, sobrenome: String) =
        listaFuncionarios.find { it ->
        it.nome == nome && it.sobrenome == sobrenome
    }

    fun modificarFuncionario(nome: String, sobrenome: String, novoCargo: String, novoSalario: Double) {
        val funcionarioASerModificado = buscaFuncionariosNaLista(nome, sobrenome)
        funcionarioASerModificado?.let {
            it.cargo = novoCargo
            it.salario = novoSalario
        }
    }

}

fun main() {

    val santander = Empresa("Santander", "123872918037", "Banco")

    val joaoDaSilva = Funcionario3("João", "da Silva", "Gerente", 6000.0)

    santander.inserirFuncionario(joaoDaSilva)
    santander.mostrarFuncionarios()
    santander.modificarFuncionario("João", "da Silva", "Diretor de Vendas", 10000.0)
    santander.mostrarFuncionarios()
//    santander.removerFuncionario("João", "da Silva")
}