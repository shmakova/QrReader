package ru.shmakova.qrreader.di.components;

import android.support.annotation.NonNull;

import dagger.Subcomponent;
import ru.shmakova.qrreader.di.modules.QrReaderModule;
import ru.shmakova.qrreader.di.scopes.PerFragment;
import ru.shmakova.qrreader.presentation.presenters.QrReaderPresenter;
import ru.shmakova.qrreader.ui.fragments.QrReaderFragment;


/**
 * Created by shmakova on 07.10.16.
 */

@PerFragment
@Subcomponent(modules = QrReaderModule.class)
public interface QrReaderComponent {
    void inject(@NonNull QrReaderFragment qrReaderFragment);

    QrReaderPresenter presenter();
}
