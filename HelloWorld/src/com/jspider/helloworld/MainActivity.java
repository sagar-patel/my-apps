package com.jspider.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	Button login,cancel;
	EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=(Button) findViewById(R.id.login_button);
        cancel=(Button) findViewById(R.id.cancel_button);
        password=(EditText) findViewById(R.id.password_editText1);
        username=(EditText) findViewById(R.id.username_editText1);
        login.setOnClickListener(this);
        cancel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				username.setText("");
				password.setText("");
				
			}
		});
    }
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View arg0) {
		if(username.getText().toString().equalsIgnoreCase("sagar")&&
				
				password.getText().toString().equals("sagar"))
		{
		Toast.makeText(this,"login Sucessful",Toast.LENGTH_SHORT).show();
		}
		else
		{
			Toast.makeText(this,"invalid username & password",Toast.LENGTH_SHORT).show();
		
	
		}
		
		
	}
	
    
}
