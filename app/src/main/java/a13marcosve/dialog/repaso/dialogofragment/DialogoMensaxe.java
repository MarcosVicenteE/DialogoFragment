package a13marcosve.dialog.repaso.dialogofragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class DialogoMensaxe extends DialogFragment {

    static DialogoMensaxe newInstance(String title){
        DialogoMensaxe fragment = new DialogoMensaxe();
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
                .setMessage("Nova mensaxe.Prema o boton 'back' para volver a pantalla principal.")
                .create();
    }
}
