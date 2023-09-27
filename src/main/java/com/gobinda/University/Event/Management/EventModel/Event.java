package com.gobinda.University.Event.Management.EventModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    @Id
    private Integer eventId;
    private String eventName;
    private String eventLocation;
    private LocalDateTime date;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
