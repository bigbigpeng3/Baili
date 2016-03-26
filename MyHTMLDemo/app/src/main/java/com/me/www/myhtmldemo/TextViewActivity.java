package com.me.www.myhtmldemo;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;

public class TextViewActivity extends AppCompatActivity {


    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        tv = (TextView) this.findViewById(R.id.tv_text);
        tv.setMovementMethod(ScrollingMovementMethod.getInstance());// 滚动
        final MyHandler myHandler = new MyHandler(TextViewActivity.this);
        Thread t = new Thread(new Runnable() {
            Message msg = Message.obtain();

            @Override
            public void run() {

                /**
                 * 要实现图片的显示需要使用Html.fromHtml的一个重构方法：public static Spanned
                 * fromHtml (String source, Html.ImageGetterimageGetter,
                 * Html.TagHandler
                 * tagHandler)其中Html.ImageGetter是一个接口，我们要实现此接口，在它的getDrawable
                 * (String source)方法中返回图片的Drawable对象才可以。
                 */
                Html.ImageGetter imageGetter = new Html.ImageGetter() {

                    @Override
                    public Drawable getDrawable(String source) {
                        // TODO Auto-generated method stub
                        URL url;
                        Drawable drawable = null;
                        try {
                            url = new URL(source);
                            drawable = Drawable.createFromStream(url.openStream(), null);
                            drawable.setBounds(0, 0,
                                    drawable.getIntrinsicWidth(),
                                    drawable.getIntrinsicHeight());
                        } catch (MalformedURLException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        return drawable;
                    }
                };
                CharSequence test = Html.fromHtml(HTMLString.strHTML, imageGetter, null);
                msg.what = 0x101;
                msg.obj = test;
                myHandler.sendMessage(msg);
            }
        });
        t.start();
    }

    /*
     * Handler
     * 类应该应该为static类型，否则有可能造成泄露。在程序消息队列中排队的消息保持了对目标Handler类的应用。如果Handler是个内部类，那
     * 么它也会保持它所在的外部类的引用。为了避免泄露这个外部类，应该将Handler声明为static嵌套类，并且使用对外部类的弱应用。
     */
    private static class MyHandler extends Handler {
        WeakReference<TextViewActivity> mActivity;
        public MyHandler(TextViewActivity activity) {
            // TODO Auto-generated constructor stub
            mActivity = new WeakReference<TextViewActivity>(activity);
        }
        @Override
        public void handleMessage(Message msg) {
            // TODO Auto-generated method stub
            TextViewActivity theActivity = mActivity.get();
            if (msg.what == 0x101) {
                theActivity.tv.setText((CharSequence) msg.obj);
            }
            super.handleMessage(msg);
        }
    }

}
