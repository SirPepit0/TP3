package com.example.tp3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;

import android.content.ClipData;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ecouteur e = new Ecouteur();

        Button bouton = (Button)findViewById(R.id.aPropos);
        MenuView.ItemView recherche = (MenuView.ItemView)findViewById(R.id.action);
        bouton.setOnClickListener(e);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        MenuView.ItemView recherche = (MenuView.ItemView)findViewById(R.id.action);
        switch (item.getItemId()) {
            case R.id.action:
                Toast.makeText(MainActivity.this, "Rechercher", Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }

    class Ecouteur implements View.OnClickListener {

        Button bouton = (Button)findViewById(R.id.aPropos);
        MenuView.ItemView recherche = (MenuView.ItemView)findViewById(R.id.action);

        @Override
        public void onClick(View v) {
            bouton.setText("A propos");
            switch (v.getId()) {
                case R.id.action:
                    Toast.makeText(MainActivity.this, recherche.toString(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.aPropos:
                    Toast.makeText(MainActivity.this, bouton.getText(), Toast.LENGTH_SHORT).show();
                    break;
            }
        }


    }
}
