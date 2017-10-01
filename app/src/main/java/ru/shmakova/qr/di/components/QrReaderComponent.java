package ru.shmakova.qr.di.components;

import dagger.Subcomponent;
import ru.shmakova.qr.di.modules.QrReaderModule;
import ru.shmakova.qr.di.scopes.PerFragment;

@PerFragment
@Subcomponent(modules = QrReaderModule.class)
public interface QrReaderComponent {
}
