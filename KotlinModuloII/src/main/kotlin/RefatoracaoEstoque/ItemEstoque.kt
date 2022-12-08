package RefatoracaoEstoque


class ItemEstoque(var nomeItem: String, var quantidade: Int) {

    init {
        if(quantidade > 999) {
            println("Quantidade maior que o permitido")
            quantidade = 999
        }
    }

    val id: Int
        get() = Estoque().listaEstoque.indexOf(ItemEstoque(nomeItem, quantidade)) + 1

    override fun toString(): String {
        return """
            "#$id | $nomeItem | $quantidade"
        """.trimIndent()
    }

    class Estoque() {
        val listaEstoque: MutableList<ItemEstoque> = mutableListOf()

        fun adicionaItem(item: ItemEstoque) {
            listaEstoque.add(item)
        }

        fun editaItem(id: Int, novoNome: String, novaQtde: Int) {
            listaEstoque[id - 1].nomeItem = novoNome
            listaEstoque[id - 1].quantidade = novaQtde
        }

        fun exibirEstoque() {
           val temNoEstoque = listaEstoque.filter {
               it.quantidade != 0
            }
            println(temNoEstoque)
        }

        fun exibirTodos() {
            listaEstoque.forEach {
                println(it)
            }
        }
    }
}

