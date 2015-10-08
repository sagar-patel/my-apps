package com.dasvit.intentdemo;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button buttoncall,buttonbrowse,buttoncam;
	ImageView imageview1;
	private static final int CAMERA=1313;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        buttoncall = (Button) findViewById(R.id.buttoncall);
        buttonbrowse = (Button) findViewById(R.id.buttonbrowse);
        buttoncam = (Button) findViewById(R.id.buttoncam);
        imageview1 = (ImageView) findViewById(R.id.imageView1);
        
        buttoncall.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Intent.ACTION_CALL);
				intent.setData(Uri.parse("tel:"+"79793454"));
				startActivity(intent);
				
			}
		});
        
        buttonbrowse.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://www.google.com"));
				startActivity(intent);
				
			}
		});
        
        buttoncam.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
				startActivityForResult(intent, CAMERA);
				
			}
		});
        
    }

   @Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	// TODO Auto-generated method stub
	super.onActivityResult(requestCode, resultCode, data);
	
	if(requestCode == CAMERA)
	{
		if(requestCode == RESULT_OK)
		{
			Bitmap bm = (Bitmap) data.getExtras().get("data");
			imageview1.setImageBitmap(bm);
		}
		else{
			Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
		}
	}
				
	
}
}
