package com.example.functionaltraining.Presentation.Dash.Home.ui.dias_entrenamiento;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.functionaltraining.databinding.FragmentDiasBinding;

public class DiasEntrenamientoFragment extends Fragment {

    private FragmentDiasBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentDiasBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView tvDias = binding.tvDias;
        final ImageView ivDias = binding.ivDias;
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}