package com.example.intent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
EditText name,number;
Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.name_editText);
        number=(EditText)findViewById(R.id.number_editText);
        submit=(Button)findViewById(R.id.submit_button);
        
        submit.setOnClickListener(new OnClickListener()
        
        {
			@Override
			public void onClick(View arg0){
				if(number.getText().toString().length()==0)
				{
					check();
				}
				else{
				Intent intent=new Intent(MainActivity.this,SecondActivity.class);
				intent.putExtra("key1",name.getText().toString());
				intent.putExtra("key2",number.getText().toString());
				startActivity(intent);
				
			}
			}
		});
        
    }
    public void check() {
		Toast.makeText(MainActivity.this,"please enter a  number value",Toast.LENGTH_SHORT).show();
    }


    
}
