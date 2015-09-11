package com.example.tiffeat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class SelectType extends Activity 
{

	ImageView scheduled,trial,quick;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_type);

		scheduled = (ImageView)findViewById(R.id.scheduled_imageView);
		trial = (ImageView)findViewById(R.id.time_imageView);
		quick = (ImageView)findViewById(R.id.quick_imageView);

		trial.setOnClickListener(new OnClickListener() 
		{

			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub

				Intent i = new Intent(SelectType.this,FirstTimeUse.class);
				startActivity(i);

			}
		});


	}
}
