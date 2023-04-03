package ru.pulkras.application.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pulkras.application.store.enteties.SendEmailTaskEntity;

public interface SendEmailTaskRepository extends JpaRepository<SendEmailTaskEntity, Long> {

}
