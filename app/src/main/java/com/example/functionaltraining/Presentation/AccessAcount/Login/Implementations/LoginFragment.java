package com.example.functionaltraining.Presentation.AccessAcount.Login.Implementations;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.navigation.Navigation;

import com.example.functionaltraining.Base.BaseFragment;
import com.example.functionaltraining.Models.User;
import com.example.functionaltraining.R;
import com.google.android.material.textfield.TextInputEditText;

public class LoginFragment extends BaseFragment {
    private TextView tvRegisterUser;
    private TextInputEditText etEmailLogin;
    private EditText etPassLogin;
    private User user;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setCustomView(inflater.inflate(R.layout.fragment_login, container, false));

        tvRegisterUser = getCustomView().findViewById(R.id.tv_register_user);
        etEmailLogin = getCustomView().findViewById(R.id.et_email_login);
        etPassLogin = getCustomView().findViewById(R.id.et_Pass_Login);
        Button btnStartSection = getCustomView().findViewById(R.id.btn_start_section);

        btnStartSection.setOnClickListener( v-> {
            user = new User();
            user.setEmail(etEmailLogin.getText().toString());
            user.setPassword(etPassLogin.getText().toString());
            Toast.makeText(getContext(), getString(R.string.login_user), Toast.LENGTH_SHORT).show();
            Navigation.findNavController(requireView()).navigate(R.id.action_loginFragment_to_homeFragment);
        });
        tvRegisterUser.setOnClickListener(v-> Navigation.findNavController(requireView()).navigate(R.id.action_loginFragment_to_registerFragment));
        return getCustomView();
    }
}