package poo_andre

fun main() {
    val controller = MercadoController(mutableListOf<Produto>(), Carrinho(mutableListOf<Produto>()))
    controller.abrirMercado()
}

class MercadoController(var produtosDisponiveis: MutableList<Produto>, val carrinho: Carrinho) {

    fun abrirMercado() {
        println("Bem-vindo Ao MercadoPreso!")
        reestocar()
        mostrarProdutos()
    }

    private fun mostrarProdutos() {
        for(produto in produtosDisponiveis) {
            println("${produtosDisponiveis.indexOf(produto)} -> R$ ${produto.preco} - ${produto.nome}")
        }
        selecionaProduto()
    }

    private fun selecionaProduto() {
        println("Deseja adicionar qual produto ao seu carrinho?")
        var indiceProduto = readln().toInt()

        if (produtosDisponiveis.size > indiceProduto && indiceProduto >= 0) {
            carrinho.adicionaProduto(produtosDisponiveis[indiceProduto])
        } else {
            println("Você não digitou um índice válido de produto.")
            selecionaProduto()
            return
        }
        checkout()
    }

    private fun checkout() {
        var total = 0.0

        for(produto in carrinho.produtos) {
            total += produto.preco
        }

        println("Parabéns, você deixou R$total do seu salário suado com a gente!!")
    }

    private fun reestocar() {
        val produtoUm = ProdutoDeLimpeza(
            1.50,
            "NaoVeja",
            "Limpados multiuso",
            "123",
            2.0
        )

        val produtoDois = Brinquedo(
            300.0,
            "Carrinho Cold Wheels",
            "blabla",
            "789456",
            1.93
        )

        produtosDisponiveis = mutableListOf(produtoUm, produtoDois)
    }

}

class Carrinho(var produtos: MutableList<Produto>) {
    fun adicionaProduto(produto: Produto) {
        produtos.add(produto)
    }

    fun removeProduto(produto: Produto) {
        produtos.remove(produto)
    }
}

open class Produto(
    var preco: Double,
    val nome: String,
    val desc: String,
    val codigo: String
) {}

class ProdutoDeLimpeza(
    preco: Double,
    nome: String,
    desc: String,
    codigo: String,
    val coefLimpeza: Double) : Produto(preco, nome, desc, codigo) {}

class Brinquedo(
    preco: Double,
    nome: String,
    desc: String,
    codigo: String,
    val coefDiversao: Double) : Produto(preco, nome, desc, codigo) {}