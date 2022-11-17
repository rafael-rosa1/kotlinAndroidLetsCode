private const val PAES = 1
private const val SALGADOS = 2
private const val DOCES = 3

private const val LINHA = "..............."
fun main() {

    val valorPaoFrances = 0.60
    val valorPaoDeLeite = 0.40
    val valorPaoDeMilho = 0.50

    val produtoPaoFrances = "Pão Francês"
    val produtoPaoDeLeite = "Pão de Leite"
    val produtoPaoDeMilho = "Pão de Milho"

    val menuPrincipal = """
        1..................Pães
        2..............Salgados
        3.................Doces
        0......Finalizar compra
    """.trimIndent()

    val menuPaes = """
        1 - $produtoPaoFrances...........R$ $valorPaoFrances
        2 - $produtoPaoDeLeite..........R$ $valorPaoDeLeite
        3 - $produtoPaoDeMilho..........R$ $valorPaoDeMilho
        0 - Voltar
    """.trimIndent()

    val menuSalgados = """
        1 - Coxinha...........R$ 5,00
        2 - Esfiha..........R$ 6,00
        3 - Pão de Queijo..........R$ 3,00
        0 - Voltar
    """.trimIndent()

    val menuDoces = """
        1 - Carolina...........R$ 1,50
        2 - Pudim..........R$ 4,00
        3 - Brigadeiro..........R$ 2,00
        0 - Voltar
    """.trimIndent()

    val itensComanda = mutableListOf<String>()
    var total: Double = 0.0

    println("BEM VINDO A PARADARIA E-PADOCA!!!!")
    do {
        println(menuPrincipal)
        println("Escolha uma das opções do cardápio:")
        val escolhaMenuPrincipal = readln().toInt()
        when (escolhaMenuPrincipal) {
            PAES -> {
                do {
                    println(menuPaes)
                    val escolhaMenuPaes = readln().toInt()

                    when (escolhaMenuPaes) {
                        1 -> {
                            println("Quantos vai querer?")
                            val quantidade = readln().toInt()
                            val totalItem = quantidade * valorPaoFrances
                            val item =
                                "${itensComanda.size.inc()}$LINHA$produtoPaoFrances$LINHA$quantidade$LINHA$valorPaoFrances" +
                                        "${LINHA}R$$totalItem"
                            itensComanda.add(item)
                            total += totalItem
                        }
                        2 -> {
                            println("Quantos vai querer?")
                            val quantidade = readln().toInt()
                            val totalItem = quantidade * valorPaoDeLeite
                            val item =
                                "${itensComanda.size.inc()}$LINHA$produtoPaoDeLeite$LINHA$quantidade$LINHA$valorPaoDeLeite" +
                                        "${LINHA}R$$totalItem"
                            itensComanda.add(item)
                            total += totalItem
                        }
                        3 -> {
                            println("Quantos vai querer?")
                            val quantidade = readln().toInt()
                            val totalItem = quantidade * valorPaoDeMilho
                            val item =
                                "${itensComanda.size.inc()}$LINHA$produtoPaoDeMilho$LINHA$quantidade$LINHA$valorPaoDeMilho" +
                                        "${LINHA}R$$totalItem"
                            itensComanda.add(item)
                            total += totalItem
                        }
                        else -> Unit
                    }
                } while (escolhaMenuPaes != 0)
            }
            SALGADOS -> {
                println(menuSalgados)
            }
            DOCES -> {
                println(menuDoces)
            }
            else -> Unit
        }
    } while (escolhaMenuPrincipal != 0)

    itensComanda.forEach {item ->
        println(item)
    }
    println("Valor total R$$total")
}