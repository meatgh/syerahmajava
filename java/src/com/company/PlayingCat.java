package com.company;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean playing = true;
        if(summer){
            if(temperature >= 25 && temperature <= 45)
                playing = true;
            else
                playing =false;
        }else{

            if(temperature >= 25 && temperature <= 35)
                playing = true;
            else
                playing = false;

        }

        return playing;
    }
}
