package com.mobile.jsn.jsn13_nukem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    Button botaoLogin = (Button) findViewById(R.id.botaoLogar);

        botaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),PrincipalActivity.class);
                 startActivity(i);
            }
        });


        Button botaoCriar = (Button) findViewById(R.id.botaoCriarConta);

        botaoCriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent i = new Intent(v.getContext(),NovoUsuario.class);
                startActivity(i);
            }
        });


    }



}
