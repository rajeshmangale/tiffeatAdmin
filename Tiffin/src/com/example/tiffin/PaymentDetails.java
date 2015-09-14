package com.example.tiffin;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class PaymentDetails extends AppCompatActivity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_payment);
		
		Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
		  //Toolbar will now take on default Action Bar characteristics
		  setSupportActionBar(toolbar);
		  //You can now use and reference the ActionBar
		  
		
	}
}
