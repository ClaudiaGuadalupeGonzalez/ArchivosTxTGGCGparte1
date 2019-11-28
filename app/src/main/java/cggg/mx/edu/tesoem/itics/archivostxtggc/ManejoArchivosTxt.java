package cggg.mx.edu.tesoem.itics.archivostxtggc;

import android.app.Activity;
import android.content.Context;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class ManejoArchivosTxt {
    public  void grabar(String dato, Context contexto) throws IOException{
        OutputStreamWriter archivo = new OutputStreamWriter(contexto.openFileOutput("DatosGGCG.txt", Activity.MODE_PRIVATE));
        archivo.write(dato);
        archivo.flush();
        archivo.close();
    }
   public boolean leer(){
        return true;
   }
}
