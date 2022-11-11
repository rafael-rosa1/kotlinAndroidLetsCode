fun main() {


//    println("-------Cadastro de usuário-------")
//    println("*min 6 caracteres")
//    println("*max 10 caracteres")
//
//    var usuario: String
//
//    do {
//    println("Digite o usuário")
//    usuario = readln()
//    } while (usuario.isEmpty() || usuario.isBlank())
//
//    println(usuario)

//    while (usuario.isEmpty()) {
//        println("Digite o usuário")
//        usuario = readln();
//    }

    var i = 0

    while (i <= 10) {
        if (i % 2 == 0) {
            i++
            continue
        }
        println(i)
        i++
    }
}