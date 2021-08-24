package isanmases.internship.memento.repository

import isanmases.internship.memento.entity.RecordEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.time.ZonedDateTime

interface RecordRepository : JpaRepository<RecordEntity, Long> {
    fun findAllByTargetOrderByTarget(dateTime: ZonedDateTime): Iterable<RecordEntity>
}