package aula_2.exercicios

import java.util.*

data class TicketRequest(
    val name: String,
    val waitingTime: Int
)

class TicketManager {

    private val queue: Queue<TicketRequest> = LinkedList()

    fun add(ticket: TicketRequest) {
        queue.offer(ticket)
        println("Estado atual da fila: $queue")
    }

    fun execute() {
        var currentTicketRequest = queue.poll()
        while(currentTicketRequest != null) {
            if(currentTicketRequest.waitingTime < 10) {
                println("Resolvendo: ${currentTicketRequest.name}" )
            } else {
                println("Cancelado: ${currentTicketRequest.name}")
            }
            currentTicketRequest = queue.poll()
        }
    }
}

fun main() {

    val ticketManager = TicketManager()
    ticketManager.add(ticket = TicketRequest("Ticket1", 5))
    ticketManager.add(ticket = TicketRequest("Ticket2", 11))
    ticketManager.add(ticket = TicketRequest("Ticket3", 8))

    ticketManager.execute()
}

/*
* Criar uma estrutura para tratar um ticket de suporte, tratar apenas com waiting time
* menor que 10
* */