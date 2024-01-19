package com.riechion.geradordefrases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    String[] senteces = {
            "A simplicidade é o último grau de sofisticação - Leonardo da Vinci",

            "Corra o risco, se der certo, Felicidade. Se não, sabedoria!",

            "Não seja escravo do dinheiro, faça do dinheiro seu escravo.",

            "Os obstáculos são apenas um meio de se fortalecer."
    };


    public void generate(View view ) {


        TextView text = findViewById(R.id.textResultado);
        int numRan = new Random().nextInt(4);
        String sentece = senteces[numRan];

        text.setText(sentece);


    }
    public void showAll(View view ){

        TextView text = findViewById(R.id.textResultado);

        String textoResultado = "";

        for (String sentece : senteces){
            textoResultado = textoResultado + sentece + "\n" + "\n";

        }

        text.setText(textoResultado);
    }
}
