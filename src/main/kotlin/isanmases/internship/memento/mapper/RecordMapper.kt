package isanmases.internship.memento.mapper

import isanmases.internship.memento.dto.RecordCreateOrEditDTO
import isanmases.internship.memento.dto.RecordDTO
import isanmases.internship.memento.entity.RecordEntity
import org.mapstruct.Mapper

@Mapper
interface RecordMapper {
    fun toDTO(entity: RecordEntity): RecordDTO

    fun toEntity(DTO: RecordDTO): RecordEntity

    fun toDTOs(entities: List<RecordEntity>): List<RecordDTO>

    fun toEntities(DTOs: List<RecordDTO>): List<RecordEntity>

    fun toEntity(DTO: RecordCreateOrEditDTO): RecordEntity
}