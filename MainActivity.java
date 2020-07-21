package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView input, signbox;
    String sign, value1, value2;
    Double num1, num2, result;
    boolean hasdot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (TextView) findViewById(R.id.input);
        signbox = (TextView) findViewById(R.id.sign);
        hasdot = false;
    }

    public void btn7(View view) {
        input.setText(input.getText() + "7");
    }

    public void btn8(View view) {
        input.setText(input.getText() + "8");
    }

    public void btn9(View view) {
        input.setText(input.getText() + "9");
    }

    public void btn4(View view) {
        input.setText(input.getText() + "4");
    }

    public void btn5(View view) {
        input.setText(input.getText() + "5");
    }

    public void btn6(View view) {
        input.setText(input.getText() + "6");
    }

    public void btn3(View view) {
        input.setText(input.getText() + "3");
    }

    public void btn2(View view) {
        input.setText(input.getText() + "2");
    }

    public void btn1(View view) {
        input.setText(input.getText() + "1");
    }

    public void btn0(View view) {
        input.setText(input.getText() + "0");
    }

    public void dot(View view) {
        if (!hasdot) {
            if (input.getText().equals("")) {
                input.setText(("0."));
            } else {
                input.setText(input.getText() + ".");
            }
            hasdot = true;
        }
    }


    public void add(View view) {
        sign = "+";
        value1 = input.getText().toString();
        input.setText(null);
        signbox.setText("+");
        hasdot = false;
    }

    public void subtract(View view) {
        sign = "-";
        value1 = input.getText().toString();
        input.setText(null);
        signbox.setText("-");
        hasdot = false;
    }

    public void multiply(View view) {
        sign = "*";
        value1 = input.getText().toString();
        input.setText(null);
        signbox.setText("*");
        hasdot = false;
    }

    public void divide(View view) {
        sign = "/";
        value1 = input.getText().toString();
        input.setText(null);
        signbox.setText("/");
        hasdot = false;
    }

    public void log(View view) {
        sign = "log";
        input.setText(null);
        signbox.setText("log");
        hasdot = false;
    }

    public void ln(View view) {
        sign = "ln";
        input.setText(null);
        signbox.setText("ln");
        hasdot = false;
    }

    public void power(View view) {
        sign = "power";
        value1 = input.getText().toString();
        input.setText(null);
        signbox.setText("x^n");
        hasdot = false;
    }

    public void factorial(View view) {
        sign = "factorial";
        input.setText(null);
        signbox.setText("!");
        hasdot = false;
    }

    public void sin(View view) {
        sign = "sin";
        input.setText(null);
        signbox.setText("sin");
        hasdot = false;
    }

    public void cos(View view) {
        sign = "cos";
        input.setText(null);
        signbox.setText("cos");
        hasdot = false;
    }

    public void tan(View view) {
        sign = "tan";
        input.setText(null);
        signbox.setText("tan");
        hasdot = false;
    }

    public void root(View view) {
        sign = "root";
        input.setText(null);
        signbox.setText("√");
        hasdot = false;
    }


    public void equal(View view) {
        if (sign == null) {
            signbox.setText("Error!");
        }
        if (input.getText().equals("")) {
            signbox.setText("Error!");
        } else if (sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/") && value1.equals("")) {
            signbox.setText("Error!");
        }
        switch (sign) {
            default:
                break;
            case "log":
                value1 = input.getText().toString();
                num1 = Double.parseDouble(value1);
                input.setText(Math.log10(num1) + "");
                sign = null;
                signbox.setText(null);
                break;

            case "ln":
                value1 = input.getText().toString();
                num1 = Double.parseDouble(value1);
                input.setText(Math.log(num1) + "");
                sign = null;
                signbox.setText(null);
                break;

            case "power":
                value2 = input.getText().toString();
                num1 = Double.parseDouble(value1);
                num2 = Double.parseDouble(value2);
                input.setText(Math.pow(num1, num2) + "");
                sign = null;
                signbox.setText(null);
                break;

            case "root":
                value1 = input.getText().toString();
                num1 = Double.parseDouble(value1);
                input.setText(Math.sqrt(num1) + "");
                sign = null;
                signbox.setText(null);
                break;

            case "factorial":
                value1 = input.getText().toString();
                num1 = Double.parseDouble(value1);
                int i = Integer.parseInt(value1) - 1;

                while (i > 0) {
                    num1 = num1 * i;
                    i--;
                }
                input.setText(num1 + "");
                sign = null;
                signbox.setText(null);
                break;

            case "sin":
                value1 = input.getText().toString();
                num1 = Double.parseDouble(value1);
                input.setText(Math.sin(num1) + "");
                sign = null;
                signbox.setText(null);
                break;

            case "cos":
                value1 = input.getText().toString();
                num1 = Double.parseDouble(value1);
                input.setText(Math.cos(num1) + "");
                sign = null;
                signbox.setText(null);
                break;

            case "tan":
                value1 = input.getText().toString();
                num1 = Double.parseDouble(value1);
                input.setText(Math.tan(num1) + "");
                sign = null;
                signbox.setText(null);
                break;

            case "+":
                value2 = input.getText().toString();
                num1 = Double.parseDouble(value1);
                num2 = Double.parseDouble(value2);
                result = num1 + num2;
                input.setText(result + "");
                sign = null;
                signbox.setText(null);
                break;

            case "-":
                value2 = input.getText().toString();
                num1 = Double.parseDouble(value1);
                num2 = Double.parseDouble(value2);
                result = num1 - num2;
                input.setText(result + "");
                sign = null;
                signbox.setText(null);
                break;


            case "*":
                value2 = input.getText().toString();
                num1 = Double.parseDouble(value1);
                num2 = Double.parseDouble(value2);
                result = num1 * num2;
                input.setText(result + "");
                sign = null;
                signbox.setText(null);
                break;


            case "/":
                value2 = input.getText().toString();
                num1 = Double.parseDouble(value1);
                num2 = Double.parseDouble(value2);
                result = num1 / num2;
                input.setText(result + "");
                sign = null;
                signbox.setText(null);
                break;

        }
    }


public void delete(View view){
    if(input.getText().equals("")){

        input.setText(null);
    }
    else{
        int len=input.getText().length();
        String s=input.getText().toString();
        if(s.charAt(len-1)=='.'){
            hasdot=false;
            input.setText(input.getText().subSequence(0,input.getText().length()-1));
        }else{
            input.setText(input.getText().subSequence(0,input.getText().length()-1));
        }
    }
}
public void clear(View view){
    input.setText(null);
    signbox.setText(null);
    value1=null;
    value2=null;
    sign=null;
    hasdot=false;
}
}
