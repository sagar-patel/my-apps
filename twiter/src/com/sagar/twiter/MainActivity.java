package com.sagar.twiter;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	Button login,login2;
	EditText username,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=(Button) findViewById(R.id.login_button);
        login2=(Button) findViewById(R.id.login2_button);
        password=(EditText) findViewById(R.id.password_editText);
        username=(EditText) findViewById(R.id.username_editText);
        login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if(username.getText().toString().equalsIgnoreCase("sagar")&&
						
						password.getText().toString().equals("sagar"))
				{
				Toast.makeText(MainActivity.this,"login Sucessful",Toast.LENGTH_SHORT).show();
				}
				else
				{
					Toast.makeText(MainActivity.this,"invalid username & password",Toast.LENGTH_SHORT).show();
				
			
				}
				
			}
		});
login2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if(username.getText().toString().equalsIgnoreCase("sagar")&&
						
						password.getText().toString().equals("sagar"))
				{
				Toast.makeText(MainActivity.this,"login Sucessful",Toast.LENGTH_SHORT).show();
				}
				else
				{
					Toast.makeText(MainActivity.this,"invalid username & password",Toast.LENGTH_SHORT).show();
				
			
				}
				
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
		// TODO Auto-generated method stub
		
	}
    
}
