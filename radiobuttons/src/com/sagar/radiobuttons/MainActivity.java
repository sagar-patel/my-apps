package com.sagar.radiobuttons;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity implements android.widget.RadioGroup.OnCheckedChangeListener{
RadioButton corejava,android;
RadioGroup gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        corejava=(RadioButton) findViewById(R.id.corejava_radioButton);
        android=(RadioButton) findViewById(R.id.android_radioButton);
        gender=(RadioGroup) findViewById(R.id.gender_radioGroup);
        corejava.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean state) {
				if(state){
					Toast.makeText(MainActivity.this, "core java is clicked",Toast.LENGTH_SHORT).show();
				}
				
				
			}
		});
        android.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean state) {
				if(state){
					Toast.makeText(MainActivity.this, "android is clicked",Toast.LENGTH_SHORT).show();
				}
				
				
			}
		});
        gender.setOnCheckedChangeListener(MainActivity.this);
    }
	@Override
	public void onCheckedChanged(RadioGroup group, int id) {
		switch (id) {
		case R.id.male_radio:
			Toast.makeText(MainActivity.this, "male is clicked",Toast.LENGTH_SHORT).show();
			break;
		case R.id.female_radio:
			Toast.makeText(MainActivity.this, "female is clicked",Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}
		
	}
    


   
    
}
