package com.gobinda.University.Event.Management.eventRepo;

import com.gobinda.University.Event.Management.EventModel.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface IeventRepo extends CrudRepository<Event,Integer> {
    List<Event> findByDate(LocalDateTime date);
}
