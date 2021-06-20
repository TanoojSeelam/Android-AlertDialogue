package com.example.alertdialogue;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                View view = getLayoutInflater().inflate(R.layout.delevery_alert,null);
                Button b1 = (Button)view.findViewById(R.id.button4);
                Button b2 = (Button)view.findViewById(R.id.button5);

                alert.setView(view);
                final AlertDialog alertDialog = alert.show();
                alertDialog.setCanceledOnTouchOutside(false);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                View view = getLayoutInflater().inflate(R.layout.brand_alert,null);
                Button b1 = (Button)view.findViewById(R.id.button6);
                Button b2 = (Button)view.findViewById(R.id.button7);

                alert.setView(view);
                final AlertDialog alertDialog = alert.show();
                alertDialog.setCanceledOnTouchOutside(false);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                View view = getLayoutInflater().inflate(R.layout.price_alert,null);
                Button b1 = (Button)view.findViewById(R.id.button8);
                Button b2 = (Button)view.findViewById(R.id.button9);

                alert.setView(view);
                final AlertDialog alertDialog = alert.show();
                alertDialog.setCanceledOnTouchOutside(false);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
            }
        });
    }
}
