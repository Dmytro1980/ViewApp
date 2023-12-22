package com.example.viewapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.GridLayout;

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
        gridLayout.setColumnCount(3);

        for (int i = 1; i <= 9; i++) {
            Button button = new Button(this);
            button.setText(String.valueOf(i));
            gridLayout.addView(button);
        }

        setContentView(gridLayout);

    }
}