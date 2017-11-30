package com.kinometrix.app.api;

import android.app.Activity;
import android.support.v7.app.AlertDialog;
import android.view.View;

import com.kinometrix.app.MdsRx;

/**
 *
 */

public enum ConnectionStateDialog {
    INSTANCE;

    private AlertDialog connectionStateDialog;

    public void showDialog(final Activity activity) {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(activity)
                .setTitle("Connection Error!")
                .setMessage("Movesense Disconnected")
                .setCancelable(false)
                .setPositiveButton("Reconnect", null);

        dialogBuilder.show().getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MdsRx.Instance.reconnect();
            }
        });

        connectionStateDialog = dialogBuilder.show();

    }

    public void dismissDialog() {
        if (connectionStateDialog != null && connectionStateDialog.isShowing()) {
            connectionStateDialog.dismiss();
            connectionStateDialog = null;
        }
    }
}
