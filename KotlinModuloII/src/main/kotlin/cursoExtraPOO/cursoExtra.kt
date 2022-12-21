package cursoExtraPOO

import cursoExtraPOO.carro.Carro
import cursoExtraPOO.carro.MotorCombustao
import cursoExtraPOO.carro.MotorEletrico


fun main() {
    val motorCombustao = MotorCombustao()
    val fuca = Carro(motorCombustao)
    fuca.ligar()
    fuca.anda()
    fuca.anda()
    fuca.anda()

    val motorEletrico = MotorEletrico()
    val tesla = Carro(motorEletrico)
    tesla.ligar()
    tesla.anda()
    tesla.anda()
}