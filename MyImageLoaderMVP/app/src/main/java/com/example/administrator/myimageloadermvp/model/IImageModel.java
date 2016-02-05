package com.example.administrator.myimageloadermvp.model;

import android.content.Context;
import android.widget.ImageView;

/**
 * Description :
 * Email  : bigbigpeng3@gmail.com
 * Author : peng zhang
 * Date   : 2016-2-5
 */
public interface IImageModel {

    void loadImage(Context ctx, ImageView imageView, String url);
}
