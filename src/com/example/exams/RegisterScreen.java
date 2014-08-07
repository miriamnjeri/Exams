package com.example.exams;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterScreen extends ActionBarActivity implements OnClickListener {
	Button btndisplay,btnback;
	TextView tvemail, tvusername, tvpassword;
	EditText etusername, etemail , etpassword;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register_screen);
		btndisplay= (Button) findViewById(R.id.btndisplay);
		btndisplay.setOnClickListener(this);
		btnback= (Button) findViewById(R.id.btnback);
		btnback.setOnClickListener(this);
		
		tvusername=(TextView) findViewById(R.id.tvusername);
		tvpassword=(TextView) findViewById(R.id.tvpassword);
		tvemail=(TextView) findViewById(R.id.tvemail);
		etusername=(EditText) findViewById(R.id.etusername);
		etpassword=(EditText) findViewById(R.id.etpassword);
		etemail=(EditText) findViewById(R.id.etemail);
		
	
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btnback:
			startActivity(new Intent(getApplicationContext(),WelcomeScreen.class));
			
                  
			
			break;
		case R.id.btndisplay:
			String username= "Akirachix";
			String password= "ict2013";
			String email="akirachix@gmail.com";
			
			if (etusername.getText().toString().equals("") "+" etpassword.getText().toString() && etemail.getText().toString().equals("")) {
				Toast.makeText(getApplicationContext(), "details", Toast.LENGTH_SHORT).show();
			}
			

		default:
			break;
		}
	}
}
				

