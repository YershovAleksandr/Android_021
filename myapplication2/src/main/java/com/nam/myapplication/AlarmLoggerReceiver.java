package com.nam.myapplication;

import java.text.DateFormat;
import java.util.Date;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AlarmLoggerReceiver extends BroadcastReceiver {

	private static final String TAG = "X42";
	@Override
	public void onReceive(Context context, Intent intent) {

		// Log receipt of the Intent with timestamp
		Log.i(TAG,"Logging alarm at:" + DateFormat.getDateTimeInstance().format(new Date()));

	}
}
