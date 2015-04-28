package a13marcosve.dialog.repaso.dialogofragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Marcos on 28/04/2015.
 */
public class DialogoUnicaSeleccion extends DialogFragment {

    static DialogoUnicaSeleccion newInstance(String title) {
        DialogoUnicaSeleccion fragment = new DialogoUnicaSeleccion();
        Bundle args = new Bundle();
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        String title = getArguments().getString("title");
        final CharSequence[] smartphones = {"iPhone", "Blackberry", "Android"};
        return new AlertDialog.Builder(getActivity())

                .setTitle(title)
                .setSingleChoiceItems(smartphones, 0, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int opcion) {
                        // Evento que ocorre cando o usuario selecciona una opción
                        Toast.makeText(getActivity(), "Seleccionaches: " + smartphones[opcion], Toast.LENGTH_SHORT).show();
                    }
                })
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int boton) {
                        Toast.makeText(getActivity(), "Premeches 'Aceptar'", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int boton) {
                        Toast.makeText(getActivity(), "Premeches 'Cancelar'", Toast.LENGTH_SHORT).show();
                    }
                })
                .create();
    }
}