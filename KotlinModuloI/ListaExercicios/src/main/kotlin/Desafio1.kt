fun main() {

    val menuPrincipal = """
        1..................Pães
        2..............Salgados
        3.................Doces
        0......Finalizar compra
    """.trimIndent()

    val menuPaes = """
        1 - Pão Francês...........R${'$'} 0,60
        2 - Pão de Leite..........R${'$'} 0,40
        3 - Pão de Milho..........R${'$'} 0,50
        0 - Voltar
    """.trimIndent()

    val menuSalgados = """
        1 - Coxinha...........R${'$'} 5,00
        2 - Esfiha..........R${'$'} 6,00
        3 - Pão de Queijo..........R${'$'} 3,00
        0 - Voltar
    """.trimIndent()

    val menuDoces = """
        1 - Carolina...........R${'$'} 1,50
        2 - Pudim..........R${'$'} 4,00
        3 - Brigadeiro..........R${'$'} 2,00
        0 - Voltar
    """.trimIndent()

    println(menuPrincipal)
    println("Escolha uma das opções do cardápio:")
    val escolhaMenuPrincipal = readln().toInt()
    when(escolhaMenuPrincipal) {
        1 -> println(menuPaes)
        2 -> println(menuSalgados)
        3 -> println(menuDoces)
        0 -> println("Compra Finalizada")
    }

    






}