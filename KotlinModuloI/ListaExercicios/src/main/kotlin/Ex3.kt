fun main() {
    println("Informe sua idade:")
    val idade = readln().toInt()

    val categoria = when (idade) {
        in 5..7 -> "Infantil A"
        in 8..10 -> "Infantil B"
        in 11..13 -> "Juvenil A"
        in 14..17 -> "Juvenil B"
        else -> "maiores de 18 anos"
    }

    println("Você tem $idade anos, sua categoria é $categoria")
}