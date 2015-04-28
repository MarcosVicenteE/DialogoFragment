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
public class DialogoSeleccionMultiple extends DialogFragment {

    static DialogoSeleccionMultiple newInstance(String title) {
        DialogoSeleccionMultiple fragment = new DialogoSeleccionMultiple();
        Bundle args = new Bundle();
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        String title = getArguments().getString("title");
        final String[] matriz = getResources().getStringArray(R.array.elementos_dialog_seleccion2);
        return new AlertDialog.Builder(getActivity())
                .setTitle(title)
                .setMultiChoiceItems(matriz, new boolean[]{false, true, false, true, false, false, false}, new DialogInterface.OnMultiChoiceClickListener() {
                    public void onClick(DialogInterface dialog, int opcion, boolean isChecked) {
                        // Evento que ocorre cando o usuario selecciona unha opción
                        if (isChecked)
                            Toast.makeText(getActivity(), "Seleccionaches " + matriz[opcion], Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(getActivity(), "Deseleccionaches " + matriz[opcion], Toast.LENGTH_SHORT).show();
                    }
                })
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int boton) {
                        Toast.makeText(getActivity(), "Premches 'Aceptar'", 1).show();
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int boton) {
                        Toast.makeText(getActivity(), "Premeches 'Cancelar'", 1).show();
                    }
                })
                .create();
    }
}
