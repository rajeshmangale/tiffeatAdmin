package com.tiffeatadmin.Adapter;

import java.util.ArrayList;

import com.example.tiffeatadmin.R;
import com.tiffeatadmin.mobile.MealsScreen;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MealNamesAdapter extends BaseAdapter 
{

	private ArrayList<String> names;
	Activity context;
	LayoutInflater inflater;
	
	public MealNamesAdapter(MealsScreen mealsScreen, ArrayList<String> nameslist) 
	{
		this.context = mealsScreen ;
		inflater = LayoutInflater.from(context);
		this.names = nameslist;
	}

	@Override
	public int getCount() {
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

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
				ViewHolder holder = null;
				View view = convertView;

				if(view == null)
				{
					holder = new ViewHolder();
					view = inflater.inflate(R.layout.activity_meallist_adapter, null);
					holder.tv1 = (TextView)view.findViewById(R.id.nametextView);
					//holder.tv2 = (TextView)view.findViewById(R.id.phonetextView);

					view.setTag(holder);

				}

				else
					holder = (ViewHolder)view.getTag();

				holder.tv1.setText(names.get(position));
				
		return view;
	}
	

}
