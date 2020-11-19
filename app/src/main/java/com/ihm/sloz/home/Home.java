package com.ihm.sloz.home;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import com.ihm.sloz.R;

public class Home extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        Button home_busqueda_btn = findViewById(R.id.home_busqueda_btn);
        home_busqueda_btn.getBackground().setColorFilter(0xFFFFFFFF, PorterDuff.Mode.SRC_ATOP);
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
}
