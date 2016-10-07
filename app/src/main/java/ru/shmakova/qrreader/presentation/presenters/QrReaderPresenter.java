package ru.shmakova.qrreader.presentation.presenters;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;

import javax.inject.Inject;

import ru.shmakova.qrreader.presentation.views.QrReaderView;

/**
 * Created by shmakova on 07.10.16.
 */

public class QrReaderPresenter extends MvpBasePresenter<QrReaderView> {

    @Inject
    public QrReaderPresenter() {
    }
}
