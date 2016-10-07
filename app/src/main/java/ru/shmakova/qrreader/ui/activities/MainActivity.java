package ru.shmakova.qrreader.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ru.shmakova.qrreader.R;
import ru.shmakova.qrreader.ui.fragments.QrReaderFragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.main_frame_layout, new QrReaderFragment())
                    .commit();
        }
    }
}
