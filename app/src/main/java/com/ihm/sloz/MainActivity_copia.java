package com.ihm.sloz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.ihm.sloz.R;
import com.ihm.sloz.inicio.Eleccion;

public class MainActivity_copia extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Texto botón welcome_btn.
        Button welcome_btn = findViewById(R.id.welcome_btn);
        welcome_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                changeActivity(Eleccion.class);
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
