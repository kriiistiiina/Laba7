package com.example.laba7;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onCloseButtonClick(View view){
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);

        String[] mIngredients={"Томаты","Курица","Шампиньоны","Маслины"};
        final boolean[] mSelectedIngredients={false, false, false, false};

        builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Выберитеинградианты для своей пиццы")
                .setIcon(R.drawable.pizza)
                .setCancelable(false)
                .setMultiChoiceItems(mIngredients, null, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        mSelectedIngredients[which]=isChecked;
                    }
                })
                .setPositiveButton("ОК",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {

                            }
                        });

    }
}