package com.tiffeatadmin.mobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.tiffeatadmin.R;
import com.example.tiffeatadmin.R.layout;
import com.tiffeatadmin.Adapter.CustomerExpandableListAdapter;
import com.tiffeatadmin.Adapter.OrdersExpandableListAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;

public class CustomersScreen extends Activity 
{
	CustomerExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_customers_screen);

		expListView = (ExpandableListView) findViewById(R.id.customersexpandableListView);
		prepareListData();
		listAdapter  = new CustomerExpandableListAdapter(this, listDataHeader, listDataChild);

		expListView.setAdapter(listAdapter);

		expListView.setOnGroupClickListener(new OnGroupClickListener() {

			@Override
			public boolean onGroupClick(ExpandableListView parent, View v,
					int groupPosition, long id) {
				return false;
			}
		});


		expListView.setOnGroupExpandListener(new OnGroupExpandListener() {

			@Override
			public void onGroupExpand(int groupPosition) {
			}
		});

		// Listview Group collasped listener
		expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

			@Override
			public void onGroupCollapse(int groupPosition) {

			}
		});

		// Listview on child click listener
		expListView.setOnChildClickListener(new OnChildClickListener() {

			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				// TODO Auto-generated method stub
				return false;
			}


		});


	}


	private void prepareListData() {
		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<String>>();

		// Adding child data
		listDataHeader.add("Rajesh");
		listDataHeader.add("Kunal");
		listDataHeader.add("Anand");
		


		// Adding child data
		List<String> names = new ArrayList<String>();
		names.add("Phone : 8055320802 ");
		names.add("Email_id : rajeshmangale0802@gmail.com");
		names.add("Quick Order : 5");
		names.add("Scheduled Order : 0");
		names.add("Balance : Rs.50/- ");

		List<String> names1 = new ArrayList<String>();
		names1.add("Phone : 8055320802 ");
		names1.add("Email_id : rajeshmangale0802@gmail.com");
		names1.add("Quick Order : 5");
		names1.add("Scheduled Order : 0");
		names1.add("Balance : Rs.50/-");

		List<String> names2 = new ArrayList<String>();
		names2.add("Phone : 8055320802 ");
		names2.add("Email_id : rajeshmangale0802@gmail.com");
		names2.add("Quick Order : 5");
		names2.add("Scheduled Order : 0");
		names2.add("Balance : Rs.50/-");



		listDataChild.put(listDataHeader.get(0), names);
		listDataChild.put(listDataHeader.get(1), names1);
		listDataChild.put(listDataHeader.get(2), names2);
		// Header, Child data

	}
}
