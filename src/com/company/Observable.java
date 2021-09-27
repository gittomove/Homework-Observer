package com.company;

public interface Observable {
    void notifyUser(Observer observer);
    void registerUser(Observer observer, String club);
    void unregisterUser(Observer observer, String club);
}
