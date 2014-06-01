package com.jarama.androidcalculator;

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
		btnNumZero = (Button) findViewById(R.id.btnNumZero);
		btnNumOne = (Button) findViewById(R.id.btnNumOne);
		btnNumTwo = (Button) findViewById(R.id.btnNumTwo);
		btnNumThree = (Button) findViewById(R.id.btnNumThree);
		btnNumFour = (Button) findViewById(R.id.btnNumFour);
		btnNumFive = (Button) findViewById(R.id.btnNumFive);
		btnNumSix = (Button) findViewById(R.id.btnNumSix);
		btnNumSeven = (Button) findViewById(R.id.btnNumSeven);
		btnNumEight = (Button) findViewById(R.id.btnNumEight);
		btnNumNine = (Button) findViewById(R.id.btnNumNine);
		
		// Set Logic buttons		
		btnAdd = (Button) findViewById(R.id.btnAdd);
		btnMinus = (Button) findViewById(R.id.btnMinus);
		btnMultiply = (Button) findViewById(R.id.btnMultiply);
		btnDivide = (Button) findViewById(R.id.btnDivide);
		btnClear = (Button) findViewById(R.id.btnClear);
		btnDelete = (Button) findViewById(R.id.btnDelete);
		btnPeriod = (Button) findViewById(R.id.btnPeriod);
		btnNegToggle = (Button) findViewById(R.id.btnNegToggle);
		btnEquals = (Button) findViewById(R.id.btnEquals);
		
		tvResult = (TextView) findViewById(R.id.tvResult);
		
		// set button listeners		
		// Logic listeners
		btnAdd.setOnClickListener((OnClickListener) this);
		btnMinus.setOnClickListener(this);
		btnMultiply.setOnClickListener(this);
		btnDivide.setOnClickListener(this);
		btnClear.setOnClickListener(this);
		btnDelete.setOnClickListener(this);
		btnPeriod.setOnClickListener(this);
		btnNegToggle.setOnClickListener(this);
		btnEquals.setOnClickListener(this);
		
		// Numeric Listeners
		btnNumZero.setOnClickListener(this);
		btnNumOne.setOnClickListener(this);
		btnNumTwo.setOnClickListener(this);
		btnNumThree.setOnClickListener(this);
		btnNumFour.setOnClickListener(this);
		btnNumFive.setOnClickListener(this);
		btnNumSix.setOnClickListener(this);
		btnNumSeven.setOnClickListener(this);
		btnNumEight.setOnClickListener(this);
		btnNumNine.setOnClickListener(this);
		
		
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
