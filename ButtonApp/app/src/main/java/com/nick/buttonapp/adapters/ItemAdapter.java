package com.nick.buttonapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.nick.buttonapp.R;

/**
 * Created by Administrator on 2016/3/17.
 */

/**
 * 该适配器可以给全部订阅下和我的订阅的Fragment中的listview做同一个适配器
 */
public class ItemAdapter extends BaseAdapter {

    Context context;

    public ItemAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object getItem(int position) {
        return 5;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_all,parent,false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.title.setText("热门新闻解读");
        holder.image.setImageResource(R.mipmap.ic_launcher);
        holder.content.setText("每日小校,啊发发阿发.");

        return convertView;
    }

    class ViewHolder{
        ImageView image;
        TextView title;
        TextView content;
        Button btn;

        public ViewHolder(View itemView) {
            image = (ImageView) itemView.findViewById(R.id.item_image);
            title = (TextView) itemView.findViewById(R.id.item_title);
            content = (TextView) itemView.findViewById(R.id.item_content);
            btn = (Button) itemView.findViewById(R.id.item_btn);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (v.isPressed()){
                        v.setPressed(false);
                    }else {
                        v.setPressed(true);
                    }
                }
            });
        }
    }
}
