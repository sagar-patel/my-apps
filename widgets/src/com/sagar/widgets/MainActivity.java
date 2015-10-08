package com.sagar.widgets;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity implements android.widget.RadioGroup.OnCheckedChangeListener  {
RadioButton option1;
RadioGroup radiogroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        	option1=(RadioButton) findViewById(R.id.Option1);
        	radiogroup=(RadioGroup) findViewById(R.id.radioGroup1);
        	radiogroup.setOnCheckedChangeListener(MainActivity.this);
        	
        option1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean state) {
				if(state)
				{
					Toast.makeText(MainActivity.this, "you selected the option1",Toast.LENGTH_SHORT).show();
				}
				
				
				
			}
		});
    }
	@Override
	public void onCheckedChanged(RadioGroup arg0, int id) {
		switch (id) {
		case R.id.selection1:
			Toast.makeText(MainActivity.this, "you selected the selection1",Toast.LENGTH_SHORT).show();
			break;
		case R.id.selection2:
			Toast.makeText(MainActivity.this, "you selected the selection2",Toast.LENGTH_SHORT).show();
			break;
		case R.id.selection3:
			Toast.makeText(MainActivity.this, "you selected the selection1",Toast.LENGTH_SHORT).show();
			break;

		default:
			Toast.makeText(MainActivity.this, "you selected nothing",Toast.LENGTH_SHORT).show();
			break;
		}
		
	}
}


   
