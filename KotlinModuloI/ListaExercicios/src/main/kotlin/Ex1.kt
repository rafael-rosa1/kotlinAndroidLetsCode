fun main() {
    println("Digite sua idade:")
    val idade = readln().toInt()

    val idadeEmMeses = idade * 12
    val idadeEmDias = idade * 365
    val idadeEmHoras = idadeEmDias * 24
    val idadeEmMinutos = idadeEmHoras * 60

    println("Sua idade equivale a:")
    println(
        """
        $idadeEmMeses meses
        $idadeEmDias dias
        $idadeEmHoras horas
        $idadeEmMinutos minutos
    """.trimIndent()
    )
}