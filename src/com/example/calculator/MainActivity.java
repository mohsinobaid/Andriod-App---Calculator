package com.example.calculator;

import java.util.ArrayList;

import android.R.string;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.widget.Toast;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

public class MainActivity extends Activity {

	MediaPlayer logoMusic;
	Button aButton;
	Button bButton;
	EditText Et;
	EditText text;

	int input1;
	int input2;
	public int set1 = 0;
	public int set2=0;
	int pressed;
	int equals;
	String x = "";

	private ArrayList<Integer> flow;
	// i think i should use an array of string variables.
	private ArrayList<String> flow2;

	//EditText test = (EditText) findViewById(R.id.editText2);
	//TextView test2 = (TextView) findViewById(R.id.editText2);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		flow = new ArrayList<Integer>();
		logoMusic = MediaPlayer.create(MainActivity.this, R.raw.button_click);
		logoMusic.start();

		//BUTTONS-------------------------------------------------------------------------------------
		// Button1 = clear
		aButton = (Button) this.findViewById(R.id.button1);
		aButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//Et.setText("");
				//x = "";
				flow.clear();
				text.setText("");
			}
		});
		Toast t = Toast.makeText(this, "Let me calculate your IQ. its 0",
				Toast.LENGTH_LONG);
		t.show();
		// Button2
		bButton = (Button) this.findViewById(R.id.button2);
		bButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
			}
		});
		// Button3
		bButton = (Button) this.findViewById(R.id.button3);
		bButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
			}
		});
		// Button4
		bButton = (Button) this.findViewById(R.id.button4);
		bButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
			}
		});
		// Button5 - should print out number 7 onto the edit text.
		bButton = (Button) this.findViewById(R.id.button5);
		Et = (EditText) findViewById(R.id.editText2);
		bButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Et.setText("7");
				input1 = 7;
				flow.add(input1);
				//test.setText("Google is your friend",TextView.BufferType.EDITABLE);
				// for(int i = 0; i < flow.size() ; i++)
				// x=x+( flow.get( i ) );
				// text.setText(x);
				//test.setText("7");
				text.append("7");
			}
		});
		// Button6
		bButton = (Button) this.findViewById(R.id.button6);
		bButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Et.setText("8");
				input1 = 8;
				flow.add(input1);
				for (int i = 1; i < flow.size(); i++)
					x = x + (flow.get(i));
				//text.setText(x);
				text.append("8");
			}
		});
		// Button7
		bButton = (Button) this.findViewById(R.id.button7);
		text = (EditText) findViewById(R.id.editText2);
		bButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//text.setText("9");
				input1 = 9;
				flow.add(input1);
				text.append("9");
			}
		});
		// Button8
		bButton = (Button) this.findViewById(R.id.button8);
		bButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (text.getText().toString().length() > 0){
				    //set1 = Integer.parseInt(text.getText().toString());
				//set1 = Integer.parseInt(text.getText().toString());
				//set1 = Integer.getInteger(text.getText().toString());
				//set1=Integer.parseInt(text.getText().toString());
				
				set1 = Integer.valueOf(text.getText().toString());
				}
				
				
				System.out.print(set1);
				text.setText("");
				pressed = 1;
			}
		});
		// Button9
		bButton = (Button) this.findViewById(R.id.button9);
		text = (EditText) findViewById(R.id.editText2);
		// print the array within this text
		bButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//text.setText("4");
				text.append("4");
				input1 = 4;
				flow.add(input1);
			}
		});
		// Button10
		bButton = (Button) this.findViewById(R.id.button10);
		text = (EditText) findViewById(R.id.editText2);
		bButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//text.setText("5");
				input1 = 5;
				flow.add(input1);
				text.append("5");
			}
		});
		// Button11
		bButton = (Button) this.findViewById(R.id.button11);
		text = (EditText) findViewById(R.id.editText2);
		bButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//text.setText("6");
				input1 = 6;
				flow.add(input1);
				text.append("6");
			}
		});
		// Button12
		// Button13
		bButton = (Button) this.findViewById(R.id.button13);
		text = (EditText) findViewById(R.id.editText2);
		bButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//text.setText("1");
				input1 = 1;
				flow.add(input1);
				text.append("1");
			}
		});
		// Button14
		bButton = (Button) this.findViewById(R.id.button14);
		text = (EditText) findViewById(R.id.editText2);
		bButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//text.setText("2");
				input1 = 2;
				flow.add(input1);
				text.append("2");
			}
		});
		// Button15
		bButton = (Button) this.findViewById(R.id.button15);
		text = (EditText) findViewById(R.id.editText2);
		bButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//text.setText("3");
				input1 = 3;
				flow.add(input1);
				text.append("3");
			}
		});
		// Button16
		// Button17
		// Button18
		// Button19
		bButton = (Button) this.findViewById(R.id.button19);
		text = (EditText) findViewById(R.id.editText2);
		bButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
			
				//print out the int value of set1
					text.setText(Integer.toString(set1));
				
			}
		});
		
		// Button20
		bButton = (Button) this.findViewById(R.id.button20);
		text = (EditText) findViewById(R.id.editText2);
		bButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Print out the array here.
				//text.setText("");
				//int n = flow.size();
				//for (int i = 0; i < n; i++)
					//x = x + (flow.get(i));
				//text.setText(x);
				//text.getEditableText()
				if(pressed==0){
				text.getText();
				}else{
					//set2 = Integer.getInteger(text.getText().toString());
					if (text.getText().toString().length() > 0)
					    set2 = Integer.parseInt(text.getText().toString());
					
					//set2=Integer.parseInt(text.getText().toString());
					equals = set1- set2;
					text.setText(Integer.toString(equals));
					
				}
				pressed =0;
			}
		});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void calc() {
	}

}
