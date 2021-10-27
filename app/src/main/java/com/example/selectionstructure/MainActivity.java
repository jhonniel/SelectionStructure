package com.example.selectionstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtName, txtCode, txtSalary;
    Button btnProcess;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName=findViewById(R.id.txtName);
        txtCode=findViewById(R.id.txtCode);
        txtSalary=findViewById(R.id.txtSalary);
        btnProcess=findViewById(R.id.btnProcess);

        btnProcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double  CodeF, CodeB, CodeK, CodeE;
                Double salary = Double.parseDouble(txtSalary.getText().toString());

                String name = txtName.getText().toString();

                CodeF = salary;
                CodeB = salary - 150.65;
                CodeK = salary - 357.85;
                CodeE = salary - 500.50;


                if (txtCode.getText().toString().equals("F")||txtCode.getText().toString().equals("f")) {
                    Toast.makeText(getApplicationContext(),"Hi " +name+"\n" +"your salary is: " + CodeF, Toast.LENGTH_LONG).show();
                } else if (txtCode.getText().toString().equals("B")||txtCode.getText().toString().equals("b")) {
                    Toast.makeText(getApplicationContext(),"Hi " +name+"\n" +"your salary is: " + CodeB, Toast.LENGTH_LONG).show();
                }else if (txtCode.getText().toString().equals("K")||txtCode.getText().toString().equals("k")) {
                    Toast.makeText(getApplicationContext(),"Hi " +name+"\n" +"your salary is: " + CodeK, Toast.LENGTH_LONG).show();
                }else if (txtCode.getText().toString().equals("E")||txtCode.getText().toString().equals("e")) {
                    Toast.makeText(getApplicationContext(),"Hi " +name+"\n" +"your salary is: " + CodeE, Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(),"Error", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}