package com.example.converter2;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Spinner selectionSpin,convertionSpin;
	TextView outputText;
	EditText inputText;
	Button result;
	String display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selectionSpin=(Spinner) findViewById(R.id.selection_spinner);
        convertionSpin=(Spinner)findViewById(R.id.convertion_spinner);
        outputText=(TextView)findViewById(R.id.output_textView);
        inputText=(EditText)findViewById(R.id.input_editText);
        result=(Button)findViewById(R.id.result_button);
        String[] selection={"Temprature","Length","Time"};
        final String[] temprature={"Celcius to Kelvin","Celcius to Farenhite","Farenhite to Celcius","Farenhite to Kelvin","Kelvin to Celcius","Kelvin to Farenhite"};
       final String[] length={"k.m to m","k.m to ft","m to k.m","m to ft","ft to k.m","ft to m"};
       final String[] time={"ms to s","m to ms","m to hr","week to hr","year to hr"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,selection);
        selectionSpin.setAdapter(adapter);
        selectionSpin.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				switch (position) {
				case 0:
			        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,temprature);
			        convertionSpin.setAdapter(adapter1);
			        convertionSpin.setOnItemSelectedListener(new OnItemSelectedListener() {

						@Override
						public void onItemSelected(AdapterView<?> arg0,
								View arg1, int position, long arg3) {
							switch (position) {
							case 0://celcius to kelvin
								result.setOnClickListener(new OnClickListener() {
									
									@Override
									public void onClick(View arg0) {
									if(inputText.getText().toString().length()==0){
										check();
									}
									
									else{
										double d=convert();
										double d1=d+273.15;
										display=String.valueOf(d1);
										display=String.valueOf(d1);
										outputText.setText(display);
									}
										
									}
								});
								
								break;
							case 1://celcius to farenhite
                                   result.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) {
									if(inputText.getText().toString().length()==0){
										check();
									}
									else{
										double d=convert();
										double d1=d*9/5+32;;
										display=String.valueOf(d1);
										display=String.valueOf(d1);
										outputText.setText(display);
									}
										
									}
								});
								break;
							case 2://farenhite to celcius
								result.setOnClickListener(new OnClickListener() {
									
									@Override
									public void onClick(View arg0) {
									if(inputText.getText().toString().length()==0){
										check();
									}
									else{
										double d=convert();
										double d1=(d-32)*5/9;
										display=String.valueOf(d1);
										display=String.valueOf(d1);
										outputText.setText(display);
									}
										
									}

									
								});
								break;
							case 3://Farenhite to kelvin
								result.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) {
									if(inputText.getText().toString().length()==0){
										check();
									}
									else{
										double d=convert();
										double d1=(d+459.67)*5/9;
										display=String.valueOf(d1);
										display=String.valueOf(d1);
										outputText.setText(display);
									}
										
									}
								});
								break;
							case 4://kelvin to celcius
								result.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) {
									if(inputText.getText().toString().length()==0){
										check();
									}
									else{
										double d=convert();
										double d1=d-273.15;
										display=String.valueOf(d1);
										display=String.valueOf(d1);
										outputText.setText(display);
									}
										
									}
								});
								break;
							case 5://kelvin to farenhite
								result.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) {
									if(inputText.getText().toString().length()==0){
										check();
									}
									else{
										double d=convert();
										double d1=d*9/5-459.67;
										display=String.valueOf(d1);
										display=String.valueOf(d1);
										outputText.setText(display);
									}
										
									}
								});
								break;

							
							}
							
						}

						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}
					});
			        
					break;
				case 1:
					 ArrayAdapter<String> adapter2=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,length);
					 convertionSpin.setAdapter(adapter2);
					 convertionSpin.setOnItemSelectedListener(new OnItemSelectedListener() {

						@Override
						public void onItemSelected(AdapterView<?> arg0,
								View arg1, int position, long arg3) {
							switch (position) {
							case 0://k.m to meter
								result.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) {
									if(inputText.getText().toString().length()==0){
										check();
									}
									else{
										double d=convert();
										double d1=d*1000;
										display=String.valueOf(d1);
										display=String.valueOf(d1);
										outputText.setText(display+"m");
									}
										
									}
								});
								
								break;

							case 1://k.m to feet
								result.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) {
									if(inputText.getText().toString().length()==0){
										check();
									}
									else{
										double d=convert();
										double d1=d*3280.8;
										display=String.valueOf(d1);
										display=String.valueOf(d1);
										outputText.setText(display+"ft");
									}
										
									}
								});
								break;
							case 2://metre to k.m
								result.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) {
									if(inputText.getText().toString().length()==0){
										check();
									}
									else{
										double d=convert();
										double d1=d/1000;
										display=String.valueOf(d1);
										display=String.valueOf(d1);
										outputText.setText(display+"k.m");
									}
										
									}
								});
								break;
							case 3://metre to feet
								result.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) {
									if(inputText.getText().toString().length()==0){
										check();
									}
									else{
										double d=convert();
										double d1=d*3.2808;
										display=String.valueOf(d1);
										display=String.valueOf(d1);
										outputText.setText(display+"ft");
									}
										
									}
								});
								break;
							case 4://feet to k.m
								result.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) {
									if(inputText.getText().toString().length()==0){
										check();
									}
									else{
										double d=convert();
										double d1=d/3280.8;
										display=String.valueOf(d1);
										display=String.valueOf(d1);
										outputText.setText(display+"k.m");
									}
										
									}
								});
								break;
							case 5:// feet to metre
								result.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) {
									if(inputText.getText().toString().length()==0){
										check();
									}
									else{
										double d=convert();
										double d1=d/3.2808;
										display=String.valueOf(d1);
										display=String.valueOf(d1);
										outputText.setText(display+"m");
									}
										
									}
								});
								break;
							}
							
						}

						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}
					});
					break;
				case 2:
					 ArrayAdapter<String> adapter3=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,time);
					 convertionSpin.setAdapter(adapter3);
					 convertionSpin.setOnItemSelectedListener(new OnItemSelectedListener() {

						@Override
						public void onItemSelected(AdapterView<?> arg0,
								View arg1, int position, long arg3) {
							switch (position) {
							case 0://"ms to s
								result.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) {
									if(inputText.getText().toString().length()==0){
										check();
									}
									else{
										double d=convert();
										double d1=d*0.001;
										display=String.valueOf(d1);
										display=String.valueOf(d1);
										outputText.setText(display+"s");
									}
										
									}
								});
								break;

							case 1://m to ms
								result.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) {
									if(inputText.getText().toString().length()==0){
										check();
									}
									else{
										double d=convert();
										double d1=d*60000;
										display=String.valueOf(d1);
										display=String.valueOf(d1);
										outputText.setText(display+"ms");
									}
										
									}
								});
								break;
								
							case 2://m to hr
								result.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) {
									if(inputText.getText().toString().length()==0){
										check();
									}
									else{
										double d=convert();
										double d1=d*0.0166667;
										display=String.valueOf(d1);
										display=String.valueOf(d1);
										outputText.setText(display+"hr");
									}
										
									}
								});
							break;
							case 3://week to hr
								result.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) {
									if(inputText.getText().toString().length()==0){
										check();
									}
									else{
										double d=convert();
										double d1=d*168;
										display=String.valueOf(d1);
										display=String.valueOf(d1);
										outputText.setText(display+"hr");
									}
										
									}
								});
							break;
							case 4://year to hr
								result.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) {
									if(inputText.getText().toString().length()==0){
										check();
									}
									else{
										double d=convert();
										double d1=d*8765.81;
										display=String.valueOf(d1);
										display=String.valueOf(d1);
										outputText.setText(display+"hr");
									}
										
									}
								});
							break;
							
							}
							
						}

						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}
					});
					break;
				
				}
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public double convert(){
    	double d=0;
    	String entervalue=inputText.getText().toString();
    	d=Double.parseDouble(entervalue);
    	return d;
    }
    public void check() {
		Toast.makeText(MainActivity.this,"please enter a value",Toast.LENGTH_SHORT).show();
		outputText.setText("");
	}
    
}
