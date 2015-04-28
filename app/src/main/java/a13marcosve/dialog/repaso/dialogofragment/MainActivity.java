package a13marcosve.dialog.repaso.dialogofragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    private Button btnDialogoMensaxe;
    private Button btnDialogoTresBotons;
    private Button btnDialogoLista;
    private Button btnDialogoSeleccionUnica;
    private Button btnDialogoSeleccionMultiple;
    private Button btnDialogoEntradaTexto;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DIALOGO MENSAXE
        btnDialogoMensaxe = (Button) findViewById(R.id.btn_dialogo);
        btnDialogoMensaxe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                DialogoMensaxe dialogFragment = DialogoMensaxe
                        .newInstance("Atencion");
                dialogFragment.show(getFragmentManager(), "dialog");
            }

        });//FIN

        //DIALOGO CON TRES BOTONS
        btnDialogoTresBotons = (Button) findViewById(R.id.btn_diag_tres_botons);
        btnDialogoTresBotons.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                DialogoTresBotons dialogFragment = DialogoTresBotons
                        .newInstance("Enquisa");
                dialogFragment.show(getFragmentManager(), "dialog");
            }

        });//FIN

        //DIALOGO LISTA
        btnDialogoLista = (Button) findViewById(R.id.btn_diag_list_selecc);
        btnDialogoLista.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                DialogoLista dialogFragment = DialogoLista
                        .newInstance("Escolle unha opcion");
                dialogFragment.show(getFragmentManager(), "dialog");
            }

        });//FIN

        //DIALOGO SELECCION UNICA
        btnDialogoSeleccionUnica = (Button) findViewById(R.id.btn_diag_radio_button);
        btnDialogoSeleccionUnica.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                DialogoUnicaSeleccion dialogFragment = DialogoUnicaSeleccion
                        .newInstance("Selecciona un smartpohone");
                dialogFragment.show(getFragmentManager(), "dialog");
            }

        });//FIN

        //DIALOGO SELECCION MULTIPLE
        btnDialogoSeleccionMultiple = (Button) findViewById(R.id.btn_diag_checkbox);
        btnDialogoSeleccionMultiple.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                DialogoSeleccionMultiple dialogFragment = DialogoSeleccionMultiple
                        .newInstance("Selecciona modos de transporte");
                dialogFragment.show(getFragmentManager(), "dialog");
            }

        });//FIN

        //DIALOGO ENTRADA DE TEXTO
        btnDialogoEntradaTexto = (Button) findViewById(R.id.btn_diag_entrada_texto);
        btnDialogoEntradaTexto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                DialogoEntradaTexto dialogFragment = DialogoEntradaTexto
                        .newInstance("Inicia usuario e contrasinal");
                dialogFragment.show(getFragmentManager(), "dialog");
            }

        });//FIN
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
