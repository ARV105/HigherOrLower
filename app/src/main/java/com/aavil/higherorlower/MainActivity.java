package com.aavil.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void checkGuess(View view) {

        EditText guessNumber = (EditText) findViewById(R.id.guessNumber);

        String guessNumberString = guessNumber.getText().toString();

        int guessedNumberInt = Integer.parseInt(guessNumberString);

        String message = "";

       if (guessedNumberInt > randomNumber) {

           message = "Too high!";

       } else if (guessedNumberInt < randomNumber) {

           message = "Too low!";

       }else{
           message = "Correct, well done! Try again.";

       }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random randomGenerator = new Random();

        int randomNumber = randomGenerator.nextInt(21);
    }
}
