package com.example.codeclan.rockpaperscissorsapp;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Weasel on 20/12/2017.
 */

public class Computer {

    private String name;
    private ArrayList<String> moves;


    public Computer(String name) {
        this.name = "bob";
        this.moves = new ArrayList<>();
        this.moves.add("rock");
        this.moves.add("paper");
        this.moves.add("scissors");
    }


    public String randomAnswer(){
        Collections.shuffle(this.moves);
        return moves.get(0);
    }

    public String getName(){
        return this.name;
    }



}
