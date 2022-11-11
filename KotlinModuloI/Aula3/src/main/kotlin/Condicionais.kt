fun main(args: Array<String>) {


    println("-------Cadastro de usuário-------")
    println("*min 6 caracteres")
    println("*max 10 caracteres")

    println("Digite o usuário")

    val usuario = readln()

//    if(usuario.length in 6..10) {
//        println("Usuário cadastrado com sucesso")
//    } else {
//        println("Nome de usuário inválido")
//    }

    when (usuario.length) {
        in 6..10 -> println("Usuário cadastrado com sucesso")
        in 0..5 -> println("Usuário não pode ter mais que 10 caracteres")
        else -> println("Nome de usuário inválido")
    }

    when {
        usuario.length in 6..10 -> println("Usuário cadastrado com sucesso")
        usuario.length > 10 -> println("Usuário não pode ter mais que 10 caracteres")
        else -> println("Nome de usuário inválido")
    }


}