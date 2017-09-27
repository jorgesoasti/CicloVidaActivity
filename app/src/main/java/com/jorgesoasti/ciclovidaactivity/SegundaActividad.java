package com.jorgesoasti.ciclovidaactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SegundaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);
        Toast.makeText(this, getResources().getString(R.string.onCreate) + "2", Toast.LENGTH_SHORT).show();

        final TextView tvDos = (TextView) findViewById(R.id.tvDos);

        Bundle parametros = getIntent().getExtras();
        String texto1 = parametros.getString("One");
        tvDos.setText("Pantalla 2 + " + texto1);

        Button btnDos = (Button) findViewById(R.id.btnDos);

        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto2 = tvDos.getText().toString();
                Intent intent = new Intent(SegundaActividad.this, MainActivity.class);
                intent.putExtra("Two", texto2);
                setResult(RESULT_OK, intent);
                onBackPressed();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, getResources().getString(R.string.onStart) + "2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, getResources().getString(R.string.onResume) + "2", Toast.LENGTH_SHORT).show();
    }

    //Actividad Corriendo

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, getResources().getString(R.string.onRestart) + "2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, getResources().getString(R.string.onPause) + "2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, getResources().getString(R.string.onStop) + "2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, getResources().getString(R.string.onDestroy) + "2", Toast.LENGTH_SHORT).show();
    }
}
