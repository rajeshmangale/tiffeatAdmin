package com.tiffeatadmin.mobile;

import com.example.tiffeatadmin.R;
import com.example.tiffeatadmin.R.layout;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class AddMealContentTab extends TabActivity 
{
	private TabHost tabHost;
	private TabSpec tabLunch, tabDinner;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_meal_content_tab);
		tabHost = (TabHost) findViewById(android.R.id.tabhost);
		tab();
		
		
	}
	
	
	private void tab() {

		Resources ressources = getResources();

		tabLunch = tabHost.newTabSpec("First Tab");
		tabDinner = tabHost.newTabSpec("Second Tab");
		

		tabHost.getTabWidget().setDividerDrawable(null);
		// Set the Tab name and Activity
		// that will be opened when particular Tab will be selected
		Log.d("abc", "xyz");

		tabLunch.setIndicator("Lunch");
		tabLunch.setContent(new Intent(AddMealContentTab.this, MealsScreen.class));

		tabDinner.setIndicator("Dinner");
		tabDinner.setContent(new Intent(AddMealContentTab.this, MealsScreen.class));

		

		/** Add the tabs to the TabHost to display. */
		tabHost.addTab(tabLunch);
		tabHost.addTab(tabDinner);
		
	}
}
