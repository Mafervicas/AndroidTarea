package com.example.act4fragmentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;


//Implementamos el de Comunicación
public class Actividad1 extends AppCompatActivity implements ComunicaMenu {

    //Inicializamos array para saber qué fragmento se seleccionó
    Fragment[] ArrayLibros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);

        //Configuramos el array
        ArrayLibros= new Fragment[3];

        ArrayLibros[0] = new Libro1 ();
        ArrayLibros[1] = new Libro2 ();
        ArrayLibros[2] = new Libro3 ();

        //Agarramos el botón y regresamos cuál fue
        Bundle extras=getIntent().getExtras();
        menu(extras.getInt("BOTONPUL"));


    }

    @Override
    public void menu(int botonSeleccionado) {

        FragmentManager Manejador = getSupportFragmentManager();
        FragmentTransaction Transaccion=Manejador.beginTransaction();
        Transaccion.replace (R.id.libros, ArrayLibros[botonSeleccionado]);
        Transaccion.commit();


    }
}