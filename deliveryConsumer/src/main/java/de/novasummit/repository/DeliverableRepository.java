package de.novasummit.repository;

import de.novasummit.entity.Deliverable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliverableRepository extends JpaRepository<Deliverable, Long> {
}
