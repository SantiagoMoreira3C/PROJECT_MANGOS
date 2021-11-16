package facci.am1.mangos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void MiLista(View view){

        Intent lista = new Intent(this, ListaActivity.class);
        startActivity(lista);
    }

    public void EntrarCategoria(View view){

        Intent categoria = new Intent(this, CategoriaActivity.class);
        startActivity(categoria);
    }

    public void EntrarConfiguracion(View view){

        Intent configuracion = new Intent(this, ConfiguracionActivity.class);
        startActivity(configuracion);
    }

    public void EntrarProveedor(View view){

        Intent proveedor = new Intent(this, ProveedorActivity.class);
        startActivity(proveedor);
    }
    public void EntrarProducto(View view){

        Intent producto = new Intent(this, ProductoActivity.class);
        startActivity(producto);
    }

    public void Salir(View view){

        Intent salir = new Intent(this,LoginActivity.class);
        startActivity(salir);
    }

}