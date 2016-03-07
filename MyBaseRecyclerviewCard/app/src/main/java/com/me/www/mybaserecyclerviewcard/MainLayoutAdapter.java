package com.me.www.mybaserecyclerviewcard;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Description :
 * Email  : bigbigpeng3@gmail.com
 * Author : peng zhang
 * Date   : 2016-3-7
 */
public class MainLayoutAdapter extends RecyclerView.Adapter<MainLayoutAdapter.MainViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<MenuInfo> userList;
    private Context context;
    private MainItemClickListener itemClickListener;

    public MainLayoutAdapter(ArrayList<MenuInfo> userList, Context context) {
        this.userList = userList;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }


    public void setItemClickListener(MainItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }


    //onCreateviewHolder函数和onBindViewHolder实现了ListView里面getView的工作，分别为找到控件和控件赋值

    @Override
    public MainLayoutAdapter.MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View wrapper = inflater.inflate(R.layout.cardview, parent, false);
        return new MainViewHolder(wrapper, (TextView) wrapper.findViewById(R.id.paint_name), (TextView) wrapper.findViewById(R.id.paint_time));
        //(TextView) wrapper.findViewById(R.id.paint_root),
        //(ImageView) wrapper.findViewById(R.id.paint_img)
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        MenuInfo menuInfo = userList.get(position);
        //holder.paint_img.setImageURI(Uri.parse(menuInfo.getPaint_img_root()));
        holder.paint_name.setText(menuInfo.getPaint_name());
        holder.paint_time.setText(menuInfo.getPaint_time());
        //holder.paint_root.setText(menuInfo.getPaint_root());
    }


    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
        private TextView paint_name;
        private TextView paint_time;
        // private TextView paint_root;
        //private ImageView paint_img;

        public MainViewHolder(View itemView, TextView paint_name, TextView paint_time) {
            super(itemView);
            itemView.setOnClickListener(this);
            this.paint_name = paint_name;
            this.paint_time = paint_time;
            //this.paint_root = paint_root;
            // this.paint_img = paint_img;
        }

        @Override
        public void onClick(View view) {
            MenuInfo menuInfo = userList.get(getAdapterPosition());
            itemClickListener.onItemClick(view, menuInfo.getPaint_name(), menuInfo.getPaint_time());
        }

        @Override
        public boolean onLongClick(View view) {
            return false;
        }
    }
}
