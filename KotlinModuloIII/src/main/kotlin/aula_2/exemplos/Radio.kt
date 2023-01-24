package aula_2.exemplos

import java.util.*

class Radio {
    private val queue: Queue<String> = LinkedList()
    private var currentSong: String? = null

    fun addNewSong(song: String) {
        queue.offer(song)
    }

    fun play() {
        currentSong = queue.poll()
        println("Musica: " + currentSong)
    }
}