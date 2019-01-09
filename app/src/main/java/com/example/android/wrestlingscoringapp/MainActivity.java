package com.example.android.wrestlingscoringapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ScorePlayer1 ;
    int ScorePlayer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //This to retive the current score
        TextView scoreView = (TextView) findViewById(R.id.player_1_score);
        ScorePlayer1 = Integer.parseInt(scoreView.getText().toString());
        TextView scoreViewB = (TextView) findViewById(R.id.player_2_score);
        ScorePlayer2=Integer.parseInt(scoreViewB.getText().toString());
    }

    /**
     * Displays the given score for player 1.
     */

    public void displayForPlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_1_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increment the given score for player 1.
     */
    public void AddTwoForPlayer1(View view){
        ScorePlayer1=ScorePlayer1+2;
        displayForPlayer1(ScorePlayer1);
    }
    public void AddOneForPlayer1(View view){
        ScorePlayer1=ScorePlayer1+1;
        displayForPlayer1(ScorePlayer1);
    }
    public void AddThreeForPlayer1(View view){
        ScorePlayer1=ScorePlayer1+3;
        displayForPlayer1(ScorePlayer1);

    }
    /**
     * Displays the given score for player 2.
     */
    public void displayForPlayer2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_2_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increment the given score for player 2.
     */
    public void AddTwoForPlayer2(View view){
        ScorePlayer2=ScorePlayer2+2;
        displayForPlayer2(ScorePlayer2);
    }
    public void AddOneForPlayer2(View view){
        ScorePlayer2=ScorePlayer2+1;
        displayForPlayer2(ScorePlayer2);
    }
    public void AddThreeForPlayer2(View view){
        ScorePlayer2=ScorePlayer2+3;
        displayForPlayer2(ScorePlayer2);
    }
    /**
     * Rest the given scores for  both players.
     */
    public void REST(View view){
        ScorePlayer1=0;
        displayForPlayer1(ScorePlayer1);
        ScorePlayer2=0;
        displayForPlayer2(ScorePlayer2);

    }

}
