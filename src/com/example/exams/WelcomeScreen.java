package com.example.exams;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WelcomeScreen extends ActionBarActivity implements OnClickListener {
	Button btnregister, btnlogin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome_screen);
		btnregister=(Button) findViewById(R.id.btnregister);
		btnregister.setOnClickListener(this);
		
		btnlogin=(Button) findViewById(R.id.btnlogin);
		btnlogin.setOnClickListener(this);
	
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnregister:
			startActivity(new Intent(getApplicationContext(),RegisterScreen.class));
			
			break;
		case R.id.btnlogin:
			startActivity(new Intent(getApplicationContext(),LoginScreen.class));

		default:
			break;
		}
		
	}
}
