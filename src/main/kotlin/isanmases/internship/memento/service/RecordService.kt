package isanmases.internship.memento.service

import isanmases.internship.memento.dto.RecordCreateOrEditDTO
import isanmases.internship.memento.dto.RecordDTO
import isanmases.internship.memento.mapper.*
import isanmases.internship.memento.repository.RecordRepository
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

interface RecordService {
    fun save(record: RecordCreateOrEditDTO): RecordDTO

    fun findAll(): List<RecordDTO>

    fun findById(id: Long): RecordDTO?

    fun editById(id: Long, record: RecordCreateOrEditDTO): RecordDTO

    fun deleteById(id: Long)
}

@Service
class RecordServiceImpl(
    private val recordRepository: RecordRepository,
    private val recordMapper: RecordMapper
) : RecordService {
    override fun save(record: RecordCreateOrEditDTO): RecordDTO {
        return record
            .let(recordMapper::toEntity)
            .let(recordRepository::save)
            .let(recordMapper::toDTO)
    }

    override fun findAll(): List<RecordDTO> {
        return recordRepository.findAll(Sort.by("target"))
            .let(recordMapper::toDTOs)
    }

    override fun findById(id: Long): RecordDTO? {
        TODO("Not yet implemented")
    }

    override fun editById(id: Long, record: RecordCreateOrEditDTO): RecordDTO {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: Long) {
        TODO("Not yet implemented")
    }
}