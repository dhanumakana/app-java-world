package com.dhanu.kb.example.tracker;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.dhanu.kb.example.aws.topic.EventPublisher;

@Component
public class EventTracker
{
    @Autowired
    EventPublisher eventPublisher;

    //@Scheduled(fixedDelayString = "60000")
    public void trackOutEvents()
    {
        eventPublisher.publish("Sample  Message from JDK : " + (new Date()).toString());
    }
    
    //@Scheduled(fixedDelayString = "60000")
    public void trackInComingEvents()
    {
        eventPublisher.publish("Sample  Message from JDK : " + (new Date()).toString());
    }
}
