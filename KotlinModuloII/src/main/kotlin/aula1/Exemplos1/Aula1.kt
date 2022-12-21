package aula1

import java.text.NumberFormat
import java.util.*

class Funcionario1(
    val id: Int,
    var nome: String,
    var sobrenome: String,
    val cpf: String,
    var cargo: String = "",
    var salario: Double
) {

    init {
        // bloco inicial a ser rodado
        // executado primeiro
        println("executado init")
        nome = nome.uppercase()
        sobrenome = sobrenome.uppercase()
    }

    constructor(nome: String, sobrenome: String, cpf: String) : this(
        0,
        nome,
        sobrenome,
        cpf,
        "",
        0.0
    ) {
        //executado segundo
        println("executado construtor")
        this.nome = nome.lowercase()
        this.sobrenome = sobrenome.lowercase()
    }

    private val currencyFormatter = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"))

    override fun toString(): String {
        return """
            Nome: $nome
            Sobrenome: $sobrenome
            CPF: $cpf
            Cargo: $cargo
            Salário: ${currencyFormatter.format(salario)}
        """.trimIndent()
    }

    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if(javaClass != other?.javaClass) return false

        other as Funcionario1

        if(cpf != other.cpf) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nome.hashCode()
        result = 31 * result + cpf.hashCode()
        result = 31 * result + cargo.hashCode()
        result = 31 * result + salario.hashCode()
        return result
    }

    fun definirCargo(cargo: String, salario: Double) {
        this.cargo = cargo
        this.salario = salario * when (cargo) {
            "Gerente" -> 1.2
            "Vendedor" -> 1.1
            "Diretor" -> 1.5
            else -> 1.0
        }
    }
}
fun main() {
    val jose: Funcionario1 = Funcionario1(
        0,
        "Joao",
        "Silva",
        "123456789",
        "zelador",
        1000.0
    )

    val funcionario2 = Funcionario1("Rafael", "Rosa", "123123123")
    jose.definirCargo("Gerente", 10_000.0)
    println(funcionario2.nome)

    println(jose.salario)
    println(jose)
}

