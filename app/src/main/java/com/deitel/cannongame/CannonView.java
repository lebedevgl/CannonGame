package com.deitel.cannongame;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class CannonView extends SurfaceView {

    public static final int TARGET_SOUND_ID = 0;
    public static final int CANNON_SOUND_ID = 1;
    public static final int BLOCKER_SOUND_ID = 2;

    public CannonView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void stopGame() {

    }

    public void releaseResources() {

    }

    public void playSound(int soundId) {

    }

    public int getScreenHeight() {
        return 0;
    }
}
