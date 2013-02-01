package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		setContentView(R.layout.activity_main);
		
		Button b = (Button) findViewById(R.id.button1);
		
		Button c = new Button(this);
		
		//Button c = new
		
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.e("TEST", "CIAO!!! da java");
			}
		});
		
	}
	
	public void greet(View v){
		Log.e("TEST", "CIAO!!!");
	}

}
