package com.example.niyamatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bac,bc,bbl,bbr,bSin,bco,bta,blog,bIn,bxi,bSar,bRoot,bInv,bDiv,bMulti,bMin,bPlus,bpi,bDot,bEel,bPercent;

    TextView tvSec,tvMain,copyright;

    String pi = "3.141529265";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bac = findViewById(R.id.bac);
        bc = findViewById(R.id.bc);
        bbl = findViewById(R.id.bbl);
        bbr = findViewById(R.id.bbr);
        bSin = findViewById(R.id.bSin);
        bco = findViewById(R.id.bco);
        bta = findViewById(R.id.bta);
        blog = findViewById(R.id.blog);
        bIn = findViewById(R.id.bIn);
        bxi = findViewById(R.id.bxi);
        bSar = findViewById(R.id.bSar);
        bRoot = findViewById(R.id.bRoot);
        bInv = findViewById(R.id.bInv);
        bDiv = findViewById(R.id.bDiv);
        bMulti = findViewById(R.id.bMulti);
        bMin = findViewById(R.id.bMin);
        bPlus = findViewById(R.id.bPlus);
        bpi = findViewById(R.id.bpi);
        bDot = findViewById(R.id.bDot);
        bEel = findViewById(R.id.bEel);
        bPercent = findViewById(R.id.bPercent);



        tvMain = findViewById(R.id.tvMain);
        tvSec = findViewById(R.id.tvSec);
        copyright = findViewById(R.id.copyright);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMain.setText(tvMain.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMain.setText(tvMain.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMain.setText(tvMain.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMain.setText(tvMain.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMain.setText(tvMain.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMain.setText(tvMain.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMain.setText(tvMain.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMain.setText(tvMain.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMain.setText(tvMain.getText()+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMain.setText(tvMain.getText()+"0");
            }
        });

        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMain.setText(tvMain.getText()+"");

            }
        });

        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMain.setText("");
                tvSec.setText("");
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = tvMain.getText().toString();
                val = val.substring(0,val.length() -1);
                tvMain.setText(val);
            }
        });

        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = tvMain.getText().toString();
                if (!input.isEmpty()) {
                    tvMain.setText(input + "+");
                }
            }
        });


        bMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = tvMain.getText().toString();
                if (!input.isEmpty()) {
                    tvMain.setText(input + "-");
                }
            }
        });


        bMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = tvMain.getText().toString();
                if (!input.isEmpty()) {
                    tvMain.setText(input + "×");
                }
            }
        });


        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = tvMain.getText().toString();
                if (!input.isEmpty()) {
                    tvMain.setText(input + "÷");
                }
            }
        });


        bSar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = tvMain.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                tvMain.setText(String.valueOf(r));
            }
        });

        bbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMain.setText(tvMain.getText()+"(");
            }
        });

        bbr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMain.setText(tvMain.getText()+")");
            }
        });

        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSec.setText(bpi.getText());
                tvMain.setText(tvMain.getText()+pi);
            }
        });

        bSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = tvMain.getText().toString();
                if (!input.isEmpty()) {
                    try {
                        double number = Double.parseDouble(input);
                        double sinValue = Math.sin(Math.toRadians(number));
                        tvMain.setText(String.valueOf(sinValue));
                        tvSec.setText("sin(" + input + ")");
                    } catch (NumberFormatException e) {
                        tvMain.setText("Error");
                    }
                }
            }
        });

        bco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = tvMain.getText().toString();
                if (!input.isEmpty()) {
                    try {
                        double number = Double.parseDouble(input);
                        double cosValue = Math.cos(Math.toRadians(number));
                        tvMain.setText(String.valueOf(cosValue));
                        tvSec.setText("cos(" + input + ")");
                    } catch (NumberFormatException e) {
                        tvMain.setText("Error");
                    }
                }
            }
        });

        bIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = tvMain.getText().toString();
                if (!input.isEmpty()) {
                    try {
                        double number = Double.parseDouble(input);
                        double lnValue = Math.log(number);
                        tvMain.setText(String.valueOf(lnValue));
                        tvSec.setText("ln(" + input + ")");
                    } catch (NumberFormatException e) {
                        tvMain.setText("Error");
                    }
                }
            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = tvMain.getText().toString();
                if (!input.isEmpty()) {
                    try {
                        double number = Double.parseDouble(input);
                        double logValue = Math.log10(number);
                        tvMain.setText(String.valueOf(logValue));
                        tvSec.setText("log(" + input + ")");
                    } catch (NumberFormatException e) {
                        tvMain.setText("Error");
                    }
                }
            }
        });

        bta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the current input from tvMain
                String input = tvMain.getText().toString();

                if (!input.isEmpty()) {
                    try {
                        double number = Double.parseDouble(input);
                        double tanValue = Math.tan(Math.toRadians(number));
                        tvMain.setText(String.valueOf(tanValue));
                        tvSec.setText("tan(" + input + ")");
                    } catch (NumberFormatException e) {
                        tvMain.setText("Error");
                    }
                }
            }
        });

        bInv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMain.setText(tvMain.getText()+"^" + "(-1)");
            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val = Integer.parseInt(tvMain.getText().toString());
                int fact = factorial(val);
                tvMain.setText(String.valueOf(fact));
                tvSec.setText(val + "!");
            }
        });
        bSar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double d = Double.parseDouble(tvMain.getText().toString());
                double square = d*d;
                tvMain.setText(String.valueOf(square));
                tvSec.setText(d+"²");
            }
        });
        bEel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = tvMain.getText().toString();
                if (!input.isEmpty()) {
                    try {
                        String replacedStr = input.replace("×", "*").replace("÷", "/");
                        double result = eval(replacedStr);
                        tvMain.setText(String.valueOf(result));
                        tvSec.setText(input);
                    } catch (Exception e) {
                        tvMain.setText("Error");
                    }
                }
            }
        });


        bPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = tvMain.getText().toString();
                if (!input.isEmpty()) {
                    try {
                        double value = Double.parseDouble(input);
                        double percentage = value * 0.01;
                        tvMain.setText(String.valueOf(percentage));
                        tvSec.setText(input + "%");
                    } catch (NumberFormatException e) {
                        tvMain.setText(input + "%");
                    }
                }
            }
        });

        bRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = tvMain.getText().toString();
                if (!input.isEmpty()) {
                    try {
                        double number = Double.parseDouble(input);
                        double squareRoot = Math.sqrt(number);
                        tvMain.setText(String.valueOf(squareRoot));
                        tvSec.setText("√(" + input + ")");
                    } catch (NumberFormatException e) {
                        tvMain.setText("Error");
                    }
                }
            }
        });

    }
    // funcation
    int factorial(int n){
        return (n==1 || n==0)? 1: n*factorial(n-1);
    }
    //equal function
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }
            boolean eat(int charToEat){
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }
            double parse(){
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected" + (char)ch);
                return x;
            }

            double parseExpression(){
                double x = parseTerm();
                for (;;){
                    if (eat('+')) x += parseTerm();
                    else if (eat('-')) x -= parseTerm();
                    else return x;
                }
            }
            double parseTerm(){
                double x = parseFactor();
                for (;;) {
                    if (eat('*')) x *= parseFactor();
                    else if (eat('/')) x /= parseFactor();
                    else return x;
                }
            }
            double parseFactor(){
                if (eat('+')) return parseFactor();
                if (eat('-')) return parseFactor();

                double x;
                int startPos = this.pos;
                if (eat('(')) {
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                }else if (ch == '%') {
                    nextChar();
                    x = parseFactor() / 100.0;
                }else if (ch == '*') {
                    nextChar();
                    x = parseFactor();
                }else if (ch >= 'a' && ch <= 'z') {
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sprt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("In")) x = Math.log(x);
                    else{
                        throw new RuntimeException("Unknown function:" +func);
                    }
                }else {
                    throw new RuntimeException("Unexpected" + (char)ch);
                }
                if (eat('^')) x = Math.pow(x, parseFactor());

                return x;
            }
        }.parse();
    }
}
;