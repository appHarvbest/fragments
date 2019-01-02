package com.example.ealarcon.fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentoA extends Fragment implements View.OnClickListener{

    private Button button1;
    private Button button2;
    private View view;

    public static FragmentoA newInstance() {
        return new FragmentoA();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragmentoa, container, false);
        //botones
        button1 = (Button) view.findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (Button) view.findViewById(R.id.button2);
        button2.setOnClickListener(this);
        //retorna view
        return view;
    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.button1:
                Toast.makeText(getActivity(), "Presionaste el boton del centro", Toast.LENGTH_SHORT).show();
                view.setBackgroundColor(Color.parseColor("#FFC622BB"));//violeta


                Intent intent = new Intent(getActivity(), pag2.class);
                getActivity().startActivity(intent);
                break;
            case R.id.button2:
                Toast.makeText(getActivity(), "Presionaste el boton inferior", Toast.LENGTH_SHORT).show();
                view.setBackgroundColor(Color.parseColor("#FFDDE238"));//amarillo oscuro
                break;
        }
    }

}