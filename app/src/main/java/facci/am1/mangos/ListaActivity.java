package facci.am1.mangos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;


public class ListaActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
    }

    public void VolverMenuLista(View view){

        Intent lista = new Intent(this, MenuActivity.class);
        startActivity(lista);
    }


    public void MetodoMostrarproveedor(View view) {
       Intent  mostrarproveedor = new Intent(this, ListaConDataDummy.class);
       startActivity(mostrarproveedor);

    }
}