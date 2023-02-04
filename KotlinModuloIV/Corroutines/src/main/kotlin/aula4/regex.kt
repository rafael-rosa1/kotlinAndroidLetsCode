package aula4

fun main() {
    println("------------------------------------")

    val patternCpf = Regex("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{2}")
    val cpfTest = "132.456.872-22"
    println("NumberTest: ${cpfTest.matches(patternCpf)}")
    println("------------------------------------")

    val patternCnpj = Regex("[0-9]{2}\\.[0-9]{3}\\.[0-9]{3}/[0-9]{4}-[0-9]{2}")
    val cnpjTest = "12.123.321/1234-22"
    println("NumberTest: ${cnpjTest.matches(patternCnpj)}")
    println("------------------------------------")
}