package com.nam.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.util.Log;
import android.widget.Toast;

public class Receiver22 extends BroadcastReceiver {

	private final String TAG = "X42";

	@Override
	public void onReceive(Context context, Intent intent) {

		Log.i(TAG, "INTENT RECEIVED 22");

		Vibrator v = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
		v.vibrate(500);

		Toast.makeText(context, "INTENT RECEIVED by Receiver22", Toast.LENGTH_LONG).show();
	}
}
