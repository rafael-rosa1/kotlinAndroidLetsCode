package monitoria

fun main() {

//    val nome: String = "Rafael"
//    val sobrenome: String = "Rosa"
//
//    println(nome.concatena(sobrenome))

    val menu = listOf("1 - Salgado", "2 - Doce")

}

//fun String.concatena(string2: String): String {
//    return "$this $string2"
//}

data class Produto(
    val id: Int,
    val nome: String,
    val valor: Int
)

data class Pedido(
    val produtos: MutableList<Produto> = mutableListOf()
)

private fun criaListaSalgados() : List<Produto> {
    return listOf(
        Produto(1, "Coxinha", 1),
        Produto(2, "Kibe", 3),
        Produto(3, "Esfiha", 5)
    )
}

private fun criaListaDoces() : List<Produto> {
    return listOf(
        Produto(1, "Brigadeiro", 2),
        Produto(2, "Bala", 1),
        Produto(3, "Pirulito", 1)
    )
}
