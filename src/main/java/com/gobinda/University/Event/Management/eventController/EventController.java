package com.gobinda.University.Event.Management.eventController;

import com.gobinda.University.Event.Management.EventModel.Event;
import com.gobinda.University.Event.Management.eventServices.EventServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@Validated
public class EventController {
    @Autowired
    EventServices eventServices;

    @PostMapping("event")
    public String addEvent(@RequestBody List<Event> newEvent){
        eventServices.addEvent(newEvent);
        return "Added";
    }
    @GetMapping("event/date/{date}")
    public List<Event> getAllevent(@PathVariable LocalDateTime date){
        return eventServices.getAllevents(date);
    }
    @DeleteMapping("event/eventId/{eventId}")
    public String deleteByeventId(@PathVariable Integer eventId){
        return eventServices.deleteByeventId(eventId);
    }
    @PutMapping("event/eventId/eventLocation")
    public String updateByEventId(@RequestParam Integer eventId,@RequestParam String eventLocation){
        return eventServices.updateByeventId(eventId,eventLocation);
    }
}
