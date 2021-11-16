package facci.am1.mangos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListaConDataDummy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_con_data_dummy);
    }

    public void AtrasConfiguracioEditar(View view){

        Intent atraseditar = new Intent(this, ConfiguracionActivity.class);
        startActivity(atraseditar);
    }
}