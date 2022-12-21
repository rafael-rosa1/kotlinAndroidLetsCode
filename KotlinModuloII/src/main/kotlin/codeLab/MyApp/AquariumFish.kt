package codeLab.MyApp

//abstract class AquariumFish {
//    abstract val color: String
//}

sealed class Seal
class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal) : String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}

interface FishAction {
    fun eat()
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

interface FishColor {
    val color: String
}

class Shark : FishAction, FishColor {
    override val color: String = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor) :
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor

object GoldColor : FishColor {
    override val color: String = "gold"
}



