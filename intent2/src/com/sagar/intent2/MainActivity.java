package com.sagar.intent2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView name;
	Button first;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name= (TextView) findViewById(R.id.NameTextView);
        first=(Button)findViewById(R.id.firstButton);
        first.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(MainActivity.this,SecondActivity.class);
				startActivityForResult(intent, 1);
			}
		});
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
		if(resultCode==RESULT_OK)
		{
		Bundle b1=data.getExtras();
		String s1=b1.getString("Key1");
		name.setText(s1);
		}
		else if (resultCode== RESULT_CANCELED){
			name.setText("Error");
		}
	}
}

