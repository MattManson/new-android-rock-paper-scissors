package com.example.codeclan.rockpaperscissorsapp;

/**
 * Created by Weasel on 20/12/2017.
 */

public class GameLogic {

    Computer computer;
    int computerWins;
    int playerWins;

    public GameLogic()
    {
        computer = new Computer("bob");
        this.computerWins = 0;
        this.playerWins = 0;
    }

    public String play(String computerHand, String playerHand){
        String win;
        if ((computerHand.equals("rock")  && playerHand.equals("scissors")) ||
                (computerHand.equals("paper")  && playerHand.equals("rock")) ||
                (computerHand.equals("scissors")  && playerHand.equals("paper"))
                ) {this.computerWins +=1;
            win = "computer wins with " + computerHand;}
            else if(computerHand.equals(playerHand)){
                win = "draw";
            }
            else{ this.playerWins +=1;
                win = "player wins with " + playerHand;}
        return win;
    }

    public int getComputerWins() {
        return computerWins;
    }

    public int getPlayerWins() {
        return playerWins;
    }
}
