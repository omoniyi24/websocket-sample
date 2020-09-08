package com.jayjav.springbootwebsocketexample.user;

import java.io.Serializable;

public class User implements Serializable {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public String getName() {
        return name;
    }
}
