package ru.shmakova.qr.di.components;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Component;
import ru.shmakova.qr.di.modules.ApplicationModule;
import ru.shmakova.qr.di.modules.QrReaderModule;

@Singleton
@Component(modules = {
        ApplicationModule.class
})
public interface ApplicationComponent {
    @NonNull
    QrReaderComponent plus(QrReaderModule module);
}
