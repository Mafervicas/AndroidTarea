package com.example.act4fragmentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ComunicaMenu{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t = (TextView) findViewById(R.id.ColeraText);
        t.setMovementMethod(LinkMovementMethod.getInstance());


        TextView te = (TextView) findViewById(R.id.ArbolesText);
        te.setMovementMethod(LinkMovementMethod.getInstance());


        TextView tex = (TextView) findViewById(R.id.LluviaText);
        tex.setMovementMethod(LinkMovementMethod.getInstance());

    }

    //Creado por implementar Comunication Menu
    @Override
    public void menu(int botonSeleccionado) {
        Intent in= new Intent (this, Actividad1.class);
        in.putExtra("BOTONPUL", botonSeleccionado);
        startActivity(in);

    }

}