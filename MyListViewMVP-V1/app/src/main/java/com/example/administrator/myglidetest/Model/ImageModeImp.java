package com.example.administrator.myglidetest.Model;

import com.example.administrator.myglidetest.commons.ImageText;
import com.example.administrator.myglidetest.commons.ImageURL;
import com.example.administrator.myglidetest.bean.Image;

import java.util.ArrayList;
import java.util.List;

/**
 * Description :
 * Email  : bigbigpeng3@gmail.com
 * Author : peng zhang
 * Date   : 2016-2-6
 */
public class ImageModeImp implements ImageModel {

    //ModelImp就是做一些数据的初始化。获取到数据，然后交给presenter去处理

    public String[] url = ImageURL.imageURL;
    public String[] test = ImageText.texts;
    public static List<Image> images = new ArrayList<Image>();

    private void initData() {

        Image image;
        for (int j = 0; j < url.length; j++) {
            image = new Image(url[j], test[j]);
            images.add(image);
        }

    }

    @Override
    public void getData() {
        initData();
    }

}
