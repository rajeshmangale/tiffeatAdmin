package com.tiffeatadmin.mobile;

import com.example.tiffeatadmin.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Homepage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		Button order,meal,customer,vendor;
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_homepage);
		
		order = (Button)findViewById(R.id.Ordersbutton);
		meal = (Button)findViewById(R.id.Mealsbutton);
		customer = (Button)findViewById(R.id.Customerbutton);
		vendor = (Button)findViewById(R.id.Vendorbutton);
		
		order.setOnClickListener(new OnClickListener() 
		{
			@Override
			public void onClick(View v) {
				Intent i = new Intent(Homepage.this,OrdersScreen.class);
				startActivity(i);
			}
		});
		
		meal.setOnClickListener(new OnClickListener() 
		{
			@Override
			public void onClick(View v) {
				
				Intent i = new Intent(Homepage.this,AddMealContentTab.class);
				startActivity(i);
			}
		});
		
		customer.setOnClickListener(new OnClickListener() 
		{
			@Override
			public void onClick(View v) {
				Intent i = new Intent(Homepage.this,CustomersScreen.class);
				startActivity(i);
			}
		});
		
		vendor.setOnClickListener(new OnClickListener() 
		{
			@Override
			public void onClick(View v) {
				Intent i = new Intent(Homepage.this,VendorsScreen.class);
				startActivity(i);
			}
		});
	}
}
