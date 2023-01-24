package aula_2.exemplos

class QueueManager<T> {
    private val queue: ArrayList<T> = ArrayList<T>()

//    fun offer(): T? {
//        if(queue.isNotEmpty()) {
//            return null
//        }
//        return
//    }

    fun offer(value: T) {
        queue.add(value)

        println(queue)
    }
}

fun main() {
    val queue = QueueManager<String>()
    queue.offer("pessoa 1")
    queue.offer("pessoa 2")

//    println(person)
    queue.offer("pessoa 3")
}