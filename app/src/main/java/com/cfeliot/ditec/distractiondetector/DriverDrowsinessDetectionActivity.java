package com.cfeliot.ditec.distractiondetector;

import android.os.Bundle;

import com.cfeliot.ditec.helpers.MLVideoHelperActivity;
import com.cfeliot.ditec.helpers.vision.VisionBaseProcessor;
import com.cfeliot.ditec.helpers.vision.drowsiness.FaceDrowsinessDetectorProcessor;

public class DriverDrowsinessDetectionActivity extends MLVideoHelperActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected VisionBaseProcessor setProcessor() {
        return new FaceDrowsinessDetectorProcessor(graphicOverlay);
    }
}
