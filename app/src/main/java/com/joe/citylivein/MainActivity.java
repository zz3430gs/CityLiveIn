package com.joe.citylivein;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nameTextBox = (EditText) findViewById(R.id.name_text_box);
        final EditText cityTextBox = (EditText) findViewById(R.id.city_text_box);
        Button cityTextButton = (Button) findViewById(R.id.city_text_button);
        cityTextButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                String nameSearchString = nameTextBox.getText().toString();
                String citySearchString = cityTextBox.getText().toString();

                Toast.makeText(MainActivity.this, nameSearchString+" lives in " + citySearchString, Toast.LENGTH_LONG).show();

            }
        });
    }
}
