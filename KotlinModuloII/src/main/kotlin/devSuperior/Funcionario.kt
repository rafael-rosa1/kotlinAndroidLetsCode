package devSuperior

class Funcionario {

    //ATRIBUTOS (DADOS)
    var nome: String? = null
    var valorPorHora: Double? = null
    var horas: Int? = null

    //METODOS (FUNÇÕES) (COMPORTAMENTOS)
    fun total(): Double {
       return valorPorHora!!.plus(horas!!)
    }


}