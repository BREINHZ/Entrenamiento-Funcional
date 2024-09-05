package com.example.functionaltraining.Presentation.Dash.Home.ui.menu_diario;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.functionaltraining.databinding.FragmentDiarioBinding;

public class MenuDiarioFragment extends Fragment {

    private FragmentDiarioBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentDiarioBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView tvDiario = binding.tvDiario;
        final ImageView ivDiario = binding.ivDiario;

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}