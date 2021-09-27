package com.company;

import java.util.List;
import java.util.Map;

public class User implements Observer{
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String matches) {
        System.out.println("Dear " + name + " , there is match for today: " + matches);
    }
}
