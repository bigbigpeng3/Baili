package com.me.www.mybaserecyclerviewcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MainLayoutAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<MenuInfo> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        mRecyclerView = (RecyclerView) findViewById(R.id.paint_recycle_view);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager); //绑上列表管理器
        //添加分割线,默认还不是要了吧,
        ///mRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());   //默认动画
        mAdapter = new MainLayoutAdapter(arrayList, this);
        // 设置点击事件
        mAdapter.setItemClickListener(new MainItemClickListener() {
            @Override
            public void onItemClick(View view, String name, String time) {
                //System.out.println("MainActivity..." + name + time);
                Toast.makeText(getApplicationContext(),name + time,Toast.LENGTH_SHORT).show();
            }
        });
        //绑定数据
        mRecyclerView.setAdapter(mAdapter);


    }


    private void initData() {
        arrayList = new ArrayList<>();

        arrayList.add(new MenuInfo("张三", "1"));
        arrayList.add(new MenuInfo("李四", "2"));
        arrayList.add(new MenuInfo("王五", "3"));
        arrayList.add(new MenuInfo("龟六", "4"));
        arrayList.add(new MenuInfo("刘七", "5"));
        arrayList.add(new MenuInfo("白八", "6"));
    }
}
