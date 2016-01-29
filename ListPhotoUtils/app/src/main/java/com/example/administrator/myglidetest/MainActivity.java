package com.example.administrator.myglidetest;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ListView lvPhoto;

    private String[] url = ImageURL.imageURL;

    private List<Image> images = new ArrayList<Image>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvPhoto = (ListView) findViewById(R.id.lv_photo);
        initData();
        lvPhoto.setAdapter(new ImageAdapter());

    }

    private void initData() {

        Image image;
        for (int j = 0; j < url.length; j++) {
            image = new Image(url[j]);
            images.add(image);
        }
    }

    class ImageAdapter extends BaseAdapter {

        // private BitmapUtils utils;

        public ImageAdapter() {
            // utils = new BitmapUtils(MainActivity.this);
            // utils.configDefaultLoadingImage(R.drawable.pic_item_list_default);
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
            View view = View.inflate(MainActivity.this,
                    R.layout.list_image_item, null);

            ImageView imageView = (ImageView) view
                    .findViewById(R.id.iv_pic);

            Image item = getItem(position);
            Uri uri = Uri.parse(item.getImageurl());
            imageView.setImageURI(uri);

            return view;
        }

    }


}
