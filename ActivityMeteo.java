package com.celine_creations.android.meteo;

import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

public class ActivityMeteo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("ActivityMeteo", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meteo);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.contenu,new FragmentListe());
        transaction.commit();
      }
}

