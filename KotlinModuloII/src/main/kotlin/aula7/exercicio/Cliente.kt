
abstract class Cliente() {
    fun alteraSenha(senhaAntiga: Int, novaSenha: Int) {

    }
}
class ClienteNormal(
    val nome: String,
    val sobrenome: String,
    val cpf: String,
    val senha: Int,
    val carteiraFisica: CarteiraFisica = CarteiraFisica()
)  : Cliente()


class ClienteDigital(
    val nome: String,
    val sobrenome: String,
    val cpf: String,
    val senha: Int,
    val carteiraDigital: CarteiraDigital = CarteiraDigital()
) : CarteiraDigital()

class ClientePremium(
    val nome: String,
    val sobrenome: String,
    val cpf: String,
    val senha: Int,
    val carteiraPremium: CarteiraPremium = CarteiraPremium()
) : CarteiraPremium()