fun main() {
    val nomes: List<String> = listOf("Valentina", "Pepe", "Rafael", "Lucas")

//    nomes[0] = "Cabrita"

    val nomesMutaveis: MutableList<String> = mutableListOf("Valentina", "Pepe", "Rafael", "Lucas")

    println(nomesMutaveis)
    nomesMutaveis[0] = "Cabrita"
    println(nomesMutaveis)

//    val array: Array<String> = arrayOf("Valentina", "Pepe", "Rafael", "Lucas")

    for (nome in nomes) {
        println(nome)
    }

}