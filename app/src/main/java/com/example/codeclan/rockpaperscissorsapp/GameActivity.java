package com.example.codeclan.rockpaperscissorsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(getClass().toString(),"onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    public void onButtonClick(View view){
        String userInput = (getResources().getResourceEntryName(view.getId()));

        Log.d("user input is", userInput);

        Computer computer = new Computer("bob");
        GameLogic gameLogic = new GameLogic();

        String computerChoice = computer.randomAnswer();
        String result = gameLogic.play(computerChoice, userInput);
        String computerStringChoose = computer.stringChoose();

        TextView win = findViewById(R.id.win);
        TextView computerResult = findViewById(R.id.computer_hand);

        win.setText(result);
        computerResult.setText(computerStringChoose);

        Integer playerWins = gameLogic.getPlayerWins();
        TextView playerWins2 = findViewById(R.id.player_wins);
        playerWins2.setText(playerWins.toString());

        Integer computerWins = gameLogic.getComputerWins();
        TextView computerWins2 = findViewById(R.id.computer_wins);
        computerWins2.setText(computerWins.toString());

    }

}
