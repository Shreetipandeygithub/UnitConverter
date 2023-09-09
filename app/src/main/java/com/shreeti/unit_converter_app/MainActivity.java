package com.shreeti.unit_converter_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText edtNumber,edtCurrentUnit,edtTobeConverted;
    TextView txtResult;
    Button btnConvert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConvert=findViewById(R.id.btnConvert);
        txtResult=findViewById(R.id.txtResult);
        edtCurrentUnit=findViewById(R.id.edtCurrentUnit);
        edtNumber=findViewById(R.id.edtNumber);
        edtTobeConverted=findViewById(R.id.edtTobeConverted);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int edtNum=Integer.parseInt(edtNumber.getText().toString());
                String unitPresent=edtCurrentUnit.getText().toString();
                String unitConverted=edtTobeConverted.getText().toString();

                String g,kg,m;
                String km,l,cm,ml;
                double value_g_to_kg=edtNum/1000f;
                double value_kg_to_g=edtNum*1000;
                double value_l_to_ml=edtNum*1000;
                double value_ml_to_l=edtNum/1000f;
                double value_m_to_cm=edtNum*100;
                double value_m_to_km=edtNum/1000f;
                double value_cm_to_m=edtNum/100f;
                double value_km_to_m=edtNum*1000;

                if (unitPresent.equals("g") || unitConverted.equals("kg")) {
                    txtResult.setText(value_g_to_kg+"");
                }else if(unitPresent.equals("kg") || unitConverted.equals( "g")) {
                    txtResult.setText(value_kg_to_g+"");
                }else if(unitPresent.equals("l") || unitConverted.equals("ml")) {
                    txtResult.setText(value_l_to_ml+"");
                }else if(unitPresent.equals("ml") || unitConverted.equals("l")) {
                    txtResult.setText(value_ml_to_l+"");
                }else if(unitPresent.equals("km") || unitConverted.equals("m")) {
                    txtResult.setText(value_km_to_m + "");
                }else if(unitPresent.equals("m") || unitConverted.equals("km")) {
                        txtResult.setText(value_m_to_km + "");
                }else if(unitPresent.equals("m") || unitConverted.equals("cm")) {
                    txtResult.setText(value_m_to_cm+"");
                }else if(unitPresent.equals("cm") || unitConverted.equals("m")) {
                    txtResult.setText(value_cm_to_m + "");
                }else{
                    Toast.makeText(MainActivity.this, "Enter correct Unit in small letters", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}