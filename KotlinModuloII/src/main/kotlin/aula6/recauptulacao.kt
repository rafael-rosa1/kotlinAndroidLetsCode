package aula6

import kotlin.math.PI
import kotlin.math.pow

open class Forma20 {
    open fun calculaArea(): Double {
        return 0.0
    }
}

class Circulo(val raio: Double): Forma20() {
    override fun calculaArea(): Double {
        return PI * raio.pow(raio)
    }
}

