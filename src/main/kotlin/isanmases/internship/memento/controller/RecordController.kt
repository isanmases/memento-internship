package isanmases.internship.memento.controller

import isanmases.internship.memento.dto.RecordCreateOrEditDTO
import isanmases.internship.memento.dto.RecordDTO
import isanmases.internship.memento.service.RecordService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/records")
class RecordController(
    private val recordService: RecordService
) {
    @PostMapping
    fun save(@RequestBody record: RecordCreateOrEditDTO): RecordDTO {
        return recordService.save(record)
    }

    @GetMapping
    fun findAll(): List<RecordDTO> {
        return recordService.findAll()
    }
}