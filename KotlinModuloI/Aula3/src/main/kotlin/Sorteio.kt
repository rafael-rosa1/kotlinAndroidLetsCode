import kotlin.random.Random

fun main() {

    println("Digite o número minimo")
    val min = readln().toInt()
    println("Digite o número máximo")
    val max = readln().toInt()

    val randomNumber = (min..max).random()

    do {
        println("Tente adivinhar o número gerado")
        val number = readln().toInt()
//        if(number > randomNumber) {
//            println("tente um número menor")
//        } else if(number < randomNumber) {
//            println("tente um número maior")
//        } else {
//            println("acertou mizeravi")
//        }
        when {
            number > randomNumber -> println("tente um número menor")
            number < randomNumber -> println("tente um número maior")
            else -> println("acertou mizeravi")
        }

    } while(number != randomNumber)


}