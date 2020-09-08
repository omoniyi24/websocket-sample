package com.jayjav.springbootwebsocketexample.config;

import com.jayjav.springbootwebsocketexample.user.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
public class SchedulerConfig {

    @Autowired
    SimpMessagingTemplate template;

    @Scheduled(fixedDelay = 3000)
    public void sendAdhocMessage(){
        template.convertAndSend("/topic/user", new UserResponse("Fix Delay Scheduler"));
    }
}
