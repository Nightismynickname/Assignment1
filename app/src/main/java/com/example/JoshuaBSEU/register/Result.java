package com.example.JoshuaBSEU.register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    Button logout,scoreboard;
    private TextView tv_score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tv_score = findViewById(R.id.text_view_score);


        QuizActivity Qscore = new QuizActivity();
        Login UserActive = new Login();

        System.out.println(Qscore.score);
        System.out.println(UserActive.active);
        tv_score.setText("Score :" + Qscore.score);

        DatabaseHelper db = new DatabaseHelper(this);
        db.UpdateScore ();

        scoreboard = (Button)findViewById(R.id.button_scoreboard);
        scoreboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoScorelist = new Intent(getApplicationContext(),ScoreList.class);
                startActivity(gotoScorelist);
            }
        }); //closing of Onclicklistener

        logout = (Button)findViewById(R.id.button_logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoLogin = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(gotoLogin);
            }
        }); //closing of OnClickListener

    }
}
