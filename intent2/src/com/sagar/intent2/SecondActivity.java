package com.sagar.intent2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity {
	EditText name;
	Button submit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		name=(EditText) findViewById(R.id.Name2EditText);
		submit=(Button) findViewById(R.id.submitButton);
		submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				String s1=	name.getText().toString();
				Intent intent=new Intent();  
				intent.putExtra("Key1", s1);  
				
				setResult(RESULT_OK, intent);   // RESULT_CANCELLED
				finish();
				}
			});
		}
	}