package com.luv2code.springdemo;

import java.util.Arrays;

public class MyApp {

    public static void main(String[] args) {

        //create the object
        Coach thebaseballCoach = new BaseballCoach();
        Coach Thetrackcoach = new TrackCoach();

        //use the object
        System.out.println(thebaseballCoach.getDailyWorkout());

        System.out.println(Thetrackcoach.getDailyWorkout());

    }
}
