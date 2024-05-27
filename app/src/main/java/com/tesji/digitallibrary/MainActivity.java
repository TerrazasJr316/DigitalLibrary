package com.tesji.digitallibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText txNoBook;
    private TextInputEditText txTitle;
    private TextInputEditText txby;
    private TextInputEditText txEdit;
    private TextInputEditText txYear;
    private Button btRegistrer;
    private Button btNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. Referenciar los views declarados con el id
        //definido en el xml (vista)
        txNoBook = findViewById(R.id.txtNoBook);
        txTitle = findViewById(R.id.txtTitle);
        txby = findViewById(R.id.txtBy);
        txEdit = findViewById(R.id.txtEdit);
        txYear = findViewById(R.id.txtYear);
        btRegistrer = findViewById(R.id.btnRegis);
        btNew = findViewById(R.id.btnNew);

        //para crear una instancia:
        //1.

        //3. Generar el evento clic para el boton
        btRegistrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //validando cajas vacias
                //el metodo trim elimina o limpia los caracteres a la izquierda y a la derecha los de en medio no los elimina porque ya es una cadena
                //el metodo length cuenta la dimension de los caracteres de esa cadena
                if (txTitle.getText().toString().trim().length()==0){
                    txTitle.setText(null);
                    txTitle.requestFocus();
                } else if (txNoBook.getText().toString().trim().length()==0) {
                    txNoBook.setText(null);
                    txNoBook.setError("Debes ingresar el numero del Libro");

                } else {
                    String titulo = txTitle.getText().toString().trim();
                    //al extraer el objetos es editable y no es string por eso se pone el .toString()
                    int anio = Integer.parseInt(txTitle.getText().toString());

                    Toast.makeText(getApplicationContext(),"Libro Guardado como " + titulo, Toast.LENGTH_LONG).show();
                }

            }
        });

        btNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txNoBook.setText(null);
                txTitle.setText(null);
                txby.setText(null);
                txEdit.setText(null);
                txYear.setText(null);
                //al extraer el objetos es editable y no es string por eso se pone el .toString()
                //int anio = Integer.parseInt(txAnacimiento.getText().toString());
            }
        });
    }


}