package com.kinometrix.app.api;

import android.content.Context;
import android.support.v7.app.AlertDialog;

import com.kinometrix.app.R;

/**
 * Singleton for Connecting dialog
 */

public enum ConnectingDialog {
    INSTANCE;

    private AlertDialog alertDialog;

    public void showDialog(Context context, String deviceAddress) {
        if (alertDialog == null) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context)
                    .setTitle(context.getString(R.string.connecting) + " to: " + deviceAddress)
                    .setMessage(R.string.please_wait_connecting);

            alertDialog = alertDialogBuilder.show();
        }
    }

    public void dismissDialog() {
        if (alertDialog != null && alertDialog.isShowing()) {
            alertDialog.dismiss();
            alertDialog = null;
        }
    }
}
