package com.example.groupz;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText phoneNumbTv = null;
	private CountDownTimer countDownTimer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		phoneNumbTv = (EditText) findViewById(R.id.ph_et);

		findViewById(R.id.verifybutton).setOnClickListener(
				new View.OnClickListener() {

					@Override
					public void onClick(View v) {
						if (!TextUtils.isEmpty(phoneNumbTv.getText().toString())) {
							verify();
						}else{
							Toast.makeText(getApplicationContext(), "Please enter your mobile number to verify", 3500).show();
						}

					}
				});
	}

	private void verify() {
		countDownTimer = new CountDownTimer(60000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				Toast.makeText(getApplicationContext(), "Not yet implemented", 3500).show();
			}

			@Override
			public void onFinish() {
			}

		};
		countDownTimer.start();

	}
	private void showAlert(String message,boolean status){
		
	}
}
