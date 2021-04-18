package com.example.android.courtcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Welcome extends AppCompatActivity {
    Button  btn_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        displayForTeamA(0);
        displayForTeamB(0);

        btn_start= (Button)findViewById(R.id.finish_btn);
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Welcome.this, End.class);
                startActivity(in);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_text) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    int scoreForTeamA = 0;
    public void addThreeForTeamA(View view){
        scoreForTeamA = scoreForTeamA+3;
        displayForTeamA(scoreForTeamA);

    }
    public void addTwoForTeamA(View view){
        scoreForTeamA = scoreForTeamA+2;
        displayForTeamA(scoreForTeamA);
    }

    public void addOneForTeamA(View view){
        scoreForTeamA = scoreForTeamA+1;
        displayForTeamA(scoreForTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }
    /*reset the score*/

    public void resetScore(View view){
        scoreForTeamA = 0;
        scoreForTeamB = 0;
        displayForTeamB(scoreForTeamB);
        displayForTeamA(scoreForTeamA);
        Toast.makeText(this,
                "RESET SCORE AND GOTO FINISH",
                Toast.LENGTH_LONG).show();

    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    int scoreForTeamB = 0;
    public void addThreeForTeamB(View view){
        scoreForTeamB = scoreForTeamB+3;
        displayForTeamB(scoreForTeamB);

    }
    public void addTwoForTeamB(View view){
        scoreForTeamB = scoreForTeamB+2;
        displayForTeamB(scoreForTeamB);
    }

    public void addOneForTeamB(View view){
        scoreForTeamB = scoreForTeamB+1;
        displayForTeamB(scoreForTeamB);
    }
}



