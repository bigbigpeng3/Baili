package com.example.testjni1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	static {
		System.loadLibrary("hello");
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public native String hellc();
	
	public void click(View v ){
		Toast.makeText(this, hellc(), Toast.LENGTH_SHORT).show();
	}
}
