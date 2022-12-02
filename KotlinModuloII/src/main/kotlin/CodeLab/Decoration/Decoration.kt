package CodeLab.Decoration

data class Decoration(val rocks: String, val wood: String, val diver: String)

fun makeDecorations() {

    val decoration1 = Decoration("crystal", "wood", "diver")
    println(decoration1)

    // coloca cada um dos contrutores em uma variável
    val (rock, wood, diver) = decoration1
    println(rock)
    println(wood)
    println(diver)
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF)
}

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

