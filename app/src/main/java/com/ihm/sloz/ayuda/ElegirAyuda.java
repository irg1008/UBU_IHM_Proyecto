package com.ihm.sloz.ayuda;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ihm.sloz.R;

import org.w3c.dom.Text;

public class ElegirAyuda extends AppCompatActivity {

    ConstraintLayout expandableView;
    Button arrowBtn;
    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elegir_ayuda);

        expandableView = findViewById(R.id.expandableView);
        arrowBtn = findViewById(R.id.arrowBtn);
        cardView = findViewById(R.id.cardView);

        arrowBtn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                if (expandableView.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    expandableView.setVisibility(View.VISIBLE);
                    arrowBtn.setBackgroundResource(R.drawable.ic_chevron_right_black_24dp);
                } else {
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    expandableView.setVisibility(View.GONE);
                    arrowBtn.setBackgroundResource(R.drawable.ic_chevron_right_black_24dp);
                }
            }
        });
        // Pasa a chat
        TextView ele1 = findViewById(R.id.ele1);
        TextView ele2 = findViewById(R.id.ele2);
        ele1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                changeActivity(ElegirAyuda.class);
                animDerIzq();
            }
        });
        ele2.setOnClickListener(new View.OnClickListener() {
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