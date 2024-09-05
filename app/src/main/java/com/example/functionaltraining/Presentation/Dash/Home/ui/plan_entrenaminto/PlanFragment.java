package com.example.functionaltraining.Presentation.Dash.Home.ui.plan_entrenaminto;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.functionaltraining.databinding.FragmentPlanBinding;

public class PlanFragment extends Fragment {

    private FragmentPlanBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentPlanBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView tvPlan = binding.tvPlan;
        final ImageView ivPlan = binding.ivPlan;
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}