package isanmases.internship.memento

import isanmases.internship.memento.entity.RecordEntity
import isanmases.internship.memento.repository.RecordRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.time.ZonedDateTime

@SpringBootApplication
class MementoApplication {
    @Autowired
    private lateinit var recordRepository: RecordRepository

    @Bean
    fun populateDB() = CommandLineRunner {
        recordRepository.save(RecordEntity().apply {
            title = "title"
            body = "body"
            target = ZonedDateTime.now().plusDays(1)
        })
    }
}

fun main(args: Array<String>) {
    runApplication<MementoApplication>(*args)
}