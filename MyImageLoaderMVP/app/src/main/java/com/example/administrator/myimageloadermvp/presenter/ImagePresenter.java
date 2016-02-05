package com.example.administrator.myimageloadermvp.presenter;

import android.content.Context;
import android.widget.ImageView;

import com.example.administrator.myimageloadermvp.commons.Urls;
import com.example.administrator.myimageloadermvp.model.IImageModel;
import com.example.administrator.myimageloadermvp.model.ImageModel;
import com.example.administrator.myimageloadermvp.view.MainView;

/**
 * Description :
 * Email  : bigbigpeng3@gmail.com
 * Author : peng zhang
 * Date   : 2016-2-5
 */
public class ImagePresenter {

    MainView mainView ;
    Context context ;
    ImageView imageView;

    IImageModel iImageModel = new ImageModel();

    public static ImagePresenter imagePresenter = new ImagePresenter();

    public ImagePresenter(){

    }


    //从MainActivity中获取到MainView接口的实现
    public void setMainView(MainView mainView){
        this.mainView = mainView;
        context = mainView.getContext();
        imageView = mainView.getImageView();
    }

    public void MainSetImage(){
        mainView.setImage();
        iImageModel.loadImage(context,imageView, Urls.imageUrl);
    }


}
