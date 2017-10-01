package ru.shmakova.qr;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import ru.shmakova.qr.di.components.ApplicationComponent;
import ru.shmakova.qr.di.components.DaggerApplicationComponent;
import ru.shmakova.qr.di.modules.ApplicationModule;
import timber.log.Timber;

/**
 * Created by shmakova on 19.09.16.
 */

public class App extends Application {
    private ApplicationComponent applicationComponent;

    @NonNull
    public static App get(@NonNull Context context) {
        return (App) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = prepareApplicationComponent().build();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }

    @NonNull
    protected DaggerApplicationComponent.Builder prepareApplicationComponent() {
        return DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this));
    }

    @NonNull
    public ApplicationComponent applicationComponent() {
        return applicationComponent;
    }

}
