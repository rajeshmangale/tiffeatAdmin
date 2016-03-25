package com.tiffeatadmin.util;


import com.example.tiffeatadmin.R;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CommonUtil 
{
	public static void showstatusMessage(final Context context, String name)
	{
		  
		 final Dialog dialog = new Dialog(context);
         // Include dialog.xml file
         dialog.setContentView(R.layout.activity_select_meal_status);
         // Set dialog title
         dialog.setTitle("Custom Dialog");

         // set values for custom dialog components - text, image and button
         TextView text = (TextView) dialog.findViewById(R.id.VendorNametextView );
         text.setText(name);
         dialog.show();
          
         Button declineButton = (Button) dialog.findViewById(R.id.OKbutton);
         // if decline button is clicked, close the custom dialog
         declineButton.setOnClickListener(new OnClickListener() {
             @Override
             public void onClick(View v) {
                 dialog.dismiss();
             }
         });

	}

}
