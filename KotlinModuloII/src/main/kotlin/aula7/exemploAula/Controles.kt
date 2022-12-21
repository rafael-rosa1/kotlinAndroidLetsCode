package aula7.exemploAula

abstract class Mouse {
    abstract fun cliqueEsquerdo()
    abstract fun cliqueDireito()
}

interface Teclado {
    val teclasDisponiveis: List<Char>
    fun pressionarTecla(tecla: Char)
}