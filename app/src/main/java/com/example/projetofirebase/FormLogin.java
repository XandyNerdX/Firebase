package com.example.projetofirebase;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FormLogin extends AppCompatActivity {

    private TextView text_tela_cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        // Inicialize os componentes
        IniciarComponentes();

        // Descomente a linha abaixo se desejar ocultar a action bar
        //getSupportActionBar().hide(); <-- ta crashando o app quando coloco ele pra rodar!

        // Corrija o erro de digitação: setOnClickListener, em vez de setOnclickListener
        text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FormLogin.this, FormCadastro.class);
                startActivity(intent);
            }
        });
    }

    private void IniciarComponentes() {
        text_tela_cadastro = findViewById(R.id.text_tela_cadastro);
    }
}
