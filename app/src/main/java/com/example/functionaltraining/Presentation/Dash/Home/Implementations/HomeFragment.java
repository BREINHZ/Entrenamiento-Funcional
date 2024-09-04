package com.example.functionaltraining.Presentation.Dash.Home.Implementations;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.functionaltraining.Base.BaseFragment;
import com.example.functionaltraining.DataAccess.SharedPreferences.SessionManager;
import com.example.functionaltraining.R;

public class HomeFragment extends BaseFragment {

    private ImageView ivLogout;
    private RecyclerView recycler;
    private SessionManager sessionManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setCustomView(inflater.inflate(R.layout.fragment_home, container, false));
        ivLogout = getCustomView().findViewById(R.id.iv_logout);
        recycler = getCustomView().findViewById(R.id.rvHome);

        return getCustomView();
    }

    @Override
    public void onResume() {
        super.onResume();
        sessionManager = new SessionManager(requireContext());
        ivLogout.setOnClickListener(v -> {
            sessionManager.logout();
            Toast.makeText(getContext(), getString(R.string.user)+sessionManager.getUserEmail()+getString(R.string.user_deslogueado), Toast.LENGTH_SHORT).show();
            Navigation.findNavController(requireView()).navigate(R.id.action_homeFragment_to_loginFragment);
        });
        displaySesion();
    }

    private void displaySesion(){
        if (!sessionManager.isLoggedIn()) {
            Navigation.findNavController(requireView()).navigate(R.id.action_homeFragment_to_loginFragment);
            Toast.makeText(getContext(), getString(R.string.user) + sessionManager.getUserEmail() + getString(R.string.user_deslogueado), Toast.LENGTH_SHORT).show();
        }
    }
}