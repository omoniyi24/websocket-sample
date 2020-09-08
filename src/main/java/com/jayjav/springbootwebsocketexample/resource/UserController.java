package com.jayjav.springbootwebsocketexample.resource;

import com.jayjav.springbootwebsocketexample.user.User;
import com.jayjav.springbootwebsocketexample.user.UserResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @MessageMapping("/user")
    @SendTo("/topic/user")
    public UserResponse getUser(User user){
        return new UserResponse(String.format("Hi %s", user.getName()));
    }
}
