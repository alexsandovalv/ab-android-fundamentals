package com.androidbootcamp.androidtemplate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class UIEventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uievents);
        ui();
    }


    private void ui() {
        findViewById(R.id.btnClick).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoBasicEvents();
            }
        });

        findViewById(R.id.btnForm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoForm();
            }
        });

        findViewById(R.id.btnItems).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoItemsEvents();
            }
        });

        findViewById(R.id.btnKeyboard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoKeyboardEvents();
            }
        });
    }

    private void gotoBasicEvents() {
        startActivity(new Intent(this,BasicEventsActivity.class));
    }

    private void gotoItemsEvents() {
        startActivity(new Intent(this,ItemsEventsActivity.class));
    }

    private void gotoForm() {
        startActivity(new Intent(this,FormularioActivity.class));
    }

    private void gotoKeyboardEvents() {
        startActivity(new Intent(this,KeyboardEventsActivity.class));
    }
}