package isanmases.internship.memento.entity

import java.time.ZonedDateTime
import javax.persistence.*

@Entity
@Table(name = "record")
class RecordEntity : BaseEntity() {
//    @Column(name = "owner_id")
//    var ownerId: Long? = null

    @Column(name = "title")
    var title: String? = null

    @Column(name = "body")
    var body: String? = null

    @Column(name = "target")
    var target: ZonedDateTime? = null
}