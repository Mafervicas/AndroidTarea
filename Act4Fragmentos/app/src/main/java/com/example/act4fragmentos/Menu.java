package com.example.act4fragmentos;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

//Clase Java que hereda de la clase Fragment
public class Menu extends Fragment {

    //Creo un array que guardará el id de los botones
    private final int[] MENUBOTONES={R.id.Libro1, R.id.Libro2, R.id.Libro3};




    public Menu() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View menuDesplegado= inflater.inflate(R.layout.fragment_menu, container, false);

        //Creamos un for que vaya recorriendo el array
        ImageButton botonmenu;
        for (int i=0; i<MENUBOTONES.length; i++){
            botonmenu=(ImageButton) menuDesplegado.findViewById(MENUBOTONES[i]);
            //Asignamos al botón de comunicación el identificado en el for
            final int botonSelecciondo=i ;

            //Preparamos los otros botones
            //Damos direcciones para las demás clases
            botonmenu.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Activity Actividad1= getActivity();

                    //Hacemos un casting para poder llamar y así mandar el parámetro
                    ((ComunicaMenu)Actividad1).menu (botonSelecciondo);
                }
            });

        }


        return menuDesplegado;
    }
}