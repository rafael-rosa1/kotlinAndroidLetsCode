fun main() {

    println("Digite a primeira nota");
    val nota1: Double = readln().toDouble()
    println("Digite a segunda nota");
    val nota2: Double = readln().toDouble()
    println("Digite a terceira nota");
    val nota3: Double = readln().toDouble()
    println("Digite a quarta nota");
    val nota4: Double = readln().toDouble()
    println("Digite a quinta nota");
    val nota5: Double = readln().toDouble()

    val media = (nota1+nota2+nota3+nota4+nota5)/5

    print("A media da turma foi: $media")

}