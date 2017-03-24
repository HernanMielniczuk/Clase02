package com.example.alumno.clase02;

import android.util.Log;
import android.view.View;

public class MyListener implements View.OnClickListener {

    @Override
    public void onClick(View v){
        //log en consola en modo debug

        if (v.getId() == R.id.id_boton1){
            Log.d("CLICK", "SE HIZO CLICK EN BOTON 1");
        } else {
            Log.d("CLICK", "SE HIZO CLICK EN BOTON 2");
        }
    }
}
