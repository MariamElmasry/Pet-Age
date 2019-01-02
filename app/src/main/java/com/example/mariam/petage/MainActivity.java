package com.example.mariam.petage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    public void ButtonIsClicked (View view){
        EditText editYear = findViewById(R.id.askYear);
        int petAge = Calendar.getInstance().get(Calendar.YEAR)-Integer.parseInt(editYear.getText().toString());
        TextView age = findViewById(R.id.petAge);
        age.setText(petAge + "");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
