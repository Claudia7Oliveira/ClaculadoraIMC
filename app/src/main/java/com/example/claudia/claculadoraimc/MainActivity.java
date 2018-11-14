package com.example.claudia.claculadoraimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
/* Stam Lee - In memorian 13/11/2018*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final float[] imc = new float[1];
        Button btnCalcular = (Button) findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView peso = (TextView) findViewById(R.id.peso);
                TextView altura = (TextView) findViewById(R.id.altura);
                TextView resultado = (TextView) findViewById(R.id.resultado);
                TextView descicao = (TextView) findViewById(R.id.descricao);
                /**/
                int Peso = Integer.parseInt(peso.getText().toString());
                float Altura = Float.parseFloat(altura.getText().toString());
                /*calculo do imc*/
                imc[0] = Peso/(Altura * Altura);
                /*mostra mensagem*/
                if (imc[0]<18.5){
                    resultado.setText(imc[0]+"");
                    descicao.setText("Abaixo do peso ideal");
                }else if (imc[0]<25.0) {
                    resultado.setText(imc[0] + "");
                    descicao.setText("No  peso ideal");
                }else if (imc[0]<03.0) {
                    resultado.setText(imc[0] + "");
                    descicao.setText("Acima do peso ideal");
                }else{
                    resultado.setText(imc[0] + "");
                    descicao.setText("Obesidade");
                }
            }
        });


    }


}
