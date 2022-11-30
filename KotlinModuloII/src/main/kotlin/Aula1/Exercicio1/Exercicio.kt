package Aula1

import Aula1.Exercicio1.Empresa
import Aula1.Exercicio1.Endereco
import Aula1.Exercicio1.Funcionario


fun main() {
    val endereco1 = Endereco(
        "Rua Ada",
        "Discord",
        2
    )

    val loja2Irmaos = Empresa(
        "Loja dois irmaos",
        "128937192873"
    )

    val quitanda = Empresa(
        "Quitanda da tia valda",
        "128937192873"
    )

    val jose = Funcionario(
        "Jose",
        "3123123",
        endereco1,
        "jose@gamil.com",
        loja2Irmaos,
        2000.0,
        "Gerente"
    )

    val maria = Funcionario(
        "Maria",
        "312233123",
        endereco1,
        "maria@gamil.com",
        loja2Irmaos,
        3000.0,
        "Diretor"
    )

    loja2Irmaos.listaFuncionarios()
}
