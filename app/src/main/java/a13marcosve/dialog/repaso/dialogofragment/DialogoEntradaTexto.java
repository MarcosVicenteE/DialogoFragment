package a13marcosve.dialog.repaso.dialogofragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Marcos on 28/04/2015.
 */
public class DialogoEntradaTexto extends DialogFragment {

    static DialogoEntradaTexto newInstance(String title) {
        DialogoEntradaTexto fragment = new DialogoEntradaTexto();
        Bundle args = new Bundle();
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getActivity().getSystemService(infService);
        // Inflamos o compoñente composto definido no XML
        View inflador = li.inflate(R.layout.dialogo_entrada_texto, null);
        // Buscamos os compoñentes dentro do Diálogo
        final TextView etNome = (TextView) inflador.findViewById(R.id.et_nome);
        final TextView etContrasinal = (TextView) inflador.findViewById(R.id.et_contrasinal);

        String title = getArguments().getString("title");
        return new AlertDialog.Builder(getActivity())
                .setTitle(title)
                .setView(inflador)
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int boton) {
                        Toast.makeText(getActivity(), "Escribiches nome: '" + etNome.getText().toString() + "'. Contrasinal: '" + etContrasinal.getText().toString() + "' e premeches 'Aceptar'",
                                Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int boton) {
                        Toast.makeText(getActivity(), "Premeches en 'Cancelar'", Toast.LENGTH_SHORT).show();
                    }
                })
                .create();
    }
}