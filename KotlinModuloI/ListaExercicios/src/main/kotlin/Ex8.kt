fun main() {

    val listaNomes: MutableList<String> = mutableListOf()

    while(listaNomes.size < 5) {
        println("Adicione um nome na lista:")
        val nome = readln()
        listaNomes.add(nome)
    }

    println("Procurar um nome na lista:")
    val buscaNome = readln()

    var busca: String = ""
    for(nome in listaNomes) {
        if(buscaNome == nome) {
            busca ="ACHEI, posição ${listaNomes.indexOf(nome)}"
            break
        } else {
            busca = "NÃO ACHEI"
        }
    }
    println(busca)
}