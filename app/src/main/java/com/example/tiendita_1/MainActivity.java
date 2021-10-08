package com.example.tiendita_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton imgMango;
    private ImageButton imgFrutilla;
    private ImageButton imgManzana;
    private FloatingActionButton btnFloating;

    private RadioButton rbMango;
    private RadioButton rbFrutilla;
    private RadioButton rbManzana;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgMango = findViewById(R.id.imgMango);
        imgFrutilla = findViewById(R.id.imgFrutilla);
        imgManzana = findViewById(R.id.imgManzana);
        btnFloating = findViewById(R.id.btnFloating);

        rbMango = findViewById(R.id.rbMango);
        rbFrutilla = findViewById(R.id.rbFrutilla);
        rbManzana = findViewById(R.id.rbManzana);

        imgMango.setImageResource(R.drawable.mango);
        imgFrutilla.setImageResource(R.drawable.frutilla);
        imgManzana.setImageResource(R.drawable.manzana);

        imgMango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                muestraToast("Has selecionado el mango");
            }
        });
        imgFrutilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                muestraToast("Has selecionado la frutilla");
            }
        });
        imgManzana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              muestraToast("Has selecionado la manzana");
            }
        });

        btnFloating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (rbMango.isChecked()){
                    muestraToast("Gracias por compartir un mango!!");
                }else  if (rbFrutilla.isChecked()){
                    muestraToast("Gracias por compartir una frutilla!!");
                } else  if (rbManzana.isChecked()){
                    muestraToast("Gracias por compartir una manzana!!");
                } else {
                    muestraToast("Seleccione un elemento de la lista...");
                }

            }
        });

    }

    public void muestraToast(String mens){
        Toast.makeText(MainActivity.this, mens, Toast.LENGTH_SHORT).show();
    }

}