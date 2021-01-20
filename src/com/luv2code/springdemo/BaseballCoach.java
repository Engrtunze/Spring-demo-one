package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

    //defing a private field for the dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection


    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout()
    {
        return "Spend 30 mins batting practice";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }

}


