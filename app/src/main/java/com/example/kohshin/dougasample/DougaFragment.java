package com.example.kohshin.dougasample;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;


public class DougaFragment extends Fragment {

    private static final boolean DEBUG = false;	// TODO set false on release
    private static final String TAG = "CameraFragment";

    private SurfaceView mSurfaceView1;
    private SurfaceView mSurfaceView2;

    private PlayView mPlayView1;
    private PlayView mPlayView2;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        mSurfaceView1 = (SurfaceView)rootView.findViewById(R.id.PlayView1);
        mSurfaceView2 = (SurfaceView)rootView.findViewById(R.id.PlayView2);
        mPlayView1 = new PlayView(getActivity(), mSurfaceView1, "video1.mp4");
        mPlayView2 = new PlayView(getActivity(), mSurfaceView2,"video2.mp4");


        return rootView;
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
