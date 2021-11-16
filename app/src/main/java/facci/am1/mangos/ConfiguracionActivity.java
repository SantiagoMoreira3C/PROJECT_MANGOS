package facci.am1.mangos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConfiguracionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);
    }

    public void VolverMenuConfiguracion(View view){

        Intent volver = new Intent(this, MenuActivity.class);
        startActivity(volver);
    }
    public void IrMenuConfiguracionEditar(View view){

        Intent volver = new Intent(this, EditarConfiguracionActivity.class);
        startActivity(volver);
    }
}