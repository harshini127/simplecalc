package com.example.simplecalc;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvOutput;
    EditText etInput1, etInput2;
    Button btnAdd, btnMinus, btnMultiply, btnDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                minus();
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiply();
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                divide();
            }
        });

    }

    private void add() {
        int a = parse(etInput1.getText().toString());
        int b = parse(etInput2.getText().toString());
        tvOutput.setText(""+(a + b));
    }

    private void minus() {
        int a = parse(etInput1.getText().toString());
        int b = parse(etInput2.getText().toString());
        tvOutput.setText(""+(a - b));
    }

    private void multiply() {
        int a = parse(etInput1.getText().toString());
        int b = parse(etInput2.getText().toString());
        tvOutput.setText(""+(a * b));
    }

    private void divide() {
        int a = parse(etInput1.getText().toString());
        int b = parse(etInput2.getText().toString());
        tvOutput.setText(""+(a / b));
    }

    private int parse(String value) {
        return Integer.parseInt(value);
    }

    private void init() {
        tvOutput = findViewById(R.id.tvOutput);
        etInput1 = findViewById(R.id.etInput1);
        etInput2 = findViewById(R.id.etInput2);
        btnAdd = findViewById(R.id.btnAdd);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
    }
}