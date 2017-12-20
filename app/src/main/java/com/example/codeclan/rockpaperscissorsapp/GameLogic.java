package com.example.codeclan.rockpaperscissorsapp;

/**
 * Created by Weasel on 20/12/2017.
 */

public class GameLogic {

    Computer computer;

    public GameLogic(){
        computer = new Computer("bob");
    }

    public String play(String computerHand, String playerHand){
        String win;
        if ((computerHand.equals("rock")  && playerHand.equals("scissors")) ||
                (computerHand.equals("paper")  && playerHand.equals("rock")) ||
                (computerHand.equals("scissors")  && playerHand.equals("paper"))
                ) {
            win = "computer wins with " + computerHand;}
            else if(computerHand.equals(playerHand)){
                win = "draw";
            }
            else{ win = "player wins with " + playerHand;}
        return win;
    }
}
