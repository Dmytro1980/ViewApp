package com.example.viewapp;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // ! ! ! ! !
    // GridLayout
    // ! ! ! ! !

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        // для использования разметки из activity_main.xml
//        // ! ! ! ! ! ! ! ! ! !
//        setContentView(R.layout.activity_main);
//        // ! ! ! ! ! ! ! ! ! !


        // програмное создание GridLayout
        GridLayout gridLayout = new GridLayout(this);

        // установка количество строк
        gridLayout.setRowCount(3);
        // установка количество столбцов
        gridLayout.setColumnCount(4);
//
//        for (int i = 1; i <= 9; i++) {
//            Button button = new Button(this);
//            button.setText(String.valueOf(i));
//            gridLayout.addView(button);
//        }

//        // мои пробы с МЕТАНИТ
//
//        Button button1 = new Button(this);
//        button1.setText("Press 1");
//        gridLayout.addView(button1);
//
//        Button button2 = new Button(this);
//        button2.setText("Press 2");
//        gridLayout.addView(button2);
//
//        Button button3 = new Button(this);
//        button3.setText("Press 3");
//        gridLayout.addView(button3);
//
//        Button button4 = new Button(this);
//        button4.setText("Press 4");
//
//        GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
//
//        layoutParams.columnSpec = GridLayout.spec(0, 2);
//        layoutParams.rowSpec = GridLayout.spec(2, 1, GridLayout.CENTER);
//
//        layoutParams.width = GridLayout.LayoutParams.MATCH_PARENT;
//        layoutParams.height = GridLayout.LayoutParams.WRAP_CONTENT;
//
//
//
//        gridLayout.addView(button4, layoutParams);

        Button button1 = new Button(this);
        button1.setText("1");
        gridLayout.addView(button1);

        Button button2 = new Button(this);
        button2.setText("2");
        gridLayout.addView(button2);

        Button button3 = new Button(this);
        button3.setText("3");
        gridLayout.addView(button3);

        TextView textView = new TextView(this);
        textView.setText("0");
        textView.setTextSize(100);
        GridLayout.LayoutParams layoutParamsTextView = new GridLayout.LayoutParams();
        layoutParamsTextView.columnSpec = GridLayout.spec(3);
        layoutParamsTextView.rowSpec = GridLayout.spec(0,3);
        gridLayout.addView(textView, layoutParamsTextView);


        Button button4 = new Button(this);
        button4.setText("4");

        GridLayout.LayoutParams layoutParams4 = new GridLayout.LayoutParams();
        layoutParams4.columnSpec = GridLayout.spec(0,2);
        layoutParams4.width = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 180, getResources().getDisplayMetrics()
        );
        gridLayout.addView(button4, layoutParams4);

        Button button5 = new Button(this);
        button5.setText("5");

        GridLayout.LayoutParams layoutParams5 = new GridLayout.LayoutParams();
        layoutParams5.columnSpec = GridLayout.spec(1,2);
        layoutParams5.width = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 90, getResources().getDisplayMetrics()
        );
        gridLayout.addView(button5, layoutParams5);

        Button button6 = new Button(this);
        button6.setText("6");
        gridLayout.addView(button6);

        Button button7 = new Button(this);
        button7.setText("7");
        gridLayout.addView(button7);

        Button button8 = new Button(this);
        button8.setText("8");
        gridLayout.addView(button8);

        Button button9 = new Button(this);
        button9.setText("9");
        gridLayout.addView(button9);

        Button button0 = new Button(this);
        button0.setText("0");
        gridLayout.addView(button0);



        setContentView(gridLayout);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(button4.getText());
            }
        });

    }
}