package devSuperior

fun main() {

    val funcionario1 = Funcionario()
    val funcionario2 = Funcionario()
    println("Dados do primeiro funcionário: ")
    funcionario1.nome = readln()
    funcionario1.valorPorHora = readln().toDouble()
    funcionario1.horas = readln().toInt()

    println("Dados do segundo funcionário: ")
    funcionario2.nome = readln()
    funcionario2.valorPorHora = readln().toDouble()
    funcionario2.horas = readln().toInt()

    val total = funcionario1.total() + funcionario2.total()
    println("Total = R$ $total")

}