package isanmases.internship.memento.entity

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.ZonedDateTime
import javax.persistence.*

@MappedSuperclass
abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null

    @CreationTimestamp
    @Column(name = "created_at")
    val createdAt: ZonedDateTime? = null

    @UpdateTimestamp
    @Column(name = "updated_at")
    val updatedAt: ZonedDateTime? = null
}