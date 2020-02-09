package com.example.dagger2android.di;

import com.example.dagger2android.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(modules = AuthViewModelModule.class)
    abstract AuthActivity contributeAuthActivity();




}

