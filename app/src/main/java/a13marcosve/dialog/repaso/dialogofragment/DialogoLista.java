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
public class DialogoLista extends DialogFragment {

    static DialogoLista newInstance(String title) {
        DialogoLista fragment = new DialogoLista();
        Bundle args = new Bundle();
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        String title = getArguments().getString("title");
        return new AlertDialog.Builder(getActivity())
                .setTitle(title)
                .setItems(R.array.elementos_dialog_seleccion, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int opcion) {
                        String[] opcions = getResources().getStringArray(R.array.elementos_dialog_seleccion);
                        Toast.makeText(getActivity(), "Seleccionaches: '" + opcions[opcion] + "'", Toast.LENGTH_SHORT).show();
                    }
                })
                .create();
    }
}