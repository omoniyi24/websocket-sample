package com.jayjav.springbootwebsocketexample.user;

public class UserResponse {

    private String content;

    public UserResponse(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
