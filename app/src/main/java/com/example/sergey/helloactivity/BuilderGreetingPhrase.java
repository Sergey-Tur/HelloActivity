package com.example.sergey.helloactivity;

import android.content.res.Resources;

import java.util.Calendar;

public class BuilderGreetingPhrase {
    private int currentHour;
    private GreetingStrings greetingPhrases;

    public BuilderGreetingPhrase(GreetingStrings greetingPhrases) {
        currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        this.greetingPhrases = greetingPhrases;
    }

    public String get() {
        String helloer = greetingPhrases.getHelloer();


        if (5 <= currentHour && currentHour < 11)

        {
            return String.format("%s %s!", greetingPhrases.getMorning(), helloer);
        } else if (11 <= currentHour && currentHour < 17)

        {
            return String.format("%s %s!", greetingPhrases.getAfternoon(), helloer);

        } else if (17 <= currentHour && currentHour < 23)

        {
            return String.format("%s %s!", greetingPhrases.getEvening(), helloer);

        } else

        {
            return String.format("%s %s!", greetingPhrases.getNight(), helloer);

        }
    }
}
