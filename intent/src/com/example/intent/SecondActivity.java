package com.example.intent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends Activity {
	TextView name,plus,minus,multiply,number;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		name=(TextView) findViewById(R.id.nameShowtextView);
		plus=(TextView) findViewById(R.id.plustextView3);
		minus=(TextView)findViewById(R.id.minustextView3);
		multiply=(TextView)findViewById(R.id.multiplytextView3);
		number=(TextView) findViewById(R.id.numTextView);
		
		Intent intent=getIntent();
		Bundle b1=intent.getExtras();
		name.setText(b1.getString("key1"));
		double d1=Double.parseDouble(b1.getString("key2"));
		number.setText(String.valueOf(d1));
		double d2=d1+5;
		double d3=d1-5;
		double d4=d1*5;
		plus.setText(d1+"+5 = "+String.valueOf(d2));
		minus.setText(d1+"-5 = "+String.valueOf(d3));
		multiply.setText(d1+"*5 ="+String.valueOf(d4));
		
		
		
	}

	

}
