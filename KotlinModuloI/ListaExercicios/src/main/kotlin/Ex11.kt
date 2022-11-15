fun main() {

    println("Informe um número e descubra todos os números primos de 1 até ele:")
    val numeroFinal = readln().toInt()
    var primo: Boolean = false

    for (i in 1..numeroFinal) {
        if (i == 1) {
            primo = false
        } else if (i == 2) {
            primo = true
        } else {
            primo = true
            for (j in 2 until i) {
                if (i % j == 0) {
                    primo = false
                }
            }
        }
        if (primo) println(i)
    }
}
