package ru.shmakova.qrreader.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.shmakova.qrreader.App;
import ru.shmakova.qrreader.R;
import ru.shmakova.qrreader.di.components.QrReaderComponent;
import ru.shmakova.qrreader.di.modules.QrReaderModule;

/**
 * Created by shmakova on 07.10.16.
 */

public class QrReaderFragment extends Fragment {

    QrReaderComponent qrReaderComponent;

    protected void injectDependencies() {
        qrReaderComponent =
                App.get(getContext()).applicationComponent().plus(new QrReaderModule());
        qrReaderComponent.inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        injectDependencies();
        return inflater.inflate(R.layout.fragment_qr, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
