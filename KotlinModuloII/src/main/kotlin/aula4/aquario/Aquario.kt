package aula4.aquario

data class Peixe(val nome: String, val cor: String, val tamanho: String)

class Aquario(val peixes: MutableList<Peixe>, var aquarioLimpo: Boolean = true) {
    companion object {
       const val multiploPeixes = 3
    }

    val qtdePeixes = peixes.size
    fun adicionarPeixe(peixe: Peixe) {
        if (aquarioLimpo && qtdePeixes % multiploPeixes != 0) {
            peixes.add(peixe)
        } else {
            aquarioLimpo = false
            println("Limpe o aquário antes de adicionar mais peixes")
        }

        fun limpaAquario() {
            aquarioLimpo = true
        }

        fun alimentarPeixes() {
            val qtdeAlimento = (1..3).random()
            when (qtdeAlimento) {
                1 -> println("Nenhum peixe se alimentou")
                2 -> {
                    val qtdePeixes = (1 .. peixes.size).random()
                    println("Parcial $qtdePeixes se alimentaram")
                }
                else -> println("Todos os peixes se alimentaram")
            }
        }
    }
}