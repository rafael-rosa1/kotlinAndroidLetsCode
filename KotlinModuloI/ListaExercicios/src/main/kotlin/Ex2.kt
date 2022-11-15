fun main() {
    println("Qual seu ano de nascimento?")
    val anoNascimento = readln().toInt()
    println("Em qual ano estamos?")
    val anoAtual = readln().toInt()

    val idade = anoAtual - anoNascimento
    val idadeEmSemanas = idade * 52

    println("Você tem $idade anos, você já viveu aproximadamente $idadeEmSemanas semanas.")
}