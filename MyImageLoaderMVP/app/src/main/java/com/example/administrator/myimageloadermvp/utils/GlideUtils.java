package com.example.administrator.myimageloadermvp.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.administrator.myimageloadermvp.R;

/**
 * Description :
 * Email  : bigbigpeng3@gmail.com
 * Author : peng zhang
 * Date   : 2016-2-5
 */
public class GlideUtils {
    public static void display(Context context, ImageView imageView, String url) {
        if(imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        Glide.with(context).
                load(url).
                placeholder(R.drawable.ic_image_loading)
                .error(R.drawable.ic_image_loadfail)
                .crossFade()
                .into(imageView);
    }
}
