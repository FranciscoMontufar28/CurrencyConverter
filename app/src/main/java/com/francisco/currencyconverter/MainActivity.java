package com.francisco.currencyconverter;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.francisco.currencyconverter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    double currentmoney, moneyResult;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setCovertHandler(this);
    }


    public void Convert(){
        currentmoney = Double.parseDouble(binding.CurrentInput.getText().toString());
        moneyResult = currentmoney * 0.000345;
        Toast.makeText(this, ""+moneyResult,Toast.LENGTH_SHORT).show();
        binding.CurrentResult.setText(""+moneyResult);


    }
}
