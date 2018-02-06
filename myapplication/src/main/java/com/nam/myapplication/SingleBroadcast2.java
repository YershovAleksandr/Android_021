//package course.examples.broadcastreceiver.singlebroadcastdynamicregistration;
package com.nam.myapplication;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SingleBroadcast2 extends AppCompatActivity {

	private static final String CUSTOM_INTENT = "com.nam.myapplication.show_dick";
	private final IntentFilter intentFilter = new IntentFilter(CUSTOM_INTENT);
	private final Receiver2 receiver = new Receiver2();

	private LocalBroadcastManager mBroadcastMgr;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		mBroadcastMgr = LocalBroadcastManager.getInstance(getApplicationContext());
		mBroadcastMgr.registerReceiver(receiver, intentFilter);

		setContentView(R.layout.main);

		Button button = (Button) findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mBroadcastMgr.sendBroadcast(new Intent(CUSTOM_INTENT));
			}
		});
	}

	@Override
	protected void onDestroy() {
		mBroadcastMgr.unregisterReceiver(receiver);
		super.onDestroy();
	}
}