package com.example.kalkulator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView textViewWynik;
    private Button buttonRownanie;

    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonMnozenie;
    private Button buttonDzielenie;

    private Button buttonAC;
    private Button buttonDEL;
    private Button buttonANS;



    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;

    private Button buttonOtwNawias;
    private Button buttonZamkNawias;
    private Button buttonKropka;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        textViewWynik = findViewById(R.id.textViewWynik);
        buttonRownanie = findViewById(R.id.buttonRownanie);

        znajdzPrzycisk(buttonPlus, R.id.buttonPlus);
        znajdzPrzycisk(buttonMinus, R.id.buttonMinus);
        znajdzPrzycisk(buttonMnozenie, R.id.buttonMnozenie);
        znajdzPrzycisk(buttonDzielenie, R.id.buttonDzielenie);
        znajdzPrzycisk(buttonAC, R.id.buttonAC);
        znajdzPrzycisk(buttonDEL, R.id.buttonDEL);
        znajdzPrzycisk(buttonANS, R.id.buttonANS);
        znajdzPrzycisk(button0, R.id.button0);
        znajdzPrzycisk(button1, R.id.button1);
        znajdzPrzycisk(button2, R.id.button2);
        znajdzPrzycisk(button3, R.id.button3);
        znajdzPrzycisk(button4, R.id.button4);
        znajdzPrzycisk(button5, R.id.button5);
        znajdzPrzycisk(button6, R.id.button6);
        znajdzPrzycisk(button7, R.id.button7);
        znajdzPrzycisk(button8, R.id.button8);
        znajdzPrzycisk(button9, R.id.button9);
        znajdzPrzycisk(buttonKropka, R.id.buttonKropka);
        znajdzPrzycisk(buttonOtwNawias, R.id.buttonOtwNawias);
        znajdzPrzycisk(buttonZamkNawias, R.id.buttonZamkNawias);


    }
    private void znajdzPrzycisk(Button nazwaZmiennej, int id){
        nazwaZmiennej = findViewById(id);
        nazwaZmiennej.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button = (Button) view;
                String buttonTekst = (String)(button.getText());
                textViewWynik.setText(buttonTekst);
            }
        });
    }
}