package com.example.v8t2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private BottleDispenser bd;
    private TextView textView, bottleDispense;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bd = BottleDispenser.getInstance();
        //Casting the different objects
        textView = (TextView) findViewById(R.id.moneyText);
        bottleDispense = (TextView) findViewById(R.id.bottleDispense);
    }

    public void addMoney(View v) {
        bd.addMoney(1);
        String money = String.valueOf(bd.getMoney());
        textView.setText("Current balance: " + money + "€");
    }

    public void returnMoney(View v) {
        bottleDispense.setText(bd.returnMoney());
        String money = String.valueOf(bd.getMoney());
        textView.setText("Current balance: " + money + "€");
    }


    public void buyBottle(View v) {
        String text2 = bd.buyBottle(0);
        bottleDispense.setText(text2);
        String money = String.valueOf(bd.getMoney());
        textView.setText("Current balance: " + money + "€");
    }
}

