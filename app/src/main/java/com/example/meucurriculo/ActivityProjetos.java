package com.example.meucurriculo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.net.URI;
import java.net.URL;

public class ActivityProjetos extends AppCompatActivity {

    private TextView textViewvoltar, textViewICMBIO, textViewReciclarayos, textViewLattes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projetos);

        textViewvoltar=findViewById(R.id.textViewBackId);
        textViewICMBIO=findViewById(R.id.textViewICMBIOId);
        textViewReciclarayos=findViewById(R.id.textViewReciclarayosId);
        textViewLattes=findViewById(R.id.textViewLattesId);

        textViewvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        textViewICMBIO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri.parse("https://play.google.com/store/apps/details?id=br.edu.ifma.icmbiodelta");
                Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=br.edu.ifma.icmbiodelta"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        textViewReciclarayos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=br.edu.ifma.lipi.reciclarayos"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        textViewLattes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://lattes.cnpq.br/0722742906912913"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }
}