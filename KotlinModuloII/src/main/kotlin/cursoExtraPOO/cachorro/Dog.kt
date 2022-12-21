package cursoExtraPOO.cachorro

class Dog{
    var owner: Human? = null
    var name: String? = null

    fun sayHi() {
        println("Hi my name is $name and my owner is ${owner?.name}")
    }
}