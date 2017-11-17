package com.example.administrator.android_day_01.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.administrator.android_day_01.Model.ModelimpIModel;
import com.example.administrator.android_day_01.R;
import com.example.administrator.android_day_01.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements IView{

    private String res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void show(String result){
        res = result;
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "结果是"+res, Toast.LENGTH_SHORT).show();
            }
        });


    }
    public void click(View view){
        new Presenter(this).request("https://www.uc123.com/");
    }
}
