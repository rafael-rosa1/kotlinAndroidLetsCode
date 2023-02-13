package execicioRegex

fun main() {


    val patternNome = Regex("[a-zA-Z\\s]+")
    val patternIdade = Regex("[0-9]{2}")
    val patternEmail = Regex("^[A-Za-z](.*)(@)(.+)(\\.)(.+)")
    val patternSenha = Regex("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#\$%^&+=])(?=\\S+\$).{4,}\$")

    println("--------- Cadastro -------")

    do {
        print("Informe seu nome: ")
        val nome = readln()
    } while (!nome.matches(patternNome))


    do {
        print("Informe sua idade: ")
        val idade = readln()
    } while (!idade.matches(patternIdade))



    do {
        print("Informe seu email: ")
        val email = readln()
    } while (!email.matches(patternEmail))

    do {
        println("Informe sua senha(Deve conter ao menos um digito maiusculo e um minusculo, um numero e um caractere especial, minimo 6 digitos): ")
        val senha = readln()
    } while (!senha.matches(patternSenha))

    println("Cadastro Finalizado, muito obrigado!")

}