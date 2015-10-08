package com.example.emegencydial;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView) findViewById(R.id.listView1);
        final String[] names={"Police","Ambulance","Fire","Accident"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,names);
        list.setAdapter(adapter);
        final Bundle b1=new Bundle();
        b1.putString("Police","100");
        b1.putString("Ambulance","108");
        b1.putString("Fire","102");
        b1.putString("Accident","104");
        
       /* list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int positon,
					long arg3) {
				Intent intent=new Intent(Intent.ACTION_DIAL);
				switch (positon) {
				
				case 0:
					
					condition(b1.getString("police"));
					break;

				case 1:
					condition(b1.getString("Ambulance"));
					break;	
				case 2:
					condition(b1.getString("Fire"));
					break;
				case 3:
					condition(b1.getString("Accident"));
					break;
					}
				
				
			}

			public void condition(String a) {
				Intent intent=new Intent(Intent.ACTION_DIAL);
				intent.setData(Uri.parse("tel:"+a));
				startActivity(intent);
			}
		}); */
        list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				call(names[position],b1);
				
				
			}
		});
        
    }
    
	public void call(String a,Bundle b) {
		Intent intent=new Intent(Intent.ACTION_DIAL);
		intent.setData(Uri.parse("tel:"+b.getString(a)));
		startActivity(intent);
	}
}
