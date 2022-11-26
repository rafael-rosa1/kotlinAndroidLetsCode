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
    var escolhaMenuPrincipal: Int
    try {
        do {
            println(menuPrincipal)
            println("ESCOLHA UMA OPÇÃO")

            escolhaMenuPrincipal = readln().toInt()
            when (escolhaMenuPrincipal) {
                1 -> adicionarItem(ID)
                2 -> editarItem()
                3 -> exibirItensEmEstoque()
                4 -> exibirTodosOsItens()
                0 -> println("Fechando sistema")
                else -> println("OPÇÃO INVÁLIDA TENTE NOVAMENTE")
            }
        } while (escolhaMenuPrincipal != 0)
    }catch (e: NumberFormatException) {
        println("Erro: Escolha uma das opções do menu principal")
        estoqueMecanica()
    }

}

fun editarItem() {
    try {
    println("Digite o ID do produto a ser editado")
    var idEditar = readln().toInt()
    if (idEditar > itensEstoque.size) throw IndexOutOfBoundsException()
    idEditar--
        println("Editar nome ou quantidade? (NOME/QTDE)")
        val escolhaEdicao = readln().uppercase()
        when(escolhaEdicao) {
            "NOME" -> {
                try {
                    println("Digite o novo nome:")
                    val novoNome = readln()
                    if(novoNome == "") throw NullPointerException()
                    itensEstoque[idEditar] = itensEstoque[idEditar].copy(second = novoNome)
                } catch (e: NullPointerException) {
                    println("Erro: Digite o nome da peça")
                }

            }
            "QTDE" -> {
                try {
                    println("Digite a nova quantidade:")
                    val novaQuantidade = readln().toInt()
                    if (erroLimiteEstoque(novaQuantidade)) return
                    itensEstoque[idEditar] = itensEstoque[idEditar].copy(third = novaQuantidade)
                } catch (e: NumberFormatException) {
                    println("Erro: Quantidade precisa ser um numero inteiro")
                }
            }
            else -> println("Opção Inválida, USE NOME OU QTDE")
        }
    }catch (e: java.lang.IndexOutOfBoundsException) {
        println("Erro: ID não encontrado no estoque!")
        return
    } catch (e: NumberFormatException) {
        println("Erro: ID precisa ser um número inteiro!")
        return
    }


}

private fun erroLimiteEstoque(quantidade: Int): Boolean {
    try {
        if (quantidade > 999) throw LimiteEstoqueMaxException()
    } catch (e: LimiteEstoqueMaxException) {
        println("Erro: Limite de estoque excedido. (Máx: 999)")
        return true
    } catch (e: NumberFormatException) {
        println("Erro: Quantidade precisa ser um numero inteiro")
    }
    return false
}

fun adicionarItem(id: Int) {

    try {
        println("Digite o nome da peça:")
        val nomePeca = readln()
        if (nomePeca == "") throw NullPointerException()
        println("Digite a quantidade:")
        val qtdePeca = readln().toInt()
        if (erroLimiteEstoque(qtdePeca)) return
        val item = Triple(id, second = nomePeca, third = qtdePeca)
        itensEstoque.add(item)
        ID++
    } catch (e: NumberFormatException) {
        println("Erro: Quantidade precisa ser um numero inteiro")
    } catch (e: NullPointerException) {
        println("Erro: Digite o nome da peça")
    }


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

class LimiteEstoqueMaxException : Exception() {
    override fun getLocalizedMessage(): String {
        return "Erro: Limite de estoque excedido. (Máx: 999)"
    }
}