package com.aryan.optimus.currencyconverter;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){

        EditText rupessField =(EditText) findViewById(R.id.rupeesField);

        Double rupessAmount = Double.parseDouble(rupessField.getText(). toString());
        Double dollarAmount = rupessAmount * 66.6427;
        Toast.makeText(getApplicationContext(),dollarAmount.toString()+ "Dollar", Toast.LENGTH_LONG).show();
    }










    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
