package com.example.functionaltraining.Presentation.AccessAcount;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.functionaltraining.Base.BaseFragment;
import com.example.functionaltraining.R;

public class SplashFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setCustomView(inflater.inflate(R.layout.fragment_splash, container, false));
        return getCustomView();
    }
}