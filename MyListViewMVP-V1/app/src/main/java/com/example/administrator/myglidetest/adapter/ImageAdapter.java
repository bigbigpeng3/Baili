package com.example.administrator.myglidetest.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.myglidetest.R;
import com.example.administrator.myglidetest.bean.Image;

import java.util.List;

/**
 * Description :
 * Email  : bigbigpeng3@gmail.com
 * Author : peng zhang
 * Date   : 2016-2-6
 */
public class ImageAdapter extends BaseAdapter {

    Context context;
    List<Image> images;

    public ImageAdapter(Context context, List<Image> images) {
        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public Image getItem(int position) {
        return images.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(context,
                R.layout.list_image_item, null);

        ImageView imageView =
                (ImageView) view.findViewById(R.id.iv_pic);

        TextView textView =
                (TextView) view.findViewById(R.id.tv_text);

        Image item = getItem(position);

        Uri uri = Uri.parse(item.getImageurl());

        Glide.with(context)
                .load(uri)
                .centerCrop()
                .crossFade()
                .into(imageView);

        //imageView.setImageURI(uri);
        textView.setText(item.getText());

        return view;
    }
}