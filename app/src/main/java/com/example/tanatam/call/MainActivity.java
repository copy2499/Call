package com.example.tanatam.call;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView text;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button call;
    Button devide;
    AlertDialog.Builder AlertBuilder;
    AlertDialog Alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        infinite();


    }

    private void infinite() {
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        call = (Button) findViewById(R.id.call);
        devide = (Button) findViewById(R.id.devide);
        text = (TextView) findViewById(R.id.texttext);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        devide.setOnClickListener(this);
        call.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == one) {
            text.append("1");
        } else if (v == two) {
            text.append("2");
        } else if (v == three) {
            text.append("3");
        } else if (v == four) {
            text.append("4");
        } else if (v == five) {
            text.append("5");
        } else if (v == six) {
            text.append("6");
        } else if (v == seven) {
            text.append("7");
        } else if (v == eight) {
            text.append("8");
        } else if (v == nine) {
            text.append("9");
        } else if (v == zero) {
            text.append("0");
        } else if (v == call) {
            alert();
        } else {
            text.setText("");
        }

    }

    private void alert() {
        AlertBuilder = new AlertDialog.Builder(this);
        AlertBuilder.setTitle("Call");
        AlertBuilder.setMessage(text.getText());
        AlertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        Alert = AlertBuilder.create();
        Alert.show();
    }
}
