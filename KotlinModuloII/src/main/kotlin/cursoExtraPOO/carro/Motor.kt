package cursoExtraPOO.carro

abstract class Motor {
    private var ligado: Boolean = false

    fun ligar() {
        println("ligando o motor")
        ligado = true
    }

    fun desligar() {
        println("desligando o motor")
        ligado = false
    }

    fun estaLigado(): Boolean {
        return ligado
    }

    abstract fun temAutonomia(): Boolean

    abstract fun gastando()
}