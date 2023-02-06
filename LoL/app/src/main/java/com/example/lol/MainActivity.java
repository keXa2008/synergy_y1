package com.example.lol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void check(View view) {
        int[] cost={70, 25, 53, 19, 41};
        int[] discount={77, 37, 44, 0, 32};
        EditText balance=findViewById(R.id.money);
        Button but=findViewById(R.id.calc);
        int kit_sum=disc_calc(cost[0], discount[0])+
                disc_calc(cost[1], discount[1])+
                disc_calc(cost[2], discount[2])+
                disc_calc(cost[3], discount[3])+
                disc_calc(cost[4], discount[4]);
        if(Double.parseDouble(balance.getText().toString())>kit_sum){
            but.setText("да");
        }else{
            but.setText("нет");
        }
    }

    public static int disc_calc(int cost, int discount){
        return cost-(cost*discount/100);
    }
}