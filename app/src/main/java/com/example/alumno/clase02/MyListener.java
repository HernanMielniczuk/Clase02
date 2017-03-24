package com.example.alumno.clase02;

import android.util.Log;
import android.view.View;

public class MyListener implements View.OnClickListener {

    @Override
    public void onClick(View v){
        //log en consola en modo debug
        Log.d("CLICK", "SE HIZO CLICK");
    }
}
