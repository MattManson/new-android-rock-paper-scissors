package com.example.codeclan.rockpaperscissorsapp;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.Computer;

import static org.junit.Assert.assertEquals;

/**
 * Created by Weasel on 20/12/2017.
 */

public class ComputerTest {

    com.example.codeclan.rockpaperscissorsapp.Computer computer;

    @Before
    public void before(){
        computer = new com.example.codeclan.rockpaperscissorsapp.Computer("bob");
    }

    @Test
    public void canGetName(){
        assertEquals("bob", computer.getName());
    }

    @Test
    public void canGetRandomAnswer(){
        assertEquals("rock", computer.randomAnswer());
    }
}
