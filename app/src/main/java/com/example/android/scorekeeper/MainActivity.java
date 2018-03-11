package com.example.android.scorekeeper;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    int numVineA = 0;
    int numVineB = 0;

    int numBeerA = 0;
    int numBeerB = 0;

    int numShotA = 0;
    int numShotB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showScoreA(int score) {
        TextView tv = (TextView) findViewById(R.id.scoreA);
        tv.setText(String.valueOf(score));
    }

    public void showScoreB(int score) {
        TextView tv = (TextView) findViewById(R.id.scoreB);
        tv.setText(String.valueOf(score));
    }

    public void showNumVineA(int num) {
        TextView tv = (TextView) findViewById(R.id.numVineA);
        tv.setText(String.valueOf(num));

        String vineStr;

        if (num != 0) {
            vineStr = getResources().getQuantityString(R.plurals.vine, num);
        } else {
            vineStr = getString(R.string.vine);
        }

        TextView tv1 = (TextView) findViewById(R.id.textVineA);
        tv1.setText(vineStr);

    }

    public void showNumVineB(int num) {
        TextView tv = (TextView) findViewById(R.id.numVineB);
        tv.setText(String.valueOf(num));

        String vineStr;

        if (num != 0) {
            vineStr = getResources().getQuantityString(R.plurals.vine, num);
        } else {
            vineStr = getString(R.string.vine);
        }

        TextView tv1 = (TextView) findViewById(R.id.textVineB);
        tv1.setText(vineStr);
    }

    public void showNumBeerA(int num) {
        TextView tv = (TextView) findViewById(R.id.numBeerA);
        tv.setText(String.valueOf(num));

        String beerStr;

        if (num != 0) {
            beerStr = getResources().getQuantityString(R.plurals.beer, num);
        } else {
            beerStr = getString(R.string.beer);
        }

        TextView tv1 = (TextView) findViewById(R.id.textBeerA);
        tv1.setText(beerStr);
    }

    public void showNumBeerB(int num) {
        TextView tv = (TextView) findViewById(R.id.numBeerB);
        tv.setText(String.valueOf(num));

        String beerStr;

        if (num != 0) {
            beerStr = getResources().getQuantityString(R.plurals.beer, num);
        } else {
            beerStr = getString(R.string.beer);
        }

        TextView tv1 = (TextView) findViewById(R.id.textBeerB);
        tv1.setText(beerStr);
    }

    public void showNumShotA(int num) {
        TextView tv = (TextView) findViewById(R.id.numShotA);
        tv.setText(String.valueOf(num));

        String shotStr;

        if (num != 0) {
            shotStr = getResources().getQuantityString(R.plurals.shot, num);
        } else {
            shotStr = getString(R.string.shot);
        }

        TextView tv1 = (TextView) findViewById(R.id.textShotA);
        tv1.setText(shotStr);
    }

    public void showNumShotB(int num) {
        TextView tv = (TextView) findViewById(R.id.numShotB);
        tv.setText(String.valueOf(num));

        String shotStr;

        if (num != 0) {
            shotStr = getResources().getQuantityString(R.plurals.shot, num);
        } else {
            shotStr = getString(R.string.shot);
        }

        TextView tv1 = (TextView) findViewById(R.id.textShotB);
        tv1.setText(shotStr);
    }

    public void addVineA(View v) {
        numVineA += 1;
        scoreA += 1;

        showScoreA(scoreA);
        showNumVineA(numVineA);
    }

    public void addBeerA(View v) {
        numBeerA += 1;
        scoreA += 2;

        showScoreA(scoreA);
        showNumBeerA(numBeerA);
    }

    public void addShotA(View v) {
        numShotA += 1;
        scoreA += 3;

        showScoreA(scoreA);
        showNumShotA(numShotA);
    }

    public void addVineB(View v) {
        numVineB += 1;
        scoreB += 1;

        showScoreB(scoreB);
        showNumVineB(numVineB);
    }

    public void addBeerB(View v) {
        numBeerB += 1;
        scoreB += 2;

        showScoreB(scoreB);
        showNumBeerB(numBeerB);
    }

    public void addShotB(View v) {
        numShotB += 1;
        scoreB += 3;

        showScoreB(scoreB);
        showNumShotB(numShotB);
    }

    public void resetScoreAll(View v) {
        numShotA = 0;
        numBeerA = 0;
        numVineA = 0;
        scoreA = 0;

        numShotB = 0;
        numBeerB = 0;
        numVineB = 0;
        scoreB = 0;

        showScoreA(scoreA);
        showNumShotA(numShotA);
        showNumBeerA(numBeerA);
        showNumVineA(numVineA);

        showScoreB(scoreB);
        showNumShotB(numShotB);
        showNumBeerB(numBeerB);
        showNumVineB(numVineB);
    }

}
