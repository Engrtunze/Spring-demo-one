package com.luv2code.springdemo;

import org.w3c.dom.ls.LSOutput;

public class CricketCoach implements Coach {



    private FortuneService fortuneService;
    private String emailAddress;
    private String team;


    public CricketCoach() {
        System.out.println("inside the : no-args constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside the setter method");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmailAddress() {
        return  emailAddress;

    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 mins";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
