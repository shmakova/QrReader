package ru.shmakova.qrreader.di.modules;

import android.app.Application;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by shmakova on 07.10.16.
 */

@Module
public class ApplicationModule {
    @NonNull
    private final Application application;

    public ApplicationModule(@NonNull Application application) {
        this.application = application;
    }

    @Provides
    @NonNull
    @Singleton
    public Application provideApp() {
        return application;
    }
}
