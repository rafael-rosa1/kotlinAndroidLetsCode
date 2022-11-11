fun main() {

    println("Digite seu nome:")
    val nome = readln()

    println("Digite seu sobrenome:")
    val sobrenome = readln()

    println("Digite seu ano de nascimento:")
    val anoNascimento = readln().toInt()

    val doisPrimeirosDigitosNome = nome.substring(0,2)

    val sobrenomeReverso = sobrenome.reversed()

    val doisUltimosDigitosNascimento = anoNascimento.toString().takeLast(2)

    val nick = "$doisPrimeirosDigitosNome$sobrenomeReverso$doisUltimosDigitosNascimento"

    println("Nick gerado: ${nick.lowercase()}")
}