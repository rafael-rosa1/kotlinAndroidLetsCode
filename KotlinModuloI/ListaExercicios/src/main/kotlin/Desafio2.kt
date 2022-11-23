private val menuPrincipal = """
    1 - ADICIONAR ITEM
    2 - EDITAR ITEM
    3 - EXIBIR ITENS EM ESTOQUE
    4 - EXIBIR TODOS OS ITENS
    0 - FECHAR SISTEMA
""".trimIndent()

val itensEstoque: MutableList<Triple<Int, String, Int>> = mutableListOf()
var ID = 1

fun main() {
    estoqueMecanica()
}

private fun estoqueMecanica() {
    do {
        println(menuPrincipal)
        println("ESCOLHA UMA OPÇÃO")
        val escolhaMenuPrincipal = readln().toInt()
        when (escolhaMenuPrincipal) {
            1 -> adicionarItem(ID)
            2 -> editarItem()
            3 -> exibirItensEmEstoque()
            4 -> exibirTodosOsItens()
            else -> println("Fechando sistema")
        }
    } while (escolhaMenuPrincipal != 0)
}

fun editarItem() {
    println("Digite o ID do produto a ser editado")
    var idEditar = readln().toInt()
    idEditar--
    println("Editar nome ou quantidade? (NOME/QTDE)")
    val escolhaEdicao = readln().uppercase()
    when(escolhaEdicao) {
        "NOME" -> {
            println("Digite o novo nome:")
            val novoNome = readln()
            itensEstoque[idEditar] = itensEstoque[idEditar].copy(second = novoNome)
        }
        "QTDE" -> {
            println("Digite a nova quantidade:")
            val novaQuantidade = readln().toInt()
            itensEstoque[idEditar] = itensEstoque[idEditar].copy(third = novaQuantidade)
        }
        else -> Unit
    }
}

fun adicionarItem(id: Int) {
    println("Digite o nome da peça:")
    val nomePeca = readln()
    println("Digite a quantidade:")
    val qtdePeca = readln().toInt()

    val item = Triple(id, second = nomePeca, third = qtdePeca)
    itensEstoque.add(item)
    ID++
}

fun exibirItensEmEstoque() {
    itensEstoque.forEach { item ->
        if (item.third > 0) {
            println("#${item.first} | ${item.second} | ${item.third}")
        }
    }
}

fun exibirTodosOsItens() {
    itensEstoque.forEach { item ->
        println("#${item.first} | ${item.second} | ${item.third}")
    }
}