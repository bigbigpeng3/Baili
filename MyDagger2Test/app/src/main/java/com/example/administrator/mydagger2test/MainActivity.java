package com.example.administrator.mydagger2test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Description :A good exmple to understand the usage of dagger2
 * Email  : bigbigpeng3@gmail.com
 * Author : peng zhang
 * Date   : 2016-1-23
 */

public class MainActivity extends AppCompatActivity {

    TextView message ;

    Vehicle vehicle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message = (TextView) findViewById(R.id.tv_message);
        VehicleComponent component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();

        vehicle = component.provideVehicle();

        Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();

    }
}
