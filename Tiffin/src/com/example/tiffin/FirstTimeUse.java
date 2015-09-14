package com.example.tiffin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class FirstTimeUse extends AppCompatActivity 
{

	CardView name1,name2,name3,name4;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first_time_use);

		name1 = (CardView)findViewById(R.id.first_time_placeCard);
		name2 = (CardView)findViewById(R.id.first_time_placeCard2);
		name3 = (CardView)findViewById(R.id.first_time_placeCard3);


		name1.setOnClickListener(new OnClickListener() 
		{

			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub

				Intent i = new Intent(FirstTimeUse.this,ListOfMeals.class);
				startActivity(i);

			}
		});

		name2.setOnClickListener(new OnClickListener() 
		{

			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub

				Intent i = new Intent(FirstTimeUse.this,ListOfMeals.class);
				startActivity(i);

			}
		});

		name3.setOnClickListener(new OnClickListener() 
		{

			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub

				Intent i = new Intent(FirstTimeUse.this,ListOfMeals.class);
				startActivity(i);

			}
		});



	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.first_time_use, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) 
	{
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
