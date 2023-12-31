package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void uno(View view) {
        TextView res = (TextView) findViewById(R.id.resultado);
        res.setText(res.getText()+"1");
    }
    public void dos(View view) {
        TextView res = (TextView) findViewById(R.id.resultado);
        res.setText(res.getText()+"2");
    }
    public void tres(View view) {
        TextView res = (TextView) findViewById(R.id.resultado);
        res.setText(res.getText()+"3");
    }
    public void cuatro(View view) {
        TextView res = (TextView) findViewById(R.id.resultado);
        res.setText(res.getText()+"4");
    }
    public void cinco(View view) {
        TextView res = (TextView) findViewById(R.id.resultado);
        res.setText(res.getText()+"5");
    }
    public void seis(View view) {
        TextView res = (TextView) findViewById(R.id.resultado);
        res.setText(res.getText()+"6");
    }
    public void siete(View view) {
        TextView res = (TextView) findViewById(R.id.resultado);
        res.setText(res.getText()+"7");
    }
    public void ocho(View view) {
        TextView res = (TextView) findViewById(R.id.resultado);
        res.setText(res.getText()+"8");
    }
    public void nueve(View view) {
        TextView res = (TextView) findViewById(R.id.resultado);
        res.setText(res.getText()+"9");
    }
    public void cero(View view) {
        TextView res = (TextView) findViewById(R.id.resultado);
        res.setText(res.getText()+"0");
    }
    public void mas(View view) {
        TextView res = (TextView) findViewById(R.id.resultado);
        res.setText(res.getText()+"+");
    }

    public void ce(View view) {
        TextView res = (TextView) findViewById(R.id.resultado);
        res.setText("");
    }
    public void igual(View view) {
        TextView res = (TextView) findViewById(R.id.resultado);
        res.setText(Calculadora.calculator(res.getText().toString()));
    }
    public void menos(View view) {
        TextView res = (TextView) findViewById(R.id.resultado);
        res.setText(res.getText()+"-");
    }
    public void multiplicar(View view) {
        TextView res = (TextView) findViewById(R.id.resultado);
        res.setText(res.getText() + "*");
    }
}