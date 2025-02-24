package com.example.appcilindro;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import Models.Cilindro;

public class MainActivity extends AppCompatActivity {
    EditText txtRadio, txtAltura;
    TextView lbVolumen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txtRadio = findViewById(R.id.txtRadio);
        txtAltura = findViewById(R.id.txtAltura);
        lbVolumen = findViewById(R.id.lbVolumen);
        lbVolumen.setText("");

    }
    public void CalcularVolumen(View boton){
        if(validar())
            return;

        double radio = Double.valueOf(txtRadio.getText().toString());
        double altura = Double.valueOf(txtAltura.getText().toString());
        Cilindro oC = new Cilindro(radio, altura);
    }

    private boolean validar() {
        if(txtRadio.getText().toString().trim().isEmpty()){
            txtRadio.setError("Campo Obligatorio");
            txtRadio.requestFocus();
            return true;
        }
        if(txtAltura.getText().toString().trim().isEmpty()){
            txtAltura.setError("Campo Obligatorio");
            txtAltura.requestFocus();
            return true;
        }
        return false;
    }

}