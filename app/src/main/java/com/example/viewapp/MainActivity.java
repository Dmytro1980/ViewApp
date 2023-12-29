package com.example.viewapp;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // ! ! ! ! !
    // GridLayout
    // ! ! ! ! !

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;

    private TextView textView;

    private List<Button> buttonList = new ArrayList<>(8);

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
        gridLayout.setRowCount(4);
        // установка количество столбцов
        gridLayout.setColumnCount(3);
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


//        Button button1 = new Button(this);

        textView = new TextView(this);
        textView.setText("");
        textView.setTextSize(100);
        GridLayout.LayoutParams layoutParamsTextView = new GridLayout.LayoutParams();
        layoutParamsTextView.columnSpec = GridLayout.spec(0);
        layoutParamsTextView.rowSpec = GridLayout.spec(0, 1);
        gridLayout.addView(textView, layoutParamsTextView);

//        button1 = new Button(this);
//        button1.setText("1");
//        button1.setId(new Integer(1));
//        button1.setOnClickListener(this);


        button1 = new Button(this);
        createButton(button1, 1);
//        button1.setOnClickListener(this);


        GridLayout.LayoutParams layoutParams1 = new GridLayout.LayoutParams();
        layoutParams1.columnSpec = GridLayout.spec(0, 1);
        layoutParams1.width = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 90, getResources().getDisplayMetrics()
        );
        gridLayout.addView(button1, layoutParams1);


//        for (int i = 0; i < 8; i++) {
//            buttonList.add(new Button(this));
//        }


        for (int i = 0; i < 9; i++){
            Button button = new Button(this);
            createButton(button, i + 1);
            buttonList.add(button);
        }

//            buttonList.add(new Button(this));

        // для отладки
        textView.setText(Integer.toString(buttonList.size()));

        int i = 2;
        for (Button button : buttonList) {
            createButton(button, i);
//            button.setOnClickListener(this);
            gridLayout.addView(button);
            i++;
        }

//        for (int i = 0; i < 9; i++) {
//            createButton(buttonList.get(i), i + 1);
//            buttonList.get(i).setOnClickListener(this);
//            gridLayout.addView(buttonList.get(i));
//        }


//        button2 = new Button(this);
//        button2.setText("2");
//        button2.setId(new Integer(2));
//        button2.setOnClickListener(this);
//        gridLayout.addView(button2);
//
//        button3 = new Button(this);
//        button3.setText("3");
//        button3.setId(new Integer(3));
//        button3.setOnClickListener(this);
//        gridLayout.addView(button3);


//        button4 = new Button(this);
//        button4.setText("4");
//        button4.setId(new Integer(4));
//        button4.setOnClickListener(this);


//        GridLayout.LayoutParams layoutParams4 = new GridLayout.LayoutParams();
//        layoutParams4.columnSpec = GridLayout.spec(0, 3);
//        layoutParams4.width = (int) TypedValue.applyDimension(
//                TypedValue.COMPLEX_UNIT_DIP, 270, getResources().getDisplayMetrics()
//        );
//        gridLayout.addView(button4, layoutParams4);
//        gridLayout.addView(button4);

//        button5 = new Button(this);
//        button5.setText("5");
//        button5.setId(new Integer(5));
//        button5.setOnClickListener(this);
//
//        GridLayout.LayoutParams layoutParams5 = new GridLayout.LayoutParams();
//        layoutParams5.columnSpec = GridLayout.spec(1, 1);
//        layoutParams5.width = (int) TypedValue.applyDimension(
//                TypedValue.COMPLEX_UNIT_DIP, 90, getResources().getDisplayMetrics()
//        );
//        gridLayout.addView(button5, layoutParams5);


//        button6 = new Button(this);
//        button6.setText("6");
//        button6.setId(new Integer(6));
//        button6.setOnClickListener(this);
//        gridLayout.addView(button6);
//
//        button7 = new Button(this);
//        button7.setText("7");
//        button7.setId(new Integer(7));
//        button7.setOnClickListener(this);
//        gridLayout.addView(button7);
//
//
//        button8 = new Button(this);
//        button8.setText("8");
//        button8.setId(new Integer(8));
//        button8.setOnClickListener(this);
//
//        GridLayout.LayoutParams layoutParams8 = new GridLayout.LayoutParams();
//        layoutParams8.columnSpec = GridLayout.spec(1, 1);
//        layoutParams8.width = (int) TypedValue.applyDimension(
//                TypedValue.COMPLEX_UNIT_DIP, 90, getResources().getDisplayMetrics()
//        );
//        gridLayout.addView(button8, layoutParams8);
//
////        gridLayout.addView(button8);
//
//        button9 = new Button(this);
//        button9.setText("9");
//        button9.setId(new Integer(9));
//        button9.setOnClickListener(this);
//        gridLayout.addView(button9);

        button0 = new Button(this);
        createButton(button0, 0);

        GridLayout.LayoutParams layoutParams0 = new GridLayout.LayoutParams();
        layoutParams0.columnSpec = GridLayout.spec(0, 3);
        layoutParams0.width = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 270, getResources().getDisplayMetrics()
        );
        gridLayout.addView(button0, layoutParams0);
//        gridLayout.addView(button0);


        setContentView(gridLayout);

    }

    public void createButton(Button button, Integer buttonNumber) {
//        button = new Button(this);
        button.setText(buttonNumber.toString());
        button.setId(buttonNumber);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case 1:
                textView.setText(button1.getText());
                break;
            case 2:
                textView.setText(button2.getText());
                break;
            case 3:
                textView.setText(button3.getText());
                break;
            case 4:
                textView.setText(button4.getText());
                break;
            case 5:
                textView.setText(button5.getText());
                break;
            case 6:
                textView.setText(button6.getText());
                break;
            case 7:
                textView.setText(button7.getText());
                break;
            case 8:
                textView.setText(button8.getText());
                break;
            case 9:
                textView.setText(button9.getText());
                break;
            case 0:
                textView.setText(button0.getText());
                break;
            default:
                break;
        }
    }
}