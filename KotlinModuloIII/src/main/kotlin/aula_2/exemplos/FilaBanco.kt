package aula_2.exemplos

import java.util.PriorityQueue

data class Person(val name: String, var age: Int)

class Bank {
    private val queue = PriorityQueue<Person>()

    fun add(person: Person) {
        queue.offer(person)
    }

    fun execute() {

    }
}