package com.example.admin.smartvote;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CheckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);


        Button submit = findViewById(R.id.button_check);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText codeEditText =findViewById(R.id.editText_code);
                String code = codeEditText.getText().toString();
                if (code.equals("") || code.length() != 13) {
                    Toast t = Toast.makeText(CheckActivity.this,"กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",Toast.LENGTH_LONG);
                    t.show();

                }
                else{
                    AlertDialog.Builder dialog = new AlertDialog.Builder(CheckActivity.this);
                    dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                    if (code.equals("1111111111111") || code.equals("2222222222222")){

                        dialog.setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง");

                        dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });


                        dialog.show();

                    }
                    else {
                        dialog.setMessage("คุณไม่มีสิทธิเลือกตั้ง");

                        dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });


                        dialog.show();

                    }

                }
            }
        });




    }
}
