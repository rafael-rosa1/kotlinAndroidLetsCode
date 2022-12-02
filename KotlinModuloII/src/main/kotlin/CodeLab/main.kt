package CodeLab.MyApp

import CodeLab.Decoration.Direction
import CodeLab.Decoration.makeDecorations

fun main() {
//    buildAquarium()
//    makeFish()
//    makeDecorations()
//    println(Direction.EAST.name)
//    println(Direction.EAST.ordinal)
//    println(Direction.EAST.degrees)

    val leaoMarinho = SeaLion()
    val morsa = Walrus()

    println(matchSeal(leaoMarinho))
    println(matchSeal(morsa))

}


//fun buildAquarium() {
//    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
//    aquarium6.printSize()
//    val myTower = TowerTank(diameter = 25, height = 40)
//    myTower.printSize()
//}
//
//fun makeFish() {
//    val shark = Shark()
//    val pleco = Plecostomus()
//    println("Shark: ${shark.color}")
//    shark.eat()
//    println("Plecostomus: ${pleco.color}")
//    pleco.eat()
//}

