package com.txsolucoes.tecevents.repositoires;

import com.txsolucoes.tecevents.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
}
