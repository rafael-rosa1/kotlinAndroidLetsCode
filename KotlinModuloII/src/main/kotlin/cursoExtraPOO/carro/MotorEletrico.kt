package cursoExtraPOO.carro

class MotorEletrico : Motor() {

    private var nivelBateria: Int = 1

    override fun temAutonomia(): Boolean {
        return nivelBateria > 0
    }

    override fun gastando() {
        println("gastando energia, nível agora é: $nivelBateria")
        nivelBateria--
    }
}