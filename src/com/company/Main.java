package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {



        FootballNews google = new FootballNews();

        User user1 = new User("Maksat");
        User user2 = new User("Kendrick Lamar");
        User user3 = new User("ASAP Rocky");

        google.registerUser(user1, "Barca");
        google.registerUser(user2, "Real Madrid");
        google.registerUser(user3, "Liverpool");

        google.addMatch(user1, "Barca", "Barca", "Lester City", "22:00, Sept 21");
        google.addMatch(user2, "Real Madrid", "Real Madrid", "Bayern", "22:00, Sept 29");
        google.addMatch(user2, "Liverpool", "Liverpool", "Man City", "12:00, Oct 01");

     }
}
