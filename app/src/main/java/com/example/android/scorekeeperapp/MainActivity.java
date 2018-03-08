package com.example.android.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Global variables declaration.
     */
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    /**
     * State check and save in case of screen rotation.
     *
     * @param savedInstanceState - saving instance state
     */

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        savedInstanceState.putInt("scoreA", scoreTeamA);
        savedInstanceState.putInt("scoreB", scoreTeamB);
        super.onSaveInstanceState(savedInstanceState);

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Restoration of score values after screen rotation.
         */
        if (savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt("scoreA");
            scoreTeamB = savedInstanceState.getInt("scoreB");

            // Printing restored values
            TextView scoreViewA = findViewById(R.id.team_a_score);
            scoreViewA.setText(String.valueOf(scoreTeamA));
            TextView scoreViewB = findViewById(R.id.team_b_score);
            scoreViewB.setText(String.valueOf(scoreTeamB));
        }
    }

    /**
     * Buttons with scores for both teams.
     */

    // For the Team A
    public void plusThreeA(View view) {
        displayForTeamA(scoreTeamA = scoreTeamA + 3);
    }

    public void plusTwoA(View view) {
        displayForTeamA(scoreTeamA = scoreTeamA + 2);
    }

    public void FreeDrawA(View view) {
        displayForTeamA(scoreTeamA = scoreTeamA + 1);
    }

    // For the Team B
    public void plusThreeB(View view) {
        displayForTeamB(scoreTeamB = scoreTeamB + 3);
    }

    public void plusTwoB(View view) {
        displayForTeamB(scoreTeamB = scoreTeamB + 2);
    }

    public void FreeDrawB(View view) {
        displayForTeamB(scoreTeamB = scoreTeamB + 1);
    }

    /**
     * Reset button.
     */
    public void Reset(View view) {
        displayForTeamA(scoreTeamA = 0);
        displayForTeamB(scoreTeamB = 0);
    }

    /**
     * Display the given score for Team A.
     */

    public void displayForTeamA(int scoreTeamA) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreTeamB) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }
}
