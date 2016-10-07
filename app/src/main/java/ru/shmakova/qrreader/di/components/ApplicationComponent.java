package ru.shmakova.qrreader.di.components;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Component;
import ru.shmakova.qrreader.di.modules.ApplicationModule;
import ru.shmakova.qrreader.di.modules.QrReaderModule;


/**
 * Created by shmakova on 07.10.16.
 */

@Singleton
@Component(modules = {
        ApplicationModule.class
})
public interface ApplicationComponent {
    @NonNull
    QrReaderComponent plus(QrReaderModule module);
}
