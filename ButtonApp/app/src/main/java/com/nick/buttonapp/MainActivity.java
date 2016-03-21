package com.nick.buttonapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.nick.buttonapp.fragments.AllFragment;
import com.nick.buttonapp.fragments.MyFragment;

public class MainActivity extends AppCompatActivity {

    private Button all;
    private Button my;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        all = (Button) findViewById(R.id.all);
        my = (Button) findViewById(R.id.my);

        all.setEnabled(false);
        my.setEnabled(true);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new AllFragment()).commit();
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.all:
                all.setEnabled(false);
                my.setEnabled(true);
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new AllFragment()).commit();
                break;
            case R.id.my:
                my.setEnabled(false);
                all.setEnabled(true);
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new MyFragment()).commit();
                break;
        }
    }
}
