fun main() {

//    log("rafaelrosa") {
//        funcaoSemRetorno()
//    }
//
//    log("rafaelrosa") {
//        println(mostraSaldo("Rafael", false, 500.0))
//    }

//    setOnClickListener {
//        println("Olá! :D")
//    }

    teste(50) { n->
        println("linha 16")
        "teste $n"
    }
}


fun setOnClickListener(action: () -> Unit) = action.invoke()

fun funcaoSemRetorno() {
    println("Minha primeira função no kotlin")
}

fun retornaNome(): String = "Rafael"

fun saudacoes(nome: String, dia: Boolean): String {
    val diaOuNoite = if(dia) "Bom dia" else "Boa noite"
    return "$diaOuNoite, $nome"
}

fun mostraSaldo(
    nome: String,
    dia: Boolean = true,
    saldo: Double?
): String {
    val diaOuNoite = if(dia) "Bom dia" else "Boa noite"
    return "$diaOuNoite, $nome\nseu saldo é de R$$saldo"
}

fun log(usuario: String, acao: () -> Unit) {
    println("Usuário: $usuario")
    acao()
}

fun teste(numero: Int, acao: (Int) -> String) {
   println(acao(numero))
}
