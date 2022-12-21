package aula1.Exercicio2

class Pessoa(
    val nome: String,
    val sobrenome: String,
    val cpf: String,
    val idade: Int,
    val altura: Int,
    val animal: Animal,
    val carro: Carro
) {
    override fun toString(): String {
        return """$nome $sobrenome, CPF $cpf, $idade anos, ${altura}cm dirige um
            |${carro.marca} ${carro.modelo}, ano ${carro.ano}, cor ${carro.cor}
            |e possui um animal de estimação ${animal.especie}, ${animal.raca}, cor
            |${animal.cor} de idade ${animal.idade} anos.
        """.trimMargin()
    }
}