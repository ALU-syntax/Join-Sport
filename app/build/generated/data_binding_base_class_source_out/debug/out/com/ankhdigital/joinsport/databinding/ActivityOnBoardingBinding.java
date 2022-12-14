// Generated by view binder compiler. Do not edit!
package com.ankhdigital.joinsport.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ankhdigital.joinsport.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOnBoardingBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btnGetstarted;

  @NonNull
  public final ImageView ivHeader;

  @NonNull
  public final View line;

  @NonNull
  public final TextView tvSubwelcome;

  @NonNull
  public final TextView tvWelcome;

  private ActivityOnBoardingBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton btnGetstarted, @NonNull ImageView ivHeader, @NonNull View line,
      @NonNull TextView tvSubwelcome, @NonNull TextView tvWelcome) {
    this.rootView = rootView;
    this.btnGetstarted = btnGetstarted;
    this.ivHeader = ivHeader;
    this.line = line;
    this.tvSubwelcome = tvSubwelcome;
    this.tvWelcome = tvWelcome;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOnBoardingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOnBoardingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_on_boarding, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOnBoardingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_getstarted;
      MaterialButton btnGetstarted = ViewBindings.findChildViewById(rootView, id);
      if (btnGetstarted == null) {
        break missingId;
      }

      id = R.id.iv_header;
      ImageView ivHeader = ViewBindings.findChildViewById(rootView, id);
      if (ivHeader == null) {
        break missingId;
      }

      id = R.id.line;
      View line = ViewBindings.findChildViewById(rootView, id);
      if (line == null) {
        break missingId;
      }

      id = R.id.tv_subwelcome;
      TextView tvSubwelcome = ViewBindings.findChildViewById(rootView, id);
      if (tvSubwelcome == null) {
        break missingId;
      }

      id = R.id.tv_welcome;
      TextView tvWelcome = ViewBindings.findChildViewById(rootView, id);
      if (tvWelcome == null) {
        break missingId;
      }

      return new ActivityOnBoardingBinding((ConstraintLayout) rootView, btnGetstarted, ivHeader,
          line, tvSubwelcome, tvWelcome);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
