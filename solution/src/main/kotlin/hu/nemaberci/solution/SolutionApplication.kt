package hu.nemaberci.solution

import org.springframework.amqp.core.Queue
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SolutionApplication {

    companion object {
        const val message_queue_name = "solution-comment-message"
    }

    @Bean
    fun queue(): Queue = Queue(message_queue_name, false)

}

fun main(args: Array<String>) {
    runApplication<SolutionApplication>(*args)
}
