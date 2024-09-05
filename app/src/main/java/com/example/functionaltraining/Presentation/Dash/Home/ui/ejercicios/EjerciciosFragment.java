package com.example.functionaltraining.Presentation.Dash.Home.ui.ejercicios;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.functionaltraining.databinding.FragmentEjerciciosBinding;

public class EjerciciosFragment extends Fragment {

    private FragmentEjerciciosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentEjerciciosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView tvEjercicios = binding.tvEjercicios;
        final ImageView ivEjercicios = binding.ivEjercicios;
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}