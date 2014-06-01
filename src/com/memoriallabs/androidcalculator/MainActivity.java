package com.memoriallabs.androidcalculator;

import com.memoriallabs.androidcalculator.R;

import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements OnClickListener {
	
	// Buttons
	// === Numerical Buttons
	Button btnNumOne;
	Button btnNumTwo;
	Button btnNumThree;
	Button btnNumFour;
	Button btnNumFive;
	Button btnNumSix;
	Button btnNumSeven;
	Button btnNumEight;
	Button btnNumNine;
	Button btnNumZero;
	
	// === Logic Buttons
	Button btnAdd;
	Button btnMinus;
	Button btnMultiply;
	Button btnDivide;
	Button btnClear;
	Button btnDelete;
	Button btnPeriod;
	Button btnNegToggle;
	Button btnEquals;
	
	// === Text Views
	TextView tvResult;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Set Numerical buttons
		
		// Set Logic buttons		
		btnAdd = (Button) findViewById(R.id.btnAdd);
		btnMinus = (Button) findViewById(R.id.btnMinus);
		btnMultiply = (Button) findViewById(R.id.btnMultiply);
		btnDivide = (Button) findViewById(R.id.btnDivide);
		
		tvResult = (TextView) findViewById(R.id.tvResult);
		
		// set button listeners
		btnAdd.setOnClickListener((OnClickListener) this);
		btnMinus.setOnClickListener(this);
		btnMultiply.setOnClickListener(this);
		btnDivide.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		float num1 = 0;
		float num2 = 0;
		float result = 0;
		
		String opr = "";
		
		// Check if input fields are empty
//		if(TextUtils.isEmpty(etNum1.getText().toString()) ||
//				TextUtils.isEmpty(etNum2.getText().toString()))
//			return;
//		num1 = Float.parseFloat(etNum1.getText().toString());
//		num2 = Float.parseFloat(etNum2.getText().toString());
//		
//		switch(v.getId()){
//		case R.id.btnAdd:
//			opr = "+";
//			result = num1 + num2;
//			break;
//		case R.id.btnSub:
//			opr = "-";
//			result = num1 - num2;
//			break;
//		case R.id.btnMult:
//			opr = "*";
//			result = num1 * num2;
//			break;
//		case R.id.btnDiv:
//			opr = "/";
//			result = num1 / num2;
//			break;			
//		}
//		
//		tvResult.setText(num1 + " " + opr + " " + num2 + " = " + result);
	}
}
