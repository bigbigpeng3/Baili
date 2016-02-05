package com.example.administrator.myimageloadermvp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.administrator.myimageloadermvp.presenter.ImagePresenter;
import com.example.administrator.myimageloadermvp.view.MainView;

public class MainActivity extends AppCompatActivity implements MainView{

    private Button getImage;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViews();
        //把实现的方法传给ImagePresenter
        ImagePresenter.imagePresenter.setMainView(this);

    }


    /**
     * 初始化界面
     */
    private void initViews() {
        setContentView(R.layout.activity_main);
        getImage = (Button) findViewById(R.id.btn_getImage);
        imageView = (ImageView) findViewById(R.id.iv_pic);

        getImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImagePresenter.imagePresenter.MainSetImage();
            }
        });
    }


    @Override
    public void setImage() {
        System.out.println("MainActivity...setImage");
    }

    @Override
    public Context getContext() {
        return MainActivity.this;
    }

    @Override
    public ImageView getImageView() {
        return imageView;
    }

}
