package com.nam.myapplication;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CompoundOrderedBroadcast extends AppCompatActivity {

	static final String CUSTOM_INTENT = "com.nam.application.motherfucka";

	private final Receiver21 mReceiver = new Receiver21();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);

		IntentFilter intentFilter = new IntentFilter(CUSTOM_INTENT);
		intentFilter.setPriority(3);
		registerReceiver(mReceiver, intentFilter);

		Button button = (Button) findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				sendOrderedBroadcast(new Intent(CUSTOM_INTENT),	android.Manifest.permission.VIBRATE);
			}
		});
	}

	@Override
	protected void onDestroy() {
		unregisterReceiver(mReceiver);
		super.onDestroy();
	}
}