package com.ihm.sloz.inicio;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import com.ihm.sloz.R;
import com.ihm.sloz.bottom_menu;
import com.ihm.sloz.home.Home;

public class CrearCuenta extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crear_cuenta);

        // Volvemos atrás
        ImageView arrow_back = findViewById(R.id.login_back);
        arrow_back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        // Cambiamos el color del botón de face
        Button facebook_btn = findViewById(R.id.facebook_login);
        facebook_btn.getBackground().setColorFilter(0xFF3C579C, PorterDuff.Mode.SRC_ATOP);

        // Cambiamos el color del botón de google
        Button google_btn = findViewById(R.id.google_login);
        google_btn.getBackground().setColorFilter(0xFFFFFFFF, PorterDuff.Mode.SRC_ATOP);

        // Pasa a login
        TextView link_login = findViewById(R.id.link_log_in);
        link_login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                changeActivity(Login.class);
                animArribaAbajo();
            }
        });

        // Cuenta creada
        TextView crear_btn = findViewById(R.id.crear_button);
        crear_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                changeActivity(bottom_menu.class);
                animDerIzq();
            }
        });

        // TODO: Esconder el teclado
    }

    /**
     * Change activity.
     *
     * @param c class
     */
    public void changeActivity(Class c) {
        Intent intent = new Intent(this, c);
        startActivityForResult(intent, 0);
    }

    public void animArribaAbajo() {
        overridePendingTransition(R.anim.slide_in_top, R.anim.slide_out_bottom);
    }

    public void animDerIzq() {
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
