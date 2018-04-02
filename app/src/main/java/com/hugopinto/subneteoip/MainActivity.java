package com.hugopinto.subneteoip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView edit1;
    private EditText edit2;
    private EditText edit3;
    private EditText edit4;
    private EditText edit5;

    private Button procesar;

    private TextView ntid;
    private TextView brdcst;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        procesar = findViewById(R.id.btn);

    procesar.setOnClickListener(new View.OnClickListener(){
        @Override

        public void onClick(View v){
            int leng1, leng2, leng3, leng4, leng5, n1, n2, n3, n4, n5, b1, b2, b3, b4, b5;


            edit1 = findViewById(R.id.et1);
            edit2 = findViewById(R.id.et2);
            edit3 = findViewById(R.id.et3);
            edit4 = findViewById(R.id.et4);
            edit5 = findViewById(R.id.et5);
            ntid=findViewById(R.id.netid);
            brdcst=findViewById(R.id.broadcast);

            leng1 = edit1.getText().length();
            leng2 = edit2.getText().length();
            leng3 = edit3.getText().length();
            leng4 = edit4.getText().length();
            leng5 = edit5.getText().length();



            if(leng1==0 || leng2==0 || leng3==0 || leng4==0 || leng5==0){
                Toast.makeText(getApplicationContext(),"Por favor, ingrese todos los datos",Toast.LENGTH_SHORT).show();
            }
            else{
                n1 = Integer.parseInt(edit1.getText().toString());
                n2 = Integer.parseInt(edit2.getText().toString());
                n3 = Integer.parseInt(edit3.getText().toString());
                n4 = Integer.parseInt(edit4.getText().toString());
                n5 = Integer.parseInt(edit5.getText().toString());



                if(n1>255 || n2>255 || n3>255 || n4>255 || n5>32){
                    Toast.makeText(getApplicationContext(),"Por favor, ingrese correctamente los datos",Toast.LENGTH_SHORT).show();

                }
                else{
                    if(n5==8){
                        b1 = n1 & 255;
                        b2 = n2 & 0;
                        b3 = n3 & 0;
                        b4 = n4 & 0;

                        brdcst.setText(b1+"."+"255"+"."+"255"+"."+"255");
                    }
                    if(n5==16){
                        b1 = n1 & 255;
                        b2 = n2 & 255;
                        b3 = n3 & 0;
                        b4 = n4 & 0;


                        brdcst.setText(b1+"."+b2+"."+"255"+"."+"255");
                    }
                    if(n5==24){
                        b1 = n1 & 255;
                        b2 = n2 & 255;
                        b3 = n3 & 255;
                        b4 = n4 & 0;


                        brdcst.setText(b1+"."+b2+"."+b3+"."+"255");
                    }
                    if(n5==32){
                        b1 = n1 & 255;
                        b2 = n2 & 255;
                        b3 = n3 & 255;
                        b4 = n4 & 255;


                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);
                    }

                }
            }
        }








    });

    }
}
