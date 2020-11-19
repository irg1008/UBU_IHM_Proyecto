package com.ihm.sloz.inicio;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.ihm.sloz.R;

import org.w3c.dom.Text;


public class Eleccion extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eleccion);

        // Cambiamos el color del botón login y lo conectamos con la actividad
        Button login_btn = findViewById(R.id.eleccion_login);
        login_btn.getBackground().setColorFilter(0xFFFFB400, PorterDuff.Mode.SRC_ATOP);
        login_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                changeActivity(Login.class);
            }
        });

        // Cambiamos el color del botón crear y lo conectamos con la actividad
        Button crear_btn = findViewById(R.id.eleccion_crear);
        crear_btn.getBackground().setColorFilter(0xFFFFFFFF, PorterDuff.Mode.SRC_ATOP);
        crear_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                changeActivity(CrearCuenta.class);
            }
        });
    }

    /**
     * Change activity.
     *
     * @param c class
     */
    public void changeActivity(Class c) {
        Intent intent = new Intent(this, c);
        startActivityForResult(intent, 0);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
