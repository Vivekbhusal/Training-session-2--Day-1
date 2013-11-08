package com.training.day1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	
		Button simpleclick = (Button) findViewById(R.id.button1);
		
		simpleclick.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			 Toast toast = Toast.makeText(getApplicationContext(), "I click here", Toast.LENGTH_LONG);
			 toast.show();
			}
		});
	}

}
