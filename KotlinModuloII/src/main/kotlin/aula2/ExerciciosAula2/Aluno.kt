package aula2.ExerciciosAula2

class Aluno(val nome: String, nota: Int) {

    var nota: Int = nota
        get() {
            println("Sua nota foi $field")
            return field
        }
        set(value) {
            field = if(value > 7) {
                println("voc� passou na mat�ria")
                value
            } else {
                println("recupera��o")
                value
            }
    }
}

fun main() {
    val rafael = Aluno("Rafael", 8)

    println(rafael.nota)
}