package Aula4.extensao

fun String.formataCPF() : String {

    if(this.length != 11) {
        throw CPFInvalidoException()
    }
    return "${this.substring(0,3)}.${this.substring(3,6)}.${this.substring(6,9)}-${this.substring(9,11)}"
}

class CPFInvalidoException(mensagem: String = "O CPF é inválido.") : Exception(mensagem)


fun main() {

    val meuCpf = "12345678900"

    println(meuCpf.formataCPF())

}