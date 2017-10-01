package ru.shmakova.qr.di.components;

import android.support.annotation.NonNull;

import dagger.Subcomponent;
import ru.shmakova.qr.di.modules.QrReaderModule;
import ru.shmakova.qr.di.scopes.PerFragment;
import ru.shmakova.qr.presentation.qr.QrReaderFragment;
import ru.shmakova.qr.presentation.qr.QrReaderPresenter;


/**
 * Created by shmakova on 07.10.16.
 */

@PerFragment
@Subcomponent(modules = QrReaderModule.class)
public interface QrReaderComponent {
    void inject(@NonNull QrReaderFragment qrReaderFragment);

    QrReaderPresenter presenter();
}
