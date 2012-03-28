package com.github.sashacrofter.gitdroid.git;

import com.github.sashacrofter.gitdroid.R;
import com.github.sashacrofter.gitdroid.R.layout;

import android.app.Activity;
import android.os.Bundle;

public class GitDroidActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}