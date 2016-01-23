package com.example.administrator.myjsouptest;

/**
 * Description :
 * Email  : bigbigpeng3@gmail.com
 * Author : peng zhang
 * Date   : 2016-1-21
 */
public class NewsItem {

    private String title;//新闻标题
    private String content;//新闻内容
    private String image;//新闻图片链接
    private String href;//新闻链接

    public NewsItem(String title, String content, String href) {
        this.title = title;
        this.content = content;
        this.href = href;
    }
    public NewsItem(String title, String content, String image, String href) {
        this.title = title;
        this.content = content;
        this.image = image ;
        this.href = href;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
