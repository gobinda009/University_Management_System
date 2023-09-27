package com.gobinda.University.Event.Management.eventServices;

import com.gobinda.University.Event.Management.EventModel.Event;
import com.gobinda.University.Event.Management.eventRepo.IeventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventServices {
    @Autowired
    IeventRepo ieventRepo;

    public String addEvent(List<Event> newEvent) {
        ieventRepo.saveAll(newEvent);
        return "added";
    }

    public List<Event> getAllevents(LocalDateTime date) {
        return ieventRepo.findByDate(date);
    }

    public String deleteByeventId(Integer eventId) {
        ieventRepo.deleteById(eventId);
        return "Deleted Successfully";
    }

    public String updateByeventId(Integer eventId, String eventLocation) {
        Event presentEvent = ieventRepo.findById(eventId).orElse(null);
        if(presentEvent!=null){
            presentEvent.setEventLocation(eventLocation);
            ieventRepo.save(presentEvent);
        }else{
            return "EventId not found !!";
        }
        return "Event Updated";
    }
}
