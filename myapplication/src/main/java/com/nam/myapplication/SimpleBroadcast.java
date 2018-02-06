//package course.examples.broadcastreceiver.singlebroadcaststaticregistration;
package com.nam.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SimpleBroadcast extends AppCompatActivity {

	private static final String CUSTOM_INTENT = "com.nam.myapplication.show_toast";
		
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Button button = (Button) findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
				sendBroadcast(new Intent(CUSTOM_INTENT),
						android.Manifest.permission.VIBRATE);
			}
		});
	}
}