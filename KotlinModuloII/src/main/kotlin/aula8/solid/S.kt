package aula8.solid

data class Usuario(var nome: String, var senha: String)


object Autenticador {
    fun login(nome: String, senha: String){
        println("login")
    }
    fun logout(nome: String, senha: String) {
        println("logout")
    }
}

fun main() {



    val usuario1 = Usuario("Rafael", "1234")

    Autenticador.login(usuario1.nome, usuario1.senha)
    Autenticador.logout(usuario1.nome, usuario1.senha)
}