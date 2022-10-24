package com.example.madt20221005;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import utils.TextCounter;

public class MainActivity extends AppCompatActivity {

    private Spinner spSelectOptions;
    private EditText edPhrase;
    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edPhrase = findViewById(R.id.edPhrase);
        this.tvMain = findViewById(R.id.tvMain);

        this.spSelectOptions = (Spinner) findViewById(R.id.spSelectOptions);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.selection_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spSelectOptions.setAdapter(adapter);
    }

    public void onBtnCountClick(View view) {
        if(this.spSelectOptions.getSelectedItem().toString().equals(getResources().getString(R.string.chars_selection))){
            if(TextUtils.isEmpty(this.edPhrase.getText().toString())){
                Toast.makeText(getApplicationContext(),"String is empty",Toast.LENGTH_LONG).show();
            }else{
                this.tvMain.setText(TextCounter.getCharsCount(this.edPhrase.getText().toString()));
            }
        } else if(this.spSelectOptions.getSelectedItem().toString().equals(getResources().getString(R.string.words_selection))){
            if(TextUtils.isEmpty(this.edPhrase.getText().toString())){
                Toast.makeText(getApplicationContext(),"String is empty",Toast.LENGTH_LONG).show();
            }else{
                String[] words = this.edPhrase.getText().toString().split("\\s+");
                int length = words.length;
                String convert = String.valueOf(length);
                this.tvMain.setText(convert);
            }
        }
    }
}