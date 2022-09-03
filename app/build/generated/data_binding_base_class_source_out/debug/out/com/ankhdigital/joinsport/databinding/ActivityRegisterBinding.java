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

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btnRegister;

  @NonNull
  public final TextInputEditText tietConfirmPassword;

  @NonNull
  public final TextInputEditText tietEmail;

  @NonNull
  public final TextInputEditText tietFullname;

  @NonNull
  public final TextInputEditText tietPassword;

  @NonNull
  public final TextInputLayout tilConfirmPassword;

  @NonNull
  public final TextInputLayout tilEmail;

  @NonNull
  public final TextInputLayout tilFullname;

  @NonNull
  public final TextInputLayout tilPassword;

  @NonNull
  public final TextView tvAlreadyHaveAccount;

  @NonNull
  public final TextView tvLogin;

  @NonNull
  public final TextView tvTitleRegister;

  private ActivityRegisterBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton btnRegister, @NonNull TextInputEditText tietConfirmPassword,
      @NonNull TextInputEditText tietEmail, @NonNull TextInputEditText tietFullname,
      @NonNull TextInputEditText tietPassword, @NonNull TextInputLayout tilConfirmPassword,
      @NonNull TextInputLayout tilEmail, @NonNull TextInputLayout tilFullname,
      @NonNull TextInputLayout tilPassword, @NonNull TextView tvAlreadyHaveAccount,
      @NonNull TextView tvLogin, @NonNull TextView tvTitleRegister) {
    this.rootView = rootView;
    this.btnRegister = btnRegister;
    this.tietConfirmPassword = tietConfirmPassword;
    this.tietEmail = tietEmail;
    this.tietFullname = tietFullname;
    this.tietPassword = tietPassword;
    this.tilConfirmPassword = tilConfirmPassword;
    this.tilEmail = tilEmail;
    this.tilFullname = tilFullname;
    this.tilPassword = tilPassword;
    this.tvAlreadyHaveAccount = tvAlreadyHaveAccount;
    this.tvLogin = tvLogin;
    this.tvTitleRegister = tvTitleRegister;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_register;
      MaterialButton btnRegister = ViewBindings.findChildViewById(rootView, id);
      if (btnRegister == null) {
        break missingId;
      }

      id = R.id.tiet_confirm_password;
      TextInputEditText tietConfirmPassword = ViewBindings.findChildViewById(rootView, id);
      if (tietConfirmPassword == null) {
        break missingId;
      }

      id = R.id.tiet_email;
      TextInputEditText tietEmail = ViewBindings.findChildViewById(rootView, id);
      if (tietEmail == null) {
        break missingId;
      }

      id = R.id.tiet_fullname;
      TextInputEditText tietFullname = ViewBindings.findChildViewById(rootView, id);
      if (tietFullname == null) {
        break missingId;
      }

      id = R.id.tiet_password;
      TextInputEditText tietPassword = ViewBindings.findChildViewById(rootView, id);
      if (tietPassword == null) {
        break missingId;
      }

      id = R.id.til_confirm_password;
      TextInputLayout tilConfirmPassword = ViewBindings.findChildViewById(rootView, id);
      if (tilConfirmPassword == null) {
        break missingId;
      }

      id = R.id.til_email;
      TextInputLayout tilEmail = ViewBindings.findChildViewById(rootView, id);
      if (tilEmail == null) {
        break missingId;
      }

      id = R.id.til_fullname;
      TextInputLayout tilFullname = ViewBindings.findChildViewById(rootView, id);
      if (tilFullname == null) {
        break missingId;
      }

      id = R.id.til_password;
      TextInputLayout tilPassword = ViewBindings.findChildViewById(rootView, id);
      if (tilPassword == null) {
        break missingId;
      }

      id = R.id.tv_already_have_account;
      TextView tvAlreadyHaveAccount = ViewBindings.findChildViewById(rootView, id);
      if (tvAlreadyHaveAccount == null) {
        break missingId;
      }

      id = R.id.tv_login;
      TextView tvLogin = ViewBindings.findChildViewById(rootView, id);
      if (tvLogin == null) {
        break missingId;
      }

      id = R.id.tv_title_register;
      TextView tvTitleRegister = ViewBindings.findChildViewById(rootView, id);
      if (tvTitleRegister == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((ConstraintLayout) rootView, btnRegister,
          tietConfirmPassword, tietEmail, tietFullname, tietPassword, tilConfirmPassword, tilEmail,
          tilFullname, tilPassword, tvAlreadyHaveAccount, tvLogin, tvTitleRegister);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
