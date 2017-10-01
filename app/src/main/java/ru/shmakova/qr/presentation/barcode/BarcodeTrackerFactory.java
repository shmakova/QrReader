/*
 * Copyright (C) The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.shmakova.qr.presentation.barcode;

import android.content.Context;
import android.support.annotation.NonNull;

import com.google.android.gms.vision.MultiProcessor;
import com.google.android.gms.vision.Tracker;
import com.google.android.gms.vision.barcode.Barcode;

import ru.shmakova.qr.presentation.camera.GraphicOverlay;

class BarcodeTrackerFactory implements MultiProcessor.Factory<Barcode> {
    @NonNull
    private final GraphicOverlay<BarcodeGraphic> graphicOverlay;
    @NonNull
    private final Context context;

    public BarcodeTrackerFactory(@NonNull GraphicOverlay<BarcodeGraphic> graphicOverlay,
                                 @NonNull Context context) {
        this.graphicOverlay = graphicOverlay;
        this.context = context;
    }

    @Override
    public Tracker<Barcode> create(Barcode barcode) {
        BarcodeGraphic graphic = new BarcodeGraphic(graphicOverlay);
        return new BarcodeGraphicTracker(graphicOverlay, graphic, context);
    }
}

