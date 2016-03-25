package com.tiffeatadmin.mobile;

import java.util.ArrayList;

import com.example.tiffeatadmin.R;
import com.tiffeatadmin.Adapter.MealNamesAdapter;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MealsScreen extends Activity 
{
	ArrayList<String> names = new ArrayList<String>();
	
	ListView lv;
	MealNamesAdapter mealsadapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_meals_screen);
		
		names.add("Swami Smaratha");
		names.add("Kadam Tiffins");
		names.add("Memane Tiffins");
		names.add("Samrudhi Tiffins");
		names.add("Akkha Masoor");

		lv = (ListView)findViewById(R.id.mealslistView);
		MealNamesAdapter Adapter= new MealNamesAdapter(this,names);
		lv.setAdapter(Adapter);
		
		lv.setOnItemClickListener(new OnItemClickListener()
		{
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) 
			{
				// TODO Auto-generated method stub
				Intent i =new Intent(MealsScreen.this,AddLunchScreen.class);
				startActivity(i);
			}
		});
	}
}
