package aula4.extensao

data class Nota(val valor: Double, val valorMaximo: Double)

val List<Nota>.mediaPercentual : Double
    get() {
        var totalRecebido = 0.0
        var totalDistribuido = 0.0

        this.forEach {
            totalRecebido += it.valor
            totalDistribuido += it.valorMaximo
        }
        return totalRecebido / totalDistribuido * 100
    }

fun main() {

    val listaNotas = listOf(
        Nota(6.5, 10.0),
        Nota(8.5, 15.0),
        Nota(2.5, 10.0),
        Nota(9.0, 20.0),
        Nota(10.0, 10.0),
    )

    println("A média percentual das notas é ${String.format("%.2f", listaNotas.mediaPercentual)}%.")
}