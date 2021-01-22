package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    public TrackCoach() {
    }

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "just do it "+ fortuneService.getFortune();
    }

    //add an init method for starting up a bean (in here u can add any custom code before it runs the main program)
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method");
    }

    //add a destroy method
    public void doCleanUpStuff()
    {
        System.out.println("TrackCoach: inside method clean up stuff");
    }
}
