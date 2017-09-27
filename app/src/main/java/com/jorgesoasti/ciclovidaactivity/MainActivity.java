package com.jorgesoasti.ciclovidaactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, getResources().getString(R.string.onCreate), Toast.LENGTH_SHORT).show();

        Button btnUno = (Button) findViewById(R.id.btnUno);

        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvUno = (TextView) findViewById(R.id.tvUno);
                String texto1 = tvUno.getText().toString();
                Intent intent = new Intent(MainActivity.this, SegundaActividad.class);
                intent.putExtra("One", texto1);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, getResources().getString(R.string.onStart), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, getResources().getString(R.string.onResume), Toast.LENGTH_SHORT).show();
    }

    //Actividad Corriendo

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, getResources().getString(R.string.onRestart), Toast.LENGTH_SHORT).show();
        //No funciona en este estado traer datos a la actividad principal
        //Bundle parametros = getIntent().getExtras();
        //String texto1 = parametros.getString("Two");
        //TextView tv1 = (TextView) findViewById(R.id.tvUno);
        //tv1.setText(texto1);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, getResources().getString(R.string.onPause), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, getResources().getString(R.string.onStop), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, getResources().getString(R.string.onDestroy), Toast.LENGTH_SHORT).show();
    }
}
