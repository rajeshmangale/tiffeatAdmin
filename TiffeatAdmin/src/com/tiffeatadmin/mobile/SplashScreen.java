package com.tiffeatadmin.mobile;
import com.example.tiffeatadmin.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
public class SplashScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
		Thread th = new Thread() {
			public void run() {
				try {
					sleep(3000);

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Intent i = new Intent(SplashScreen.this, Homepage.class);
				startActivity(i);
			}
		};
		th.start();	
	}
}
