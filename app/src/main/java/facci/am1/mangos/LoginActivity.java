package facci.am1.mangos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void Registro(View view){

        Intent registro = new Intent(this, RegistroActivity.class);
        startActivity(registro);
    }

    public void IniciarSesion(View view){

        Intent inicio = new Intent(this, MenuActivity.class);
        startActivity(inicio);
    }

}