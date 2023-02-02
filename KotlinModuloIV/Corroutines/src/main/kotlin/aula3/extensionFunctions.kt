package aula3

import java.text.DecimalFormat
import java.util.*

fun Exemplo.deForaDaClasse() {
    println("Função extendida de exemplo")
}

fun Int.quemEh(): Int {
    return this
}

fun Double.formatarReal(): String {
    val brazilianFormat = DecimalFormat.getCurrencyInstance(Locale("pt", "br"))
    return brazilianFormat.format(this)
}