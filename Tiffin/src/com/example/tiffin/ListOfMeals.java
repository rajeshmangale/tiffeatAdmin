package com.example.tiffin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ListOfMeals extends Activity {


	Button order1,order2,order3,order4;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_of_meals);

		order1 = (Button)findViewById(R.id.list_of_meals_button1);
		order2 = (Button)findViewById(R.id.list_of_meals_button2);
		order3 = (Button)findViewById(R.id.list_of_meals_button3);


		order1.setOnClickListener(new OnClickListener() 
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(ListOfMeals.this,Login.class);
				startActivity(i);


			}
		});

		order2.setOnClickListener(new OnClickListener() 
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(ListOfMeals.this,Login.class);
				startActivity(i);


			}
		});

		order3.setOnClickListener(new OnClickListener() 
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(ListOfMeals.this,Login.class);
				startActivity(i);


			}
		});


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.list_of_meals, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
