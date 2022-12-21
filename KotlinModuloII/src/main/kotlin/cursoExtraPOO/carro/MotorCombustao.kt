package cursoExtraPOO.carro

class MotorCombustao : Motor() {

    private var nivelCombustivel: Int = 2

    override fun temAutonomia(): Boolean {
        return nivelCombustivel > 0
    }

    override fun gastando() {
        println("gastando combustivel, nível agora é: $nivelCombustivel")
        nivelCombustivel--
    }
}