package aula3

class Exemplo {
    fun deDentroDaClasse() {
        println("Dentro da classe")
    }
}


fun main() {
    Exemplo().deDentroDaClasse()
    Exemplo().deForaDaClasse()

    println(12.quemEh())

    println(39.90.formatarReal())

}