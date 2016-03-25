package com.tiffeatadmin.mobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.tiffeatadmin.R;
import com.tiffeatadmin.Adapter.OrdersExpandableListAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class OrdersScreen extends Activity 
{
	OrdersExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_orders_screen);
		
		expListView = (ExpandableListView) findViewById(R.id.orders_expandableListView);
		prepareListData();
		listAdapter = new OrdersExpandableListAdapter(this, listDataHeader, listDataChild);
		
		expListView.setAdapter(listAdapter);

		// Listview Group click listener
		expListView.setOnGroupClickListener(new OnGroupClickListener() {

			@Override
			public boolean onGroupClick(ExpandableListView parent, View v,
					int groupPosition, long id) {
				// Toast.makeText(getApplicationContext(),
				// "Group Clicked " + listDataHeader.get(groupPosition),
				// Toast.LENGTH_SHORT).show();
				return false;
			}
		});
		
		
		expListView.setOnGroupExpandListener(new OnGroupExpandListener() {

			@Override
			public void onGroupExpand(int groupPosition) {
//				Toast.makeText(getApplicationContext(),
//						listDataHeader.get(groupPosition) + " Expanded",
//						Toast.LENGTH_SHORT).show();
			}
		});

		// Listview Group collasped listener
		expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

			@Override
			public void onGroupCollapse(int groupPosition) {
//				Toast.makeText(getApplicationContext(),
//						listDataHeader.get(groupPosition) + " Collapsed",
//						Toast.LENGTH_SHORT).show();

			}
		});

		// Listview on child click listener
		expListView.setOnChildClickListener(new OnChildClickListener() {

			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				// TODO Auto-generated method stub
//				Toast.makeText(
//						getApplicationContext(),
//						listDataHeader.get(groupPosition)
//								+ " : "
//								+ listDataChild.get(
//										listDataHeader.get(groupPosition)).get(
//										childPosition), Toast.LENGTH_SHORT)
//						.show();
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
		listDataHeader.add("Ajinkya");
		

		// Adding child data
		List<String> names = new ArrayList<String>();
		names.add("Phone : 8055320802 ");
		names.add("Address : Vimannagar");
		names.add("Payment Type : Cash");
		names.add("Vendor : Swami Smarath");
		names.add("Meal Title : Veg-Thali ");
		names.add("Order Type : Lunch");
		
		List<String> names1 = new ArrayList<String>();
		names1.add("Phone : 8055320802 ");
		names1.add("Address : Vimannagar");
		names1.add("Payment Type : Cash");
		names1.add("Vendor : Swami Smarath");
		names1.add("Meal Title : Veg-Thali ");
		names1.add("Order Type : Lunch");
		
		List<String> names2 = new ArrayList<String>();
		names2.add("Phone : 8055320802 ");
		names2.add("Address : Vimannagar");
		names2.add("Payment Type : Cash");
		names2.add("Vendor : Swami Smarath");
		names2.add("Meal Title : Veg-Thali ");
		names2.add("Order Type : Lunch");
		
		List<String> names3 = new ArrayList<String>();
		names3.add("Phone : 8055320802 ");
		names3.add("Address : Vimannagar");
		names3.add("Payment Type : Cash");
		names3.add("Vendor : Swami Smarath");
		names3.add("Meal Title : Veg-Thali ");
		names3.add("Order Type : Lunch");
		
		listDataChild.put(listDataHeader.get(0), names);
		listDataChild.put(listDataHeader.get(1), names1);
		listDataChild.put(listDataHeader.get(2), names2);
		listDataChild.put(listDataHeader.get(3), names3); // Header, Child data
		
	}
	
}
