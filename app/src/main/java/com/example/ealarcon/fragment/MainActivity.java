package com.example.ealarcon.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonA;
    private Button buttonB;
    private Button buttonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonA = (Button) findViewById(R.id.buttonA);
        buttonB = (Button) findViewById(R.id.buttonB);
        buttonC = (Button) findViewById(R.id.buttonC);

        //carga fragment dinamico
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.framelayout, new FragmentoA())
                .disallowAddToBackStack()
                .commit();

        //boton A
        buttonA.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        Fragment fragmentoA = new FragmentoA();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.framelayout, fragmentoA)
                                .disallowAddToBackStack()
                                .commit();
                    }
                });
        //boton B
        buttonB.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        Fragment fragmentoB = new FragmentoB();
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, fragmentoB)
                                .disallowAddToBackStack()
                                .commit();
                    }
                });
        //boton C
        buttonC.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        Fragment fragmentoC = new FragmentoC();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.framelayout, fragmentoC)
                                .disallowAddToBackStack()
                                .commit();
                    }
                });
    }
}