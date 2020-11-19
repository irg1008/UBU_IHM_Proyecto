package com.ihm.sloz.ayuda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.ihm.sloz.R;


public class CentroAyuda extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crear_cuenta);

        // Pasa a elegirayuda
        ImageView contact = findViewById(R.id.contact);
        contact.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                changeActivity(ElegirAyuda.class);
                animDerIzq();
            }
        });
    }

    public void changeActivity(Class c) {
        Intent intent = new Intent(this, c);
        startActivityForResult(intent, 0);
    }
    public void animDerIzq() {
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

}