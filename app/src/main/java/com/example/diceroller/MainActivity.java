package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button roll;
    private ImageView diceimg;
    private int rol_num;
    private TextView resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer media = MediaPlayer.create(this,R.raw.roll);
        roll = findViewById(R.id.roll_button);
        roll.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                media.start();
                roll();
            }
        });
    }
    private void roll(){
        diceimg = findViewById(R.id.dice_image);
        rol_num = (int)(Math.random() *6 +1);
        resultText = findViewById(R.id.results_text);

        switch(rol_num){
            case 1:
                resultText.setText("One");
                diceimg.setImageResource(R.drawable.dice_1);
                Toast.makeText(this, "One", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                resultText.setText("Two");
                diceimg.setImageResource(R.drawable.dice_2);
                Toast.makeText(this, "Two", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                resultText.setText("Three");
                diceimg.setImageResource(R.drawable.dice_3);
                Toast.makeText(this, "Three", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                resultText.setText("Four");
                diceimg.setImageResource(R.drawable.dice_4);
                Toast.makeText(this, "Four", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                resultText.setText("Five");
                diceimg.setImageResource(R.drawable.dice_5);
                Toast.makeText(this, "Five", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                resultText.setText("Six");
                diceimg.setImageResource(R.drawable.dice_6);
                Toast.makeText(this, "Six", Toast.LENGTH_SHORT).show();
                break;
            default:
                resultText.setText("Empty Dice");
                diceimg.setImageResource(R.drawable.empty_dice);
                Toast.makeText(this, "EmptyDice", Toast.LENGTH_SHORT).show();

        }
    }
}