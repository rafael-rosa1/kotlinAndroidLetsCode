package aula2.Exemplos2

//objeto fixos ou constantes
enum class NivelGuerreiro(val nome: String, val arma: Arma) {
    SOLDADO(nome = "Soldado", arma = Arma(nome = "Pistola", dano = 4)) {
        override fun superDano(): Int {
            return arma.dano * 1
        }
    },
    GUARDA(nome = "Guarda", Arma(nome = "Escopeta", dano = 10)) {
        override fun superDano(): Int {
            return arma.dano * 1
        }
    },
    GENERAL(nome = "General", Arma(nome = "Fuzil", dano = 14)) {
        override fun superDano(): Int {
            return arma.dano * 2
        }
    },
    CELESTIAL(nome = "Celestial", Arma(nome = "Espada de Luz", dano = 30)) {
        override fun superDano(): Int {
            return arma.dano * 4
        }
    },
    APOCALIPTICO(nome = "Apocalíptico", Arma(nome = "Machado das Trevas", dano = 65)) {
        override fun superDano(): Int {
            return arma.dano * 5
        }
    },
    DEUS_DOS_DEUSES(nome = "Deus dos Deuses", Arma(nome = "Pistola", dano = 150)) {
        override fun superDano(): Int {
            return arma.dano * 10
        }
    };

    override fun toString(): String {
        return "NivelGuerreiro(nome=$nome, arma=$arma"
    }

    abstract fun superDano(): Int
}

data class Arma(val nome: String, val dano: Int)


fun main() {
//    println(NivelGuerreiro.SOLDADO.ordinal)
    println(NivelGuerreiro.SOLDADO.toString())
//    println(NivelGuerreiro.SOLDADO.name)

    println(NivelGuerreiro.SOLDADO.nome)
    println(NivelGuerreiro.SOLDADO.arma)
}