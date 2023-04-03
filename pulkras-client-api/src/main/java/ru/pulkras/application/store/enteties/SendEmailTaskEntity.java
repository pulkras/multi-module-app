package ru.pulkras.application.store.enteties;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.Instant;
import java.util.Objects;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "send_email_task")
public class SendEmailTaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @Builder.Default
    @Column(updatable = false, nullable = false)
    Instant createdAt;

    Boolean isProcessed;

    Instant processedAt;

    String destinationEmail;

    String message;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SendEmailTaskEntity that)) return false;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
