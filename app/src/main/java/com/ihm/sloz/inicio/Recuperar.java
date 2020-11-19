package com.ihm.sloz.inicio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.ihm.sloz.R;

public class Recuperar extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recuperar);

        // Volvemos atrás
        ImageView arrow_back = findViewById(R.id.recup_back);
        arrow_back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        // Pasa a login cuando recupera contraseña
        TextView send_button = findViewById(R.id.send_button);
        send_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                changeActivity(Login.class);
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
        overridePendingTransition(R.anim.slide_in_bottom, R.anim.slide_out_top);
    }
}
