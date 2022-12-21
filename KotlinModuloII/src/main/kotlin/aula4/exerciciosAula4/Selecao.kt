package aula4.exerciciosAula4

data class JogadorSelecao(val nome: String, val posicao: String, val numero: Int) {
    class Lesoes(val jogadoresLesionados: MutableList<String> = mutableListOf()) {
        inner class GravidadeLesao(val nivelGravidade: Int) {
        }
    }
}