package com.nam.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class Receiver32 extends BroadcastReceiver {

	private final String TAG = "X42";

	@Override
	public void onReceive(Context context, Intent intent) {

		Log.i(TAG, "INTENT RECEIVED by Receiver32");

		String tmp = getResultData() == null ? "" : getResultData();
		setResultData(tmp + "Receiver 32:");
	}
}
