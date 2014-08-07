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

public class LoginScreen extends ActionBarActivity implements OnClickListener {
	TextView tvusername, tvpassword;
	EditText etusername, etpassword;
	Button btnverify, btnback;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_screen);
		tvusername=(TextView) findViewById(R.id.tvusername);
		tvpassword=(TextView) findViewById(R.id.tvpassword);
		etusername=(EditText) findViewById(R.id.etusername);
		etpassword=(EditText) findViewById(R.id.etpassword);
		
		btnverify=(Button) findViewById(R.id.btnverify);
		btnverify.setOnClickListener(this);
		btnback=(Button) findViewById(R.id.btnback);
		btnback.setOnClickListener(this);
		
	
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btndisplay:
			
			String username= "Akirachix";
			String password= "ict2013";
			
			if (etusername.getText().toString().equals("") && etpassword.getText().toString().equals("")) {
				Toast.makeText(getApplicationContext(), "here we are", Toast.LENGTH_SHORT).show();
			}
				else if(etusername.getText().toString().equals("")){
					Toast.makeText(getApplicationContext(), "msg msg", Toast.LENGTH_SHORT).show();
				}
				else if(etpassword.getText().toString().equals("")){
					showToast("please login");
				}
					//validation
					else if( ! etusername.getText().toString().equals("")){
						showToast("you MUST login!");
					}
						
						else if( ! etpassword.getText().toString().equals("")){
							showToast("kindly login");
					}
			}
			
			break;
	     case R.id.btnback:
				startActivity(new Intent(getApplicationContext(),WelcomeScreen.class));

		default:
			break;
		}

	private void showToast(String string) {
		// TODO Auto-generated method stub
		
	}
		
	}
}
