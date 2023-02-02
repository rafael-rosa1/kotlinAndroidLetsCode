package aula3

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {

    println(2.dobrar())
    println(2.somar(2))
    println("+Rafael".removePrimeiro())

    val hoje = LocalDate.now()

    println(hoje.ontem())
    println(hoje.yesterday().formatador)
    println(hoje.amanha())
    println(hoje.tomorrow().formatador)

    val listaTroca = mutableListOf("Rafael", "Valentina", "Pepe")
    listaTroca.troca(0, 1)
    println(listaTroca)

    val listaString = listOf("abluajsaoidjaoshd", "bla", "blablabla", "bl", "sioadjhioasjdoiajosdjajsidjoaij")
    listaString.maior()
    println(listaString.maiorItem())
}

fun Int.dobrar(): Int = this * 2

fun Int.somar(valor: Int): Int = this + valor

fun String.removePrimeiro() : String = this.drop(1)


fun LocalDate.ontem(): DayOfWeek {
    return plusDays(-1).dayOfWeek
}

fun LocalDate.amanha():DayOfWeek{
    return this.plusDays(1).dayOfWeek
}

fun LocalDate.yesterday(): LocalDate {
    return this.plusDays(-1)
}

fun LocalDate.tomorrow():LocalDate{
    return this.plusDays(1)
}

val LocalDate.formatador: String
    get() = this.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))

fun <T> MutableList<T>.troca(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

fun List<String>.maior() {
    var maior = this[0]
    for(item in this) {
        if(item.length > maior.length) {
            maior = item
        }
    }
    println(maior)
}

//solução raiara maria documentação
fun List<String>.maiorItem() = this.maxBy { it.length }


