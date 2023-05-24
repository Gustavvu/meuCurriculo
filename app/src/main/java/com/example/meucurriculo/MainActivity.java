package com.example.meucurriculo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button botaoHabilidades, botaoProjetos, botaoEdu;
    TextView textViewEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoProjetos=findViewById(R.id.buttonProjetosId);
        botaoHabilidades=findViewById(R.id.buttonHabilidadesId);
        botaoEdu=findViewById(R.id.buttonEduId);
        textViewEmail=findViewById(R.id.textViewEmailId);

        textViewEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("mailto:gustavvupinto@gmail.com"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        botaoHabilidades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(),ActivityHabilidades.class));
            }
        });

        botaoProjetos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(),ActivityProjetos.class));
            }
        });

        botaoEdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(),ActivityEdu.class));
            }
        });


    }
}