package com.jaychan.mumprogressdialog;


import android.app.Activity;
import android.app.Dialog;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

public class MumProgressDialog {

    private Dialog progressDialog;
    private TextView tvMsg;

    public MumProgressDialog(Activity activity) {
        progressDialog = new Dialog(activity, R.style.progress_dialog);
        progressDialog.setContentView(R.layout.dialog);
        progressDialog.setCancelable(true);
        progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        tvMsg = (TextView) progressDialog.findViewById(R.id.id_tv_loadingmsg);
        tvMsg.setVisibility(View.GONE);
    }


    public void setMessage(String message) {
        if (TextUtils.isEmpty(message)) {
            tvMsg.setVisibility(View.GONE);
        } else {
            tvMsg.setVisibility(View.VISIBLE);
            tvMsg.setText(message);
        }
    }

    public void show() {
        progressDialog.show();
    }

    public void dismiss() {
        progressDialog.dismiss();
    }

    public void setCancelable(boolean cancelable) {
        progressDialog.setCancelable(cancelable);
    }
}
