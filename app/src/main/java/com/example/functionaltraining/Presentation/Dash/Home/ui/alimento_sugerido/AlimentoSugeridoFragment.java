package com.example.functionaltraining.Presentation.Dash.Home.ui.alimento_sugerido;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.functionaltraining.databinding.FragmentAlimentosBinding;

public class AlimentoSugeridoFragment extends Fragment {

    private FragmentAlimentosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentAlimentosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView tvAlimentos = binding.tvAlimentos;
        final ImageView ivAlimentos = binding.ivAlimentos;
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}