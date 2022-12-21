package aula7

abstract class Cliente(
    val nome: String,
    val sobrenome: String,
    val cpf: String,
    val senha: Int,
    var plano: Carteira
) {

}

class ClienteNormal(
    nome: String,
    sobrenome: String,
    cpf: String,
    senha: Int,
    plano: Carteira
) : Cliente(nome, sobrenome, cpf, senha, plano), CarteiraFisica{
    override fun deposito() {
        TODO("Not yet implemented")
    }

    override fun saque() {
        TODO("Not yet implemented")
    }

    override fun pagarBoleto() {
        TODO("Not yet implemented")
    }


}

class ClienteDigital(
    nome: String,
    sobrenome: String,
    cpf: String,
    senha: Int,
    plano: Carteira
) : Cliente(nome, sobrenome, cpf, senha, plano), CarteiraDigital{
    override fun transferenciaPix() {
        TODO("Not yet implemented")
    }

    override fun pagarBoleto() {
        TODO("Not yet implemented")
    }

    override fun investir() {
        TODO("Not yet implemented")
    }

    override fun guardar() {
        TODO("Not yet implemented")
    }
}

class ClientePremium(
    nome: String,
    sobrenome: String,
    cpf: String,
    senha: Int,
    plano: Carteira
) : Cliente(nome, sobrenome, cpf, senha, plano), CarteiraFisica, CarteiraDigital{
    override fun deposito() {
        TODO("Not yet implemented")
    }

    override fun saque() {
        TODO("Not yet implemented")
    }

    override fun transferenciaPix() {
        TODO("Not yet implemented")
    }

    override fun pagarBoleto() {
        TODO("Not yet implemented")
    }

    override fun investir() {
        TODO("Not yet implemented")
    }

    override fun guardar() {
        TODO("Not yet implemented")
    }


}