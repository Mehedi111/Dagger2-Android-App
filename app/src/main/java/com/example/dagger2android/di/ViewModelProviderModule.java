package com.example.dagger2android.di;

import com.example.dagger2android.viewmodel.ViewModelProvidersFactory;

import androidx.lifecycle.ViewModelProvider;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelProviderModule {

    @Binds
    abstract ViewModelProvider.Factory getViewModelProviderFactory(ViewModelProvidersFactory viewModelProvidersFactory);
}
