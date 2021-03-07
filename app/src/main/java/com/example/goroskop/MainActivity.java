package com.example.goroskop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
  public void onButtonClick (View v){
      EditText data = (EditText)findViewById(R.id.date);
      TextView resTex1 = (TextView)findViewById(R.id.textView4);
      TextView resTex2 = (TextView)findViewById(R.id.textView5);
      TextView resTex3 = (TextView)findViewById(R.id.textView6);
      String da = data.getText().toString(); // переводим к стрингу что ввели
      String[] parts = da.split("\\."); // устанавливаем разделитель"." и делим.
      String day = parts[0]; //
      String mes = parts[1]; //
      String god = parts[2]; //
//      int mes = Integer.parseInt(parts[1]); // месяц
//      int god = Integer.parseInt(parts[2]); // год

      resTex1.setText(day);
      resTex2.setText(mes);
      resTex3.setText(god);


  }
}