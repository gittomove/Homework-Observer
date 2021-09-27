package com.company;

import java.util.HashMap;
import java.util.Map;

public class FootballNews implements Observable{

    private Map<String, String> matches = new HashMap<>();
    private Map<Observer, String> fan = new HashMap();

    public void addMatch(Observer userFan, String fanClub ,String FClub1, String FClub2, String date){
        this.matches.put(fanClub ,FClub1 + " - " + FClub2 + " - at " + date);
        userFan.update(matches.get(fanClub));
    }

    public void removeMatch(Observer fans, String fanClub ,String FClub1, String FClub2, String date){
        this.matches.remove(fanClub);

    }



    @Override
    public void notifyUser(Observer user) {

    }

    @Override
    public void registerUser(Observer observer, String club) {
        this.fan.put(observer, club);
    }


    @Override
    public void unregisterUser(Observer observer, String club) {
        this.fan.remove(observer, club);
    }

}
