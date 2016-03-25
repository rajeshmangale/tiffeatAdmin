package com.tiffeatadmin.mobile;

import java.util.ArrayList;

import com.example.tiffeatadmin.R;
import com.tiffeatadmin.Adapter.VendorNamesAdapter;
import com.tiffeatadmin.util.CommonUtil;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class VendorsScreen extends Activity 
{
	
	ListView lv;
	ArrayList<String> names = new ArrayList<String>();
	ArrayList<String> phone = new ArrayList<String>();
	String[] itemsarray=new String[]{"OPEN","CLOSED"};
	static private int result = 999;
	ArrayAdapter<String> adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_vendors_screen);
		adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,itemsarray);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		names.add("Swami Smaratha");
		names.add("Kadam Tiffins");
		names.add("Memane Tiffins");
		names.add("Samrudhi Tiffins");
		names.add("Akkha Masoor");
		
		phone.add("+919689591854");
		phone.add("8055320802");
		phone.add("1234567890");
		phone.add("1234567890");
		phone.add("1234567890");
		
		lv = (ListView)findViewById(R.id.vendorslistView);
		VendorNamesAdapter Adapter= new VendorNamesAdapter(this,names,phone,adapter);
		lv.setAdapter(Adapter);
		
		
		
		
		lv.setOnItemClickListener(new OnItemClickListener() 
		{

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) 
			{
				
				TextView tv = ((TextView)view.findViewById(R.id.vendorphone_textView));
				TextView tv2 = ((TextView)view.findViewById(R.id.vendorname_textView));
				String name = tv2.getText().toString();
				final String num = tv.getText().toString();
				CommonUtil.showstatusMessage(VendorsScreen.this,name);
				tv.setOnClickListener(new OnClickListener() 
				{
					@Override
					public void onClick(View v) {
						call(num);
					}
				});
			
			}
			
		});
	}
	
	private void call(String num) 
	{
		Log.i("Make call", "");
		String call = "tel:" + num;
		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse(call));

		try {
			startActivityForResult(phoneIntent, result);
			finish();
		} catch (android.content.ActivityNotFoundException ex) {
			Toast.makeText(VendorsScreen.this, "Call faild, please try again later.", Toast.LENGTH_SHORT).show();
		}
		
	}
}
