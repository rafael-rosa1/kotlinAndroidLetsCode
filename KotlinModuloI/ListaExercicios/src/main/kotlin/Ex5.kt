fun main() {

    do {
        println("Informe o nome do usuário:")
        val usuario = readln()
        println("Informa a senha:")
        val senha = readln()

        if(usuario == senha) println("ERRO! Nome e senha iguais!")

    } while (usuario == senha)
}