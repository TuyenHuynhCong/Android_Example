package com.example.bignumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnLeft, btnRight;
    TextView txtScore;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View view) {
        btnLeft = findViewById(R.id.button1);
        btnRight = findViewById(R.id.button2);
        txtScore = findViewById(R.id.txt_score);

        int left = Integer.parseInt(btnLeft.getText().toString());
        int right = Integer.parseInt(btnRight.getText().toString());

        if (view.getId() == R.id.button1){
            if (left >= right) {
                score += 1;
                Toast.makeText(MainActivity.this, "Excellent!!", Toast.LENGTH_SHORT).show();
            } else {
                score -= 1;
                Toast.makeText(MainActivity.this, "Your answer was wrong!!!", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            if (left < right) {
                score += 1;
                Toast.makeText(MainActivity.this, "Excellent!!", Toast.LENGTH_SHORT).show();
            } else {
                score -= 1;
                Toast.makeText(MainActivity.this, "Your answer was wrong!!!", Toast.LENGTH_SHORT).show();
            }
        }

        txtScore.setText("Points: " + score);
        RandomNumber();
    }
    private void RandomNumber(){
        Random random = new Random();
        btnLeft.setText(random.nextInt(100)+"");
        btnRight.setText(random.nextInt(100)+"");
    }
}
