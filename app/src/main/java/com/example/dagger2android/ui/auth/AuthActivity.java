package com.example.dagger2android.ui.auth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import dagger.android.support.DaggerAppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.RequestManager;
import com.example.dagger2android.R;
import com.example.dagger2android.viewmodel.ViewModelProvidersFactory;

import javax.inject.Inject;
import javax.inject.Named;

public class AuthActivity extends DaggerAppCompatActivity {

    private static final String TAG = "AuthActivity";
    private ViewModel viewModel;

    @Inject
    ViewModelProvidersFactory viewModelProvidersFactory;

    @Inject
    Drawable logo;

    @Inject
    RequestManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        viewModel = ViewModelProviders.of(this, viewModelProvidersFactory).get(AuthViewModel.class);

        setLogo();
    }


    private void setLogo(){
        manager.load(logo)
                .into((ImageView) findViewById(R.id.login_logo));
    }
}
