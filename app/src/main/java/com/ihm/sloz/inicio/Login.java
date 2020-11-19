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

        public class Login extends AppCompatActivity {
            @Override
            public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.login);

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

        // Contraseña olvidada
        TextView contr_olvidada = findViewById(R.id.contr_olvidada);
        contr_olvidada.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                changeActivity(Recuperar.class);
                animArribaAbajo();
            }
        });

        // Pasa a crear una cuenta
        TextView link_crear_cuenta = findViewById(R.id.link_crear_cuenta);
        link_crear_cuenta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                changeActivity(CrearCuenta.class);
                animAbajoArriba();
            }
        });

        // Login realizado
        TextView login_bttn = findViewById(R.id.login_button);
        login_bttn.setOnClickListener(new View.OnClickListener() {
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

    public void animAbajoArriba() {
        overridePendingTransition(R.anim.slide_in_bottom, R.anim.slide_out_top);
    }

    public void animArribaAbajo() {
        overridePendingTransition(R.anim.slide_in_top, R.anim.slide_out_bottom);
    }

    public void animDerIzq() {
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
