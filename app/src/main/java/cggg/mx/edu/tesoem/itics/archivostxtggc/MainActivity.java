package cggg.mx.edu.tesoem.itics.archivostxtggc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText txtnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre = findViewById(R.id.txtnombre);
    }

    public void MGrabar(View v){
        ManejoArchivosTxt controlador = new ManejoArchivosTxt();
        try {
            controlador.grabar(txtnombre.getText().toString(), this);
        }catch (IOException e){
            e.printStackTrace();

        }
    }
}
