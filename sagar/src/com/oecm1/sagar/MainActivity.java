package com.oecm1.sagar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button login;
	EditText userName,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=(Button)findViewById(R.id.login_button1);
        userName=(EditText)findViewById(R.id.username_editText1);
        password=(EditText)findViewById(R.id.username_editText1);
        login.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(userName.getText().toString().equals("admin") &&
				         
			            password.getText().toString().equals("admin")) {
			               Toast.makeText(getApplicationContext(), "Redirecting...",Toast.LENGTH_SHORT).show();
			            }
			            else{
			               Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();
				
			}}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
