package com.example.kohshin.dougasample;

import java.io.IOException;
import java.nio.ByteBuffer;

import android.app.Activity;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;


public class MainActivity extends Activity {
    private static final boolean DEBUG = false;	// TODO set false on release
    private static final String TAG = "CameraFragment";

    private SurfaceView mSurfaceView1;
    private SurfaceView mSurfaceView2;

    private PlayView mPlayView1;
    private PlayView mPlayView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSurfaceView1 = (SurfaceView)findViewById(R.id.PlayView1);
        mSurfaceView2 = (SurfaceView)findViewById(R.id.PlayView2);
        mPlayView1 = new PlayView(this, mSurfaceView1,"video1.mp4");
        mPlayView2 = new PlayView(this, mSurfaceView2,"video2.mp4");

    }

    @Override
    public void onResume() {
        super.onResume();
        if (DEBUG) Log.v(TAG, "onResume:");
    }

    @Override
    public void onPause() {
        if (DEBUG) Log.v(TAG, "onPause:");
        super.onPause();
    }
}
