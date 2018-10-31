package com.example.prodalcamodulaser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.NumberPicker;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

    }

    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    public void menuEstCanastillas (View view){

        Intent intent = new Intent(this, CalcularEstanteriaCanastillas.class);
        //EditText editText = (EditText) findViewById(R.id.etNum1);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

    public void menuEstCarga (View view){

        Intent intent = new Intent(this, CalcularEstanteriaCarga.class);
        //EditText editText = (EditText) findViewById(R.id.etNum1);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

}