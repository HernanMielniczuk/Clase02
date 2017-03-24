package com.example.alumno.clase02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        TextView tv = (TextView) super.findViewById(R.id.id_saludo);
        tv.setText(R.string.saludo_alt);



        Button btn1 = (Button) findViewById(R.id.id_boton1);

        //OnClickListener es una interfaz de View.
        View.OnClickListener listener = new MyListener();
        btn1.setOnClickListener(listener);

    }

}
