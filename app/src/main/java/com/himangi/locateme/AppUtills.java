package com.himangi.locateme;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by imobdev55 on 18/1/17 at 2:21 PM.
 */

public class AppUtills {

    public static ProgressDialog showProgressDialog(Context context, String message){
        ProgressDialog dialog = new ProgressDialog(context);
        dialog.setMessage(message);
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialog.setCancelable(false);
        return dialog;
    }

}
