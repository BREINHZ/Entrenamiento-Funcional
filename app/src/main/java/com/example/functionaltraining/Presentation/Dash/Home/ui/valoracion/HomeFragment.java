package com.example.functionaltraining.Presentation.Dash.Home.ui.valoracion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.example.functionaltraining.Base.BaseFragment;
import com.example.functionaltraining.R;
import com.example.functionaltraining.databinding.FragmentHomeBinding;

import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.widget.MediaController;
import android.net.Uri;

public class HomeFragment extends BaseFragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        setCustomView(binding.getRoot());

        //imagenOnline(getString(R.string.url_image_valoracion), binding.ivValoracion);

        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/5uCFBKAI3dE\" title=\"Examen físico del adulto\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        binding.webView.loadData(video, "text/html", "utf-8");
        WebSettings webSettings = binding.webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        binding.webView.setWebChromeClient(new WebChromeClient());

        return getCustomView();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}