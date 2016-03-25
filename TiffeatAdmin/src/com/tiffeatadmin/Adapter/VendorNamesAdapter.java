package com.tiffeatadmin.Adapter;

import java.util.ArrayList;

import com.example.tiffeatadmin.R;
import com.tiffeatadmin.mobile.VendorsScreen;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class VendorNamesAdapter extends BaseAdapter 
{
	private ArrayList<String> names,phone;
	Activity context;
	LayoutInflater inflater;
	ArrayAdapter<String> status;

	public VendorNamesAdapter(VendorsScreen vendorsScreen, ArrayList<String> names, ArrayList<String> phone, ArrayAdapter<String> adapter) 
	{
		this.context = vendorsScreen ;
		inflater = LayoutInflater.from(context);
		this.names = names;
		this.phone = phone;
		this.status = adapter;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return names.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public class ViewHolder
	{
		TextView tv1,tv2;
		Spinner sp;

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
				ViewHolder holder = null;
				View view = convertView;

				if(view == null)
				{
					holder = new ViewHolder();
					view = inflater.inflate(R.layout.activity_vendor_list_adapter, null);
					holder.tv1 = (TextView)view.findViewById(R.id.vendorname_textView);
					holder.tv2 = (TextView)view.findViewById(R.id.vendorphone_textView);
			//		holder.sp =(Spinner)view.findViewById(R.id.vendor_status_spinner);
					view.setTag(holder);
				}

				else
					holder = (ViewHolder)view.getTag();

				holder.tv1.setText(names.get(position));
				holder.tv2.setText(phone.get(position));
		//		holder.sp.setAdapter(status);
				
		return view;
	}
	

}
