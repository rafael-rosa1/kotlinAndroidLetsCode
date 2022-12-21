package cursoExtraPOO.carro

class Carro constructor(private val motor: Motor) {

    var cor: String? = null

    fun ligar() = motor.ligar()
    fun desligar() = motor.desligar()
    fun freia() = println("Carro freando: rrrrrrrrrrrrrrrrrrrrrrrrrrrr")
    fun buzina() = println("Carro buzinando: beeeep beeep beeeeeeeeeeeeep")

    fun anda() {
        when {
            !motor.estaLigado() -> println("Ligue o carro primeiro.")
            !motor.temAutonomia() -> {
                when (motor) {
                    is MotorEletrico -> println("Recarregue o carro")
                    is MotorCombustao -> println("Abasteça o carro")
                }
                motor.desligar()
            }
            else -> {
                motor.gastando()
                when (motor) {
                    is MotorEletrico -> println("Carro andando: ............")
                    is MotorCombustao -> println("Carro andando: vrum vrum vrum vrummmmmmmmmmm")
                }
            }
        }
    }
}