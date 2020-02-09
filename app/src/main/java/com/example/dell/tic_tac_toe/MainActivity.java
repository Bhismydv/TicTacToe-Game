package com.example.dell.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int chance = 0;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        imageButton = findViewById(R.id.reset);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        imageButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.b1:
                if (b1.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        b1.setText("O");
                        result();
                    } else {
                        chance = 0;
                        b1.setText("X");
                        result();
                    }
                }
                break;
            case R.id.b2:
                if(b2.getText().toString().equals("")){
                    if(chance==0){
                        chance=1;
                        b2.setText("O");
                        result();
                    }else{
                        chance=0;
                        b2.setText("X");
                        result();

                    }
                }
                break;
            case R.id.b3:
                if(b3.getText().toString().equals("")){
                    if(chance==0){
                        chance=1;
                        b3.setText("O");
                        result();
                    }else{
                        chance=0;
                        b3.setText("X");
                        result();

                    }
                }
                break;

            case R.id.b4:
                if(b4.getText().toString().equals("")){
                    if(chance==0){
                        chance=1;
                        b4.setText("O");
                        result();
                    }else{
                        chance=0;
                        b4.setText("X");
                        result();

                    }
                }
                break;

            case R.id.b5:
                if(b5.getText().toString().equals("")){
                    if(chance==0){
                        chance=1;
                        b5.setText("O");
                        result();
                    }else{
                        chance=0;
                        b5.setText("X");
                        result();

                    }
                }
                break;

            case R.id.b6:
                if(b6.getText().toString().equals("")){
                    if(chance==0){
                        chance=1;
                        b6.setText("O");
                        result();
                    }else{
                        chance=0;
                        b6.setText("X");
                        result();

                    }
                }
                break;

            case R.id.b7:
                if(b7.getText().toString().equals("")){
                    if(chance==0){
                        chance=1;
                        b7.setText("O");
                        result();
                    }else{
                        chance=0;
                        b7.setText("X");
                        result();

                    }
                }
                break;

            case R.id.b8:
                if(b8.getText().toString().equals("")){
                    if(chance==0){
                        chance=1;
                        b8.setText("O");
                        result();
                    }else{
                        chance=0;
                        b8.setText("X");
                        result();

                    }
                }
                break;

            case R.id.b9:
                if(b9.getText().toString().equals("")){
                    if(chance==0){
                        chance=1;
                        b9.setText("O");
                        result();
                    }else{
                        chance=0;
                        b9.setText("X");
                        result();

                    }
                }
                break;

            case R.id.reset:
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
        }


    }

    private void result() {

        if(b1.getText().toString().equals("X")&&b2.getText().toString().equals("X")&&b3.getText().toString().equals("X")){
            Toast.makeText(this, "Player X Wins!", Toast.LENGTH_LONG).show();
            imageButton.callOnClick();
        }
        else if(b1.getText().toString().equals("O")&&b2.getText().toString().equals("O")&&b3.getText().toString().equals("O")){
            Toast.makeText(this, "Player O Wins!", Toast.LENGTH_LONG).show();
            imageButton.callOnClick();
        }

       else if(b4.getText().toString().equals("X")&&b5.getText().toString().equals("X")&&b6.getText().toString().equals("X")){
            Toast.makeText(this, "Player X Wins!", Toast.LENGTH_LONG).show();
            imageButton.callOnClick();
        }
        else if(b4.getText().toString().equals("O")&&b5.getText().toString().equals("O")&&b6.getText().toString().equals("O")){
            Toast.makeText(this, "Player O Wins!", Toast.LENGTH_LONG).show();
            imageButton.callOnClick();
        }
       else if(b7.getText().toString().equals("X")&&b8.getText().toString().equals("X")&&b9.getText().toString().equals("X")){
            Toast.makeText(this, "Player X Wins!", Toast.LENGTH_LONG).show();
            imageButton.callOnClick();
        }
        else if(b7.getText().toString().equals("O")&&b8.getText().toString().equals("O")&&b9.getText().toString().equals("O")){
            Toast.makeText(this, "Player O Wins!", Toast.LENGTH_LONG).show();
            imageButton.callOnClick();
        }
       else if(b1.getText().toString().equals("X")&&b4.getText().toString().equals("X")&&b7.getText().toString().equals("X")){
            Toast.makeText(this, "Player X Wins!", Toast.LENGTH_LONG).show();
            imageButton.callOnClick();
        }
        else if(b1.getText().toString().equals("O")&&b4.getText().toString().equals("O")&&b7.getText().toString().equals("O")){
            Toast.makeText(this, "Player O Wins!", Toast.LENGTH_LONG).show();
            imageButton.callOnClick();
        }

       else if(b2.getText().toString().equals("X")&&b5.getText().toString().equals("X")&&b8.getText().toString().equals("X")){
            Toast.makeText(this, "Player X Wins!", Toast.LENGTH_LONG).show();
            imageButton.callOnClick();
        }
        else if(b2.getText().toString().equals("O")&&b5.getText().toString().equals("O")&&b8.getText().toString().equals("O")){
            Toast.makeText(this, "Player O Wins!", Toast.LENGTH_LONG).show();
            imageButton.callOnClick();
        }

       else if(b3.getText().toString().equals("X")&&b6.getText().toString().equals("X")&&b9.getText().toString().equals("X")){
            Toast.makeText(this, "Player X Wins!", Toast.LENGTH_LONG).show();
            imageButton.callOnClick();
        }
        else if(b3.getText().toString().equals("O")&&b6.getText().toString().equals("O")&&b9.getText().toString().equals("O")){
            Toast.makeText(this, "Player O Wins!", Toast.LENGTH_LONG).show();
            imageButton.callOnClick();
        }

      else  if(b1.getText().toString().equals("X")&&b5.getText().toString().equals("X")&&b9.getText().toString().equals("X")){
            Toast.makeText(this, "Player X Wins!", Toast.LENGTH_LONG).show();
            imageButton.callOnClick();
        }
        else if(b1.getText().toString().equals("O")&&b5.getText().toString().equals("O")&&b9.getText().toString().equals("O")){
            Toast.makeText(this, "Player O Wins!", Toast.LENGTH_LONG).show();
            imageButton.callOnClick();
        }

       else if(b3.getText().toString().equals("X")&&b5.getText().toString().equals("X")&&b7.getText().toString().equals("X")){
            Toast.makeText(this, "Player X Wins!", Toast.LENGTH_LONG).show();
            imageButton.callOnClick();
        }
        else if(b3.getText().toString().equals("O")&&b5.getText().toString().equals("O")&&b7.getText().toString().equals("O")){
            Toast.makeText(this, "Player O Wins!", Toast.LENGTH_LONG).show();
            imageButton.callOnClick();
        }







    }

}