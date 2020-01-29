package com.example.studentregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spCountry;
    Spinner spCity;
    ArrayAdapter<String> aacity;

    String[] cityName={"Yangon","Mandalay","Taunggyi","Pyin Oo Lwin","Nay Pyi Taw"};
    String[] countryName={"Myanmar","Thailand","China","Japan","Indonesia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spCountry=(Spinner) findViewById(R.id.spinnerCountry);
        spCity=(Spinner) findViewById(R.id.spinnerCity);

        spCountry.clearFocus();
        ArrayAdapter<String> aacountry=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item,countryName);
        aacountry.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spCountry.setAdapter(aacountry);

        spCountry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    aacity = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, cityName);
                    aacity.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
                    spCity.setAdapter(aacity);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}
