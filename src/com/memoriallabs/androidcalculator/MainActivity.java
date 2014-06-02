package com.memoriallabs.androidcalculator;

import java.util.Arrays;
import java.util.Stack;

import com.memoriallabs.androidcalculator.R;

import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
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
	Button btnSqrt;
	Button btnEquals;

	// === Text Views
	TextView tvResult;

	// === Others
	String resultStr = "";

	/**
	 * Executed in the beginning when the application is first ran
	 * 
	 * @param savedInstanceState
	 */
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
		btnSqrt = (Button) findViewById(R.id.btnSqrt);
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
		btnSqrt.setOnClickListener(this);
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

	/**
	 * This is where all the heavy lifting occurs.
	 * 
	 * @param v
	 */
	@Override
	public void onClick(View v) {

		String[] characters = new String[0];
		int lastIndex = characters.length;

		switch (v.getId()) {
		case R.id.btnNumZero:
			resultStr += 0;
			break;
		case R.id.btnNumOne:
			resultStr += 1;
			break;
		case R.id.btnNumTwo:
			resultStr += 2;
			break;
		case R.id.btnNumThree:
			resultStr += 3;
			break;
		case R.id.btnNumFour:
			resultStr += 4;
			break;
		case R.id.btnNumFive:
			resultStr += 5;
			break;
		case R.id.btnNumSix:
			resultStr += 6;
			break;
		case R.id.btnNumSeven:
			resultStr += 7;
			break;
		case R.id.btnNumEight:
			resultStr += 8;
			break;
		case R.id.btnNumNine:
			resultStr += 9;
			break;
		case R.id.btnAdd:
			characters = resultStr.split(" ");
			lastIndex = characters.length - 1;

			if (isNumeric(characters[lastIndex]) && lastIndex >= 0) {
				resultStr += " + ";
			} else {
				characters[lastIndex] = "+";
				resultStr = TextUtils.join(" ", characters);
				resultStr += " ";
			}

			break;
		case R.id.btnMinus:
			characters = resultStr.split(" ");
			lastIndex = characters.length - 1;

			if (isNumeric(characters[lastIndex]) && lastIndex >= 0) {
				resultStr += " - ";
			} else {
				characters[lastIndex] = "-";
				resultStr = TextUtils.join(" ", characters);
				resultStr += " ";
			}
			break;
		case R.id.btnMultiply:
			characters = resultStr.split(" ");
			lastIndex = characters.length - 1;

			if (isNumeric(characters[lastIndex]) && lastIndex >= 0) {
				resultStr += " * ";
			} else {
				characters[lastIndex] = "*";
				resultStr = TextUtils.join(" ", characters);
				resultStr += " ";
			}
			break;
		case R.id.btnDivide:
			characters = resultStr.split(" ");
			lastIndex = characters.length - 1;

			if (isNumeric(characters[lastIndex]) && lastIndex >= 0) {
				resultStr += " / ";
			} else {
				characters[lastIndex] = "/";
				resultStr = TextUtils.join(" ", characters);
				resultStr += " ";
			}
			break;
		case R.id.btnSqrt:
			characters = resultStr.split(" ");
			lastIndex = characters.length - 1;

			if (isNumeric(characters[lastIndex]) && lastIndex >= 0) {
				resultStr += " sqrt ";
			} else {
				characters[lastIndex] = "sqrt";
				resultStr = TextUtils.join(" ", characters);
				resultStr += " ";
			}
			break;
		case R.id.btnClear:
			resultStr = "";
			break;
		case R.id.btnDelete:
			characters = resultStr.split(" ");
			lastIndex = characters.length - 1;

			if (characters[lastIndex] != "sqrt") {
				String[] lastChars = characters[lastIndex].split("");
				lastChars[lastChars.length - 1] = "";
				characters[lastIndex] = TextUtils.join("", lastChars);
			} else
				characters[lastIndex] = "";

			resultStr = TextUtils.join(" ", characters);
			characters = resultStr.split(" ");
			resultStr = TextUtils.join(" ", characters);
			break;
		case R.id.btnEquals:
			characters = resultStr.split(" ");
			lastIndex = characters.length - 1;

			if (lastIndex > 0 && !isNumeric(characters[lastIndex])
					|| lastIndex == 0)
				return;

			double evaluation = evaluate(resultStr);
			resultStr = Double.toString(evaluation);

			break;
		}

		tvResult.setText(resultStr);
	}

	/**
	 * match a number with optional '-' and decimal.
	 * 
	 * @param str
	 * @return
	 */
	private static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}

	/**
	 * Evaluates a math expression
	 * 
	 * @param str
	 * @return
	 */
	private static double evaluate(final String str) {

		Double result = 0.0;

		// Will contain all characters in the math expression
		Stack<String> calcObjs = new Stack<String>();
		calcObjs.addAll(Arrays.asList(str.split(" ")));

		// String Operators
		Stack<String> ops = new Stack<String>();

		// Computed values of our calculator
		Stack<Double> vals = new Stack<Double>();

		// compute the expression
		while (calcObjs.size() > 0) {
			String s = calcObjs.pop();

			if (s.equals("+"))
				ops.push(s);
			else if (s.equals("-"))
				ops.push(s);
			else if (s.equals("*"))
				ops.push(s);
			else if (s.equals("/"))
				ops.push(s);
			else if (s.equals("sqrt"))
				ops.push(s);
			else {
				vals.push(Double.parseDouble(s));
				String op = ops.size() > 0 ? ops.pop() : "";
				double v = vals.pop();
				if (op.equals("+"))
					v = vals.pop() + v;
				else if (op.equals("-"))
					v = vals.pop() - v;
				else if (op.equals("*"))
					v = vals.pop() * v;
				else if (op.equals("/"))
					v = vals.pop() / v;
				else if (op.equals("sqrt"))
					v = Math.sqrt(v);

				vals.push(v);
			}
		}

		result = vals.pop();

		return result;
	}
}
