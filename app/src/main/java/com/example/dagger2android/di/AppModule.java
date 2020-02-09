package com.example.dagger2android.di;


import android.app.Application;
import android.graphics.drawable.Drawable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.example.dagger2android.BaseApplication;
import com.example.dagger2android.R;

import javax.inject.Named;
import javax.inject.Singleton;

import androidx.core.content.ContextCompat;
import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Singleton
    @Provides
    static RequestOptions getRequestOption() {
        return RequestOptions
                .placeholderOf(R.drawable.default_img)
                .error(R.drawable.default_img);
    }

    @Singleton
    @Provides
    static RequestManager getGlideInstance(Application application, RequestOptions requestOptions){
        return Glide.with(application).setDefaultRequestOptions(requestOptions);
    }


    @Singleton
    @Provides
    static Drawable provideAppDrawable(Application application){
        return ContextCompat.getDrawable(application, R.drawable.logo);
    }
}
