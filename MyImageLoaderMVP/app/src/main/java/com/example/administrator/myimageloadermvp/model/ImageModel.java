package com.example.administrator.myimageloadermvp.model;

import android.content.Context;
import android.widget.ImageView;

import com.example.administrator.myimageloadermvp.presenter.ImagePresenter;
import com.example.administrator.myimageloadermvp.utils.GlideUtils;

/**
 * Description :
 * Email  : bigbigpeng3@gmail.com
 * Author : peng zhang
 * Date   : 2016-2-5
 */
public class ImageModel implements IImageModel{

    @Override
    public void loadImage(Context ctx, ImageView imageView, String url) {
        GlideUtils.display(ctx, imageView, url);
    }
}
