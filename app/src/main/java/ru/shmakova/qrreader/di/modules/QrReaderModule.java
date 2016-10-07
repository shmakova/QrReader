package ru.shmakova.qrreader.di.modules;

import android.support.annotation.NonNull;

import dagger.Module;
import dagger.Provides;
import ru.shmakova.qrreader.presentation.presenters.QrReaderPresenter;

/**
 * Created by shmakova on 07.10.16.
 */

@Module
public class QrReaderModule {
    @Provides
    @NonNull
    public QrReaderPresenter provideQrReaderPresenter() {
        return new QrReaderPresenter();
    }
}
