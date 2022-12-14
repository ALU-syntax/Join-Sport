// Generated by view binder compiler. Do not edit!
package com.ankhdigital.joinsport.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ankhdigital.joinsport.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btnLogin;

  @NonNull
  public final TextInputEditText tietEmail;

  @NonNull
  public final TextInputEditText tietPassword;

  @NonNull
  public final TextInputLayout tilEmail;

  @NonNull
  public final TextInputLayout tilPassword;

  @NonNull
  public final TextView tvDidntHaveAccount;

  @NonNull
  public final TextView tvRegister;

  @NonNull
  public final TextView tvTitleLogin;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull MaterialButton btnLogin,
      @NonNull TextInputEditText tietEmail, @NonNull TextInputEditText tietPassword,
      @NonNull TextInputLayout tilEmail, @NonNull TextInputLayout tilPassword,
      @NonNull TextView tvDidntHaveAccount, @NonNull TextView tvRegister,
      @NonNull TextView tvTitleLogin) {
    this.rootView = rootView;
    this.btnLogin = btnLogin;
    this.tietEmail = tietEmail;
    this.tietPassword = tietPassword;
    this.tilEmail = tilEmail;
    this.tilPassword = tilPassword;
    this.tvDidntHaveAccount = tvDidntHaveAccount;
    this.tvRegister = tvRegister;
    this.tvTitleLogin = tvTitleLogin;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_login;
      MaterialButton btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.tiet_email;
      TextInputEditText tietEmail = ViewBindings.findChildViewById(rootView, id);
      if (tietEmail == null) {
        break missingId;
      }

      id = R.id.tiet_password;
      TextInputEditText tietPassword = ViewBindings.findChildViewById(rootView, id);
      if (tietPassword == null) {
        break missingId;
      }

      id = R.id.til_email;
      TextInputLayout tilEmail = ViewBindings.findChildViewById(rootView, id);
      if (tilEmail == null) {
        break missingId;
      }

      id = R.id.til_password;
      TextInputLayout tilPassword = ViewBindings.findChildViewById(rootView, id);
      if (tilPassword == null) {
        break missingId;
      }

      id = R.id.tv_didnt_have_account;
      TextView tvDidntHaveAccount = ViewBindings.findChildViewById(rootView, id);
      if (tvDidntHaveAccount == null) {
        break missingId;
      }

      id = R.id.tv_register;
      TextView tvRegister = ViewBindings.findChildViewById(rootView, id);
      if (tvRegister == null) {
        break missingId;
      }

      id = R.id.tv_title_login;
      TextView tvTitleLogin = ViewBindings.findChildViewById(rootView, id);
      if (tvTitleLogin == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, btnLogin, tietEmail,
          tietPassword, tilEmail, tilPassword, tvDidntHaveAccount, tvRegister, tvTitleLogin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
