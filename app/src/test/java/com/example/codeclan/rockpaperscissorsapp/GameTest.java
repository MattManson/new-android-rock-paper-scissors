package com.example.codeclan.rockpaperscissorsapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Weasel on 20/12/2017.
 */

public class GameTest {

    GameLogic gameLogic;
    Computer computer;

    @Before
    public void before(){
        gameLogic = new GameLogic();
        computer = new Computer("bob");
    }

    @Test()
    public void canPlay(){
        assertEquals("player wins with scissors", gameLogic.play("paper", "scissors"));
        assertEquals("computer wins with scissors", gameLogic.play("scissors", "paper"));
        assertEquals("draw", gameLogic.play("scissors", "scissors"));
    }




}
