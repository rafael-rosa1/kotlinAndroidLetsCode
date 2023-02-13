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

/*
    Usos:

        1 - Buscas

        2 - Validações

        3 - Substituições

    [] - representa um caractere
        [02] - zero OU dois
        [0-9] - qualque numero entre zero e nove
        [0]{2} - duas ocorrencias do caracater zero na sequencia [0][0]
        [0-9]{6}$ - cifrao representa fim da linha destaca os ultimos 6 caracteres de uma string
        ^[0-9]{6}$ - somenta strings com 6 caracteres numericos serao destacados

        ^[0-9]+[-][a-z]$


 */