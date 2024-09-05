package com.example.functionaltraining.Presentation.Dash.Home.ui.rutinas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.functionaltraining.databinding.FragmentRutinasBinding;

public class RutinasFragment extends Fragment {

    private FragmentRutinasBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentRutinasBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView tvRutinas = binding.tvRutinas;
        final ImageView ivRutinas = binding.ivRutinas;
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}