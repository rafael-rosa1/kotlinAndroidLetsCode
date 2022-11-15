fun main() {
    println("Qual o número total de eleitores?")
    val eleitores = readln().toInt()

    var candidatoA = 0
    var candidatoB = 0
    var candidatoC = 0
    var totalVotos = eleitores
    do {
        println("Escolha um dos candidatos [A, B ou C]")
        val voto = readln().uppercase()
        when(voto) {
            "A" -> candidatoA++
            "B" -> candidatoB++
            "C" -> candidatoC++
        }
        totalVotos--
    } while (totalVotos != 0)

    println("""
        Candidato A - $candidatoA votos (${candidatoA.toDouble()/eleitores*100}%)
        Candidato B - $candidatoB votos (${candidatoB.toDouble()/eleitores*100}%)
        Candidato C - $candidatoC votos (${candidatoC.toDouble()/eleitores*100}%)
    """.trimIndent())
}