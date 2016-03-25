package com.tiffeatadmin.mobile;

import com.example.tiffeatadmin.R;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class TabActivity extends android.app.TabActivity {
	private TabHost tabHost;
	private TabSpec tabOrder, tabMeals, tabCustomer, tabVendors;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab);
		tabHost = (TabHost) findViewById(android.R.id.tabhost);
		tab();
		tabHost.getTabWidget().getChildAt(0).getLayoutParams().width = 50;
	}

	private void tab() {

		Resources ressources = getResources();

		tabOrder = tabHost.newTabSpec("First Tab");
		tabMeals = tabHost.newTabSpec("Second Tab");
		tabCustomer = tabHost.newTabSpec("Third Tab");
		tabVendors = tabHost.newTabSpec("Forth Tab");

		tabHost.getTabWidget().setDividerDrawable(null);
		// Set the Tab name and Activity
		// that will be opened when particular Tab will be selected
		Log.d("abc", "xyz");

		tabOrder.setIndicator("Orders");
		tabOrder.setContent(new Intent(TabActivity.this, OrdersScreen.class));

		tabMeals.setIndicator("Meals");
		tabMeals.setContent(new Intent(TabActivity.this, MealsScreen.class));

		tabCustomer.setIndicator("Customers");
		tabCustomer.setContent(new Intent(TabActivity.this, CustomersScreen.class));

		tabVendors.setIndicator("Vendors");
		tabVendors.setContent(new Intent(TabActivity.this, VendorsScreen.class));

		/** Add the tabs to the TabHost to display. */
		tabHost.addTab(tabOrder);
		tabHost.addTab(tabMeals);
		tabHost.addTab(tabCustomer);
		tabHost.addTab(tabVendors);
	}

}
