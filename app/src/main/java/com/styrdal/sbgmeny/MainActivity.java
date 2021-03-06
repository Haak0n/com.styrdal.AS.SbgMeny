package com.styrdal.sbgmeny;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends ActionBarActivity
{
	
	public final static String EXTRA_MESSAGE = "com.styrdal.SbgMeny.MESSAGE";
	public static final String PREFS_NAME = "PrefsFile";
	protected static final String TAG = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		Log.e(TAG, "Inflating menu");
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}