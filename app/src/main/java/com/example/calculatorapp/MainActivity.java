package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.editText);

    }
    boolean isnewop=true;
      String op=" ";
      String previous_number="";
//      String new_number="";
      double previous=0.0;
      double newn=0.0;


    public void displaynumber(View view) {
        if(isnewop){
            ed1.setText("");
            isnewop=false;
        }

        char c=' ';
        String number =ed1.getText().toString();
        if(view.getId()==R.id.nine){
            c='9';
        }
        if(view.getId()==R.id.sev){
            c='7';
        }
        if(view.getId()==R.id.six){
            c='6';
        }
        if(view.getId()==R.id.five){
            c='5';
        }
        if(view.getId()==R.id.four){
            c='4';
        }
        if(view.getId()==R.id.eigth){
            c='8';
        }
        if(view.getId()==R.id.three){
            c='3';
        }if(view.getId()==R.id.two){
            c='2';
        }if(view.getId()==R.id.one){
            c='1';
        }if(view.getId()==R.id.zero){
            c='0';
        }
        if(view.getId()==R.id.AC){
            c='a';
        }
        if(view.getId()==R.id.plus){
            c='+';
        }
        if(view.getId()==R.id.minus&&previous_number.length()==0){
            c='-';
        }






        switch (c){

            case '9': number +="9";break;
            case '8': number +="8";break;
            case '7': number +="7";break;
            case '6': number +="6";break;
            case '5': number +="5";break;
            case '4': number +="4";break;
            case '3': number +="3";break;
            case '2': number +="2";break;
            case '1': number +="1";break;
            case '0': number +="0";break;
            case 'a': number ="";break;





        }
        ed1.setText(number);
    }


    public void operatoraction(View view) {
        isnewop=true;
        previous_number=ed1.getText().toString();


        if(view.getId()==R.id.plus){
            op="+";


        }
        if(view.getId()==R.id.minus){
            op="-";



        }
        if(view.getId()==R.id.divide) {
            op = "/";

        }


        if(view.getId()==R.id.multiply){
            op="x";

        }

    }

    public void resultevent(View view) {
     String new_number=ed1.getText().toString();
    double res=0.0;


    switch (op){
        case"+": res=Double.parseDouble(previous_number)+Double.parseDouble(new_number);break;
        case"-": res=Double.parseDouble(previous_number)-Double.parseDouble(new_number);break;
        case "x":res=Double.parseDouble(previous_number)*Double.parseDouble(new_number);break;
        case "/":res=Double.parseDouble(previous_number)/Double.parseDouble(new_number);break;
    }

        ed1.setText(res+" ");
    }
}
