package isanmases.internship.memento.dto

import java.time.ZonedDateTime

data class RecordDTO(
    val id: Long,
    val title: String?,
    val body: String?,
    val target: ZonedDateTime
)

data class RecordCreateOrEditDTO(
    val title: String?,
    val body: String?,
    val target: ZonedDateTime?
)