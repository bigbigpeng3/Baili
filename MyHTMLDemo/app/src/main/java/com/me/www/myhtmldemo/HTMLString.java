package com.me.www.myhtmldemo;

/**
 * Created by none1 on 2016/3/25.
 */
public class HTMLString {

    public static final String strHTML3="\n" +
            "<!DOCTYPE html>\n" +
            "<html>\n" +
            "    <head>\n" +
            "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n" +
            "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
            "<meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0\" />\n" +
            "<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\n" +
            "<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\n" +
            "<meta name=\"format-detection\" content=\"telephone=no\">\n" +
            "\n" +
            "\n" +
            "        <script type=\"text/javascript\">\n" +
            "            window.logs = {\n" +
            "                pagetime: {}\n" +
            "            };\n" +
            "            window.logs.pagetime['html_begin'] = (+new Date());\n" +
            "        </script>\n" +
            "        \n" +
            "\n" +
            "<script type=\"text/javascript\"> \n" +
            "\n" +
            "    var page_begintime = (+new Date());\n" +
            "\n" +
            "    var biz = \"MjM5NDkxMTgyNw==\"||\"\";\n" +
            "    var sn = \"a66a7aef1f821995a45d05189d60a04a\" || \"\"|| \"\";\n" +
            "    var mid = \"405358135\" || \"\"|| \"\";\n" +
            "    var idx = \"1\" || \"\" || \"\";\n" +
            "\n" +
            "    \n" +
            "    var is_rumor = \"\"*1;\n" +
            "    var norumor = \"\"*1;\n" +
            "    if (!!is_rumor&&!norumor){\n" +
            "      if (!document.referrer || document.referrer.indexOf(\"mp.weixin.qq.com/mp/rumor\") == -1){\n" +
            "        location.href = \"http://mp.weixin.qq.com/mp/rumor?action=info&__biz=\" + biz + \"&mid=\" + mid + \"&idx=\" + idx + \"&sn=\" + sn + \"#wechat_redirect\";\n" +
            "      }\n" +
            "    }\n" +
            "\n" +
            "    \n" +
            "    \n" +
            "</script>\n" +
            "\n" +
            "        <link rel=\"dns-prefetch\" href=\"//res.wx.qq.com\">\n" +
            "<link rel=\"dns-prefetch\" href=\"//mmbiz.qpic.cn\">\n" +
            "<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/images/icon/common/favicon22c41b.ico\">\n" +
            "<script type=\"text/javascript\">\n" +
            "    String.prototype.html = function(encode) {\n" +
            "        var replace =[\"&#39;\", \"'\", \"&quot;\", '\"', \"&nbsp;\", \" \", \"&gt;\", \">\", \"&lt;\", \"<\", \"&amp;\", \"&\", \"&yen;\", \"￥\"];\n" +
            "        if (encode) {\n" +
            "            replace.reverse();\n" +
            "        }\n" +
            "        for (var i=0,str=this;i< replace.length;i+= 2) {\n" +
            "             str=str.replace(new RegExp(replace[i],'g'),replace[i+1]);\n" +
            "        }\n" +
            "        return str;\n" +
            "    };\n" +
            "\n" +
            "    window.isInWeixinApp = function() {\n" +
            "        return /MicroMessenger/.test(navigator.userAgent);\n" +
            "    };\n" +
            "\n" +
            "    window.getQueryFromURL = function(url) {\n" +
            "        url = url || 'http://qq.com/s?a=b#rd'; \n" +
            "        var query = url.split('?')[1].split('#')[0].split('&'),\n" +
            "            params = {};\n" +
            "        for (var i=0; i<query.length; i++) {\n" +
            "            var arg = query[i].split('=');\n" +
            "            params[arg[0]] = arg[1];\n" +
            "        }\n" +
            "        if (params['pass_ticket']) {\n" +
            "        \tparams['pass_ticket'] = encodeURIComponent(params['pass_ticket'].html(false).html(false).replace(/\\s/g,\"+\"));\n" +
            "        }\n" +
            "        return params;\n" +
            "    };\n" +
            "\n" +
            "    (function() {\n" +
            "\t    var params = getQueryFromURL(location.href);\n" +
            "        window.uin = params['uin'] || '';\n" +
            "        window.key = params['key'] || '';\n" +
            "        window.wxtoken = params['wxtoken'] || '';\n" +
            "        window.pass_ticket = params['pass_ticket'] || '';\n" +
            "    })();\n" +
            "\n" +
            "</script>\n" +
            "\n" +
            "        <title>Android Volley核心源码解析</title>\n" +
            "        \n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/style/page/appmsg/page_mp_article_improve2c9cd6.css\">\n" +
            "<style>\n" +
            "     \n" +
            "    </style>\n" +
            "<!--[if lt IE 9]>\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/style/page/appmsg/page_mp_article_improve_pc2c9cd6.css\">\n" +
            "<![endif]-->\n" +
            "<script type=\"text/javascript\">\n" +
            "    document.domain = \"qq.com\";\n" +
            "</script>\n" +
            "\n" +
            "    </head>\n" +
            "    <body id=\"activity-detail\" class=\"zh_CN mm_appmsg\" ontouchstart=\"\">\n" +
            "        \n" +
            "    <script type=\"text/javascript\">\n" +
            "        var write_sceen_time = (+new Date());\n" +
            "    </script>\n" +
            "    \n" +
            "    <div id=\"js_cmt_mine\" class=\"discuss_container editing access\" style=\"display:none;\">\n" +
            "        <div class=\"discuss_container_inner\">\n" +
            "            <h2 class=\"rich_media_title\">Android Volley核心源码解析</h2>\n" +
            "            <span id=\"log\"></span>\n" +
            "            <div class=\"frm_textarea_box_wrp\">\n" +
            "                <span class=\"frm_textarea_box\">\n" +
            "                    <textarea id=\"js_cmt_input\" class=\"frm_textarea\" placeholder=\"留言将由公众号筛选后显示，对所有人可见。\"></textarea>\n" +
            "                    <div class=\"emotion_tool\">\n" +
            "                        <span class=\"emotion_switch\" style=\"display:none;\"></span>\n" +
            "                        <span id=\"js_emotion_switch\" class=\"pic_emotion_switch_wrp\">\n" +
            "                            <img class=\"pic_default\" src=\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/images/icon/appmsg/emotion/icon_emotion_switch.2x278965.png\" alt=\"\">\n" +
            "                            <img class=\"pic_active\" src=\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/images/icon/appmsg/emotion/icon_emotion_switch_active.2x278965.png\" alt=\"\">\n" +
            "                        </span>\n" +
            "                        <div class=\"emotion_panel\" id=\"js_emotion_panel\">\n" +
            "                            <span class=\"emotion_panel_arrow_wrp\" id=\"js_emotion_panel_arrow_wrp\">\n" +
            "                                <i class=\"emotion_panel_arrow arrow_out\"></i>\n" +
            "                                <i class=\"emotion_panel_arrow arrow_in\"></i>\n" +
            "                            </span>\n" +
            "                            <div class=\"emotion_list_wrp\" id=\"js_slide_wrapper\">\n" +
            "                                \n" +
            "                                \n" +
            "                            </div>\n" +
            "                            <ul class=\"emotion_navs\" id=\"js_navbar\">\n" +
            "                                \n" +
            "                            </ul>\n" +
            "                        </div>\n" +
            "                    </div>\n" +
            "                </span>\n" +
            "            </div>\n" +
            "            <div class=\"discuss_btn_wrp\"><a id=\"js_cmt_submit\" class=\"btn btn_primary btn_discuss btn_disabled\" href=\"javascript:;\">提交</a></div>\n" +
            "            <div class=\"discuss_list_wrp\" style=\"display:none\">\n" +
            "                <div class=\"rich_tips with_line title_tips discuss_title_line\">\n" +
            "                    <span class=\"tips\">我的留言</span>\n" +
            "                </div>\n" +
            "                <ul class=\"discuss_list\" id=\"js_cmt_mylist\"></ul>\n" +
            "            </div>\n" +
            "            <div class=\"rich_tips tips_global loading_tips\" id=\"js_mycmt_loading\">\n" +
            "                <img src=\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/images/icon/common/icon_loading_white2805ea.gif\" class=\"rich_icon icon_loading_white\" alt=\"\">\n" +
            "                <span class=\"tips\">加载中</span>\n" +
            "            </div>\n" +
            "            <div class=\"wx_poptips\" id=\"js_cmt_toast\" style=\"display:none;\">\n" +
            "                <img alt=\"\" class=\"icon_toast\" src=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAGoAAABqCAYAAABUIcSXAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA3NpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNS1jMDE0IDc5LjE1MTQ4MSwgMjAxMy8wMy8xMy0xMjowOToxNSAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyMTUxMzkxZS1jYWVhLTRmZTMtYTY2NS0xNTRkNDJiOGQyMWIiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6MTA3QzM2RTg3N0UwMTFFNEIzQURGMTQzNzQzMDAxQTUiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6MTA3QzM2RTc3N0UwMTFFNEIzQURGMTQzNzQzMDAxQTUiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NWMyOGVjZTMtNzllZS00ODlhLWIxZTYtYzNmM2RjNzg2YjI2IiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOjIxNTEzOTFlLWNhZWEtNGZlMy1hNjY1LTE1NGQ0MmI4ZDIxYiIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/Pmvxj1gAAAVrSURBVHja7J15rF1TFMbXk74q1ZKHGlMkJVIhIgg1FH+YEpEQJCKmGBpThRoSs5jVVNrSQUvEEENIhGiiNf9BiERICCFIRbUiDa2qvudbOetF3Tzv7XWGffa55/uS7593977n3vO7e5+199p7v56BgQGh0tcmvAUERREUQVEERREUQVEERREUQVEERREUQVEERREUQVEERREUQVEERVAUQVEERVAUQbVYk+HdvZVG8b5F0xj4RvhouB+eCy8KrdzDJc1RtAX8ILxvx98V1GyCSkN98Cx4z/95/Wn4fj6j6tUEeN4wkFSnw1MJqj5NhBfAuwaUHREUg4lqNMmePVsHll/HFhVfe1t3FwpJI8DXCCquDrCWNN4B6Tb4M3Z98aTPmTvh0YHl18PXw29yZiKejoPvcUD6E74yFBJbVDk6Bb7K8aP/Hb4c/tRzEYIqprPhSxzlf4Uvhb/0Xoig8qnHAJ3lqPMzfDH8XZ4LEpRf2sVdA5/sqPO9Qfop70UJyn+/boaPddT5yrq7VUUvTIVJI7q74MMddXR8NB1eXcYvhBpZm0s2w72/o86HFoKvLau/pYaXzjLMdUJ6y0LwtWV9CIIaXtvA8+G9HHV03u5q+K+yH47U0NoRngPv7KjzHDwTLj0bS1BDazfJJlcnOOostC6ysnCT+q80G/sIvFVgeW09D8FPVT0uoP7VfvAD8NjA8pqmuAN+OcYAjso0RbIZ8DGB5TVNcRO8JMaHY9SXSdfa3eeANJimWBLrA7JFiZwIXye+NMUV8CcxP2SRFjXefok7NRjSGZJlWUPvw2/wtNiQirSoXWyMsR28wR7AzzYM0oXw+Y7yK+CLJGeaoqjyrJSdZJD6Ov4+z5y6NJc0Az7NUecHydIUy+v60KNyQHoM3nKI1y7YCFiq0i7uBvgER52vDdKqWn9djhY1Dn4G3n6Ecqm2rF74dvgoR53S0hQxW9RJAZAGW5bSn58QJA27dQ7uIEedjywEX5NKVxCqsY6y+qA+LxFI4+yZ6oH0trWkNan80jygtIUsc5SflgAsDXgehfdx1KkkTRE76tN+Xue2jnTU0Ru1oIbvpt30bBtKhOp5yaaRkts0lic8V1i6dPcIRx2d/l8Y8XtNNEg7OOo8bl1kmmOKnDsO88CaYzejau0hWZqiL7C83oCH4SeTHvwV2BqqsHRVztSEYOmWF80NeXZT6Hd4KflResE9vCnBOlCyGfDNAstHTVPUDWoQ1t3iW+9WNizvlhfd4aerXd+ThqiMfNR6+9LvOOro5OY5JX2H4+F7HZD+kGzlamMgldWiirQsjcwWFbjmqZJteekJLK9pisvgL6RhKvuciZiwzrWWGapfrPy30kBVcSBIrw0aD3PU0XB6cehntq7rTMf7/2iQlktDVdXJLXlg6VjmiYBn6rWSTRCH6hvJ0hQrpcGq8oidsmHpTP8t8DGO9/vcWt9qabiqPgup1yKyQwvC2tSefZ73SSpNkUJ4PlLorlHZ+446nc8f3fIyywlJhwrTuwVSjBa1ccvSxN0hjjoK5xVrYZMd9V6XbFfgBukixTwGLg8sDam3dZR/wZ6L/dJlin1en8LS+bgpFbz3Ygvzu1J1HKxYNqxGpCmaCEo12rrBorD6LRp8UbpcdR5VWhTW35KlKd6QFqjuM2XzwlpnMxTvSkuUwuG/Xlg6NtPjbT6WFimF/VG6LEvXgn8QGDjMbBukVECFwhpoS+CQatfX2Q1q6H7wENHdrfCr0lKleEB9JyxNneus+VJpsVL9TwI6W65LovWIGl3KtVJaLv7LBwYTFEERFEVQFEERFEVQFEERFEVQFEERFEVQFEERFEVQFEERFFWq/hFgADUMN4RzT6/OAAAAAElFTkSuQmCC\">\n" +
            "                <p class=\"toast_content\">已留言</p>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "\n" +
            "    <div id=\"js_article\" class=\"rich_media\">\n" +
            "        \n" +
            "        <div id=\"js_top_ad_area\" class=\"top_banner\">\n" +
            " \n" +
            "        </div>\n" +
            "                \n" +
            "\n" +
            "        <div class=\"rich_media_inner\">\n" +
            "            <div id=\"page-content\">\n" +
            "                <div id=\"img-content\" class=\"rich_media_area_primary\">\n" +
            "                    <h2 class=\"rich_media_title\" id=\"activity-name\">\n" +
            "                        Android Volley核心源码解析 \n" +
            "                    </h2>\n" +
            "                    <div class=\"rich_media_meta_list\">\n" +
            "                                                <span id=\"copyright_logo\" class=\"rich_media_meta meta_original_tag\">原创</span>\n" +
            "                        \t\t\t\t\t\t                        <em id=\"post-date\" class=\"rich_media_meta rich_media_meta_text\">2016-03-25</em>\n" +
            "\n" +
            "                                                <em class=\"rich_media_meta rich_media_meta_text\">一口仨馍</em>\n" +
            "                                                <a class=\"rich_media_meta rich_media_meta_link rich_media_meta_nickname\" href=\"javascript:void(0);\" id=\"post-user\">非著名程序员</a>\n" +
            "                        <span class=\"rich_media_meta rich_media_meta_text rich_media_meta_nickname\">非著名程序员</span>\n" +
            "\n" +
            "                        <div id=\"js_profile_qrcode\" class=\"profile_container\" style=\"display:none;\">\n" +
            "                            <div class=\"profile_inner\">\n" +
            "                                <strong class=\"profile_nickname\">非著名程序员</strong>\n" +
            "                                <img class=\"profile_avatar\" id=\"js_profile_qrcode_img\" src=\"\" alt=\"\">\n" +
            "\n" +
            "                                <p class=\"profile_meta\">\n" +
            "                                <label class=\"profile_meta_label\">微信号</label>\n" +
            "                                <span class=\"profile_meta_value\">smart_android</span>\n" +
            "                                </p>\n" +
            "\n" +
            "                                <p class=\"profile_meta\">\n" +
            "                                <label class=\"profile_meta_label\">功能介绍</label>\n" +
            "                                <span class=\"profile_meta_value\">关注我（微博@涩郎），我与你闲扯技术大话，笑谈科技人生。以幽默诙谐的态度，面对乏味无聊的技术，用扯淡的方式，分享技术的内涵。谈的是技术，更是我们的人生。</span>\n" +
            "                                </p>\n" +
            "                                \n" +
            "                            </div>\n" +
            "                            <span class=\"profile_arrow_wrp\" id=\"js_profile_arrow_wrp\">\n" +
            "                                <i class=\"profile_arrow arrow_out\"></i>\n" +
            "                                <i class=\"profile_arrow arrow_in\"></i>\n" +
            "                            </span>\n" +
            "                        </div>\n" +
            "                    </div>\n" +
            "                    \n" +
            "                    \n" +
            "                    \n" +
            "                    \n" +
            "                                                            \n" +
            "                                                            \n" +
            "                    \n" +
            "                    <div class=\"rich_media_content \" id=\"js_content\">\n" +
            "                        \n" +
            "                        <p style=\"font-size: 15.5555562973022px; white-space: normal; line-height: 28.4444465637207px; text-align: center;\"><span style=\"color: rgb(17, 17, 17); font-family: Arial, Helvetica, sans-serif; font-size: 13px; white-space: pre-wrap; background-color: rgb(255, 255, 255);\">【</span><span style=\"font-size: 14px;\">回复“<span style=\"color: rgb(0, 122, 170);\">1024</span>”，送你一个特别推送</span><span style=\"color: rgb(17, 17, 17); font-family: Arial, Helvetica, sans-serif; font-size: 13px; white-space: pre-wrap; background-color: rgb(255, 255, 255);\">】</span></p><p style=\"font-size: 15.5556px; white-space: normal; line-height: 28.4444px; text-align: center;\"><span style=\"color: rgb(17, 17, 17); font-family: Arial, Helvetica, sans-serif; font-size: 13px; white-space: pre-wrap; background-color: rgb(255, 255, 255);\"></span><span style=\"font-family: 仿宋_GB2312; color: rgb(136, 136, 136); font-size: 14px;\"><img data-w=\"\" data-ratio=\"0.7428057553956835\" data-s=\"300,640\" data-type=\"jpeg\" data-src=\"http://mmbiz.qpic.cn/mmbiz/GVyeDObNlrFR0dYKefVyGkYnibBJh97EUe4ickEoFCuLCEtNHBhYHBjQnftrGUSLwaBkvS4ibibtD8eoeTrTazOlAQ/0?wx_fmt=jpeg\"  /><br  /></span></p><blockquote><p style=\"font-size: 15.5555562973022px; white-space: normal; line-height: 28.4444465637207px; text-align: left;\"><span style=\"font-family: 仿宋_GB2312; color: rgb(136, 136, 136); font-size: 14px;\">投稿作者：一口仨馍/csdn</span></p><p style=\"font-size: 15.5555562973022px; white-space: normal; line-height: 28.4444465637207px; text-align: left;\"><span style=\"font-family: 仿宋_GB2312; color: rgb(136, 136, 136); font-size: 14px;\">原文链接：</span></p><p style=\"font-size: 15.5555562973022px; white-space: normal; line-height: 28.4444465637207px; text-align: left;\"><span style=\"font-family: 仿宋_GB2312; color: rgb(136, 136, 136); font-size: 14px;\">http://blog.csdn.net/qq_17250009/article/details/50897747<br  /></span></p></blockquote><p style=\"font-size: 15.5555562973022px; white-space: normal; line-height: 28.4444465637207px; text-align: left;\"><span style=\"color: rgb(54, 54, 54);\"><strong><span style=\"font-size: 18px; font-family: 仿宋_GB2312;\"><br  /></span></strong></span></p><p style=\"font-size: 15.5555562973022px; white-space: normal; line-height: 28.4444465637207px; text-align: left;\"><strong><span style=\"font-family: 仿宋_GB2312; font-size: 18px; color: rgb(0, 0, 0);\">闲聊Volley <br  /></span></strong></p><p style=\"font-size: 15.5555562973022px; white-space: normal; line-height: 28.4444465637207px; text-align: left;\"><strong><span style=\"font-family: 仿宋_GB2312; font-size: 18px; color: rgb(0, 0, 0);\"><br  /></span></strong></p><p style=\"font-size: 15.5555562973022px; white-space: normal; line-height: 28.4444465637207px; text-align: left;\"><span style=\"color: rgb(0, 0, 0);\"><strong><span style=\"font-family: 仿宋_GB2312; font-size: 16px;\">Volley下载</span></strong></span></p><p style=\"font-size: 15.5556px; white-space: normal; text-align: left; line-height: 1.5em;\"><span style=\"font-size: 16px; color: rgb(84, 84, 84);\">Volley.jar及源码下载：http://download.csdn.net/detail/qq_17250009/9458711<br  />Volley gitHub地址：https://github.com/mcxiaoke/android-volley</span><br  /></p><p style=\"font-size: 15.5555562973022px; white-space: normal; line-height: 28.4444465637207px; text-align: left;\"><br  /></p><p style=\"font-size: 15.5556px; white-space: normal; text-align: left; line-height: 1.5em;\"><span style=\"color: rgb(0, 0, 0); font-size: 16px;\"><strong>Volley特点</strong></span><br  /><span style=\"color: rgb(84, 84, 84); font-size: 16px;\">Google I/O 2013上发布了Volley！Volley是Android平台上的网络通信库，能使网络通信更快，更简单，更健壮！<br  />名字由来：a burst or emission of many things or a large amount at once</span></p><p style=\"font-size: 15.5556px; white-space: normal; line-height: 28.4444px; text-align: center;\"><img data-w=\"448\" data-ratio=\"0.6696428571428571\" data-s=\"300,640\" data-type=\"png\" data-src=\"http://mmbiz.qpic.cn/mmbiz/GVyeDObNlrFR0dYKefVyGkYnibBJh97EUU4ialXJLDx6bdBXXx51JCvOlrIahhNxQOWql1nfftS4ZtfRd4NhibbDQ/0?wx_fmt=png\"  /><br  /></p><ol class=\" list-paddingleft-2\" style=\"list-style-type: decimal;\"><li><p style=\"font-size: 15.5555562973022px; white-space: normal; line-height: 28.4444465637207px; text-align: left;\"><span style=\"font-size: 14px; color: rgb(136, 136, 136);\">特别适合数据量小，通信频繁的网络操作。</span></p></li><li><p style=\"font-size: 15.5555562973022px; white-space: normal; line-height: 28.4444465637207px; text-align: left;\"><span style=\"font-size: 14px; color: rgb(136, 136, 136);\">扩展性强。Volley 中大多是基于接口的设计，可配置性强。</span></p></li><li><p style=\"font-size: 15.5555562973022px; white-space: normal; line-height: 28.4444465637207px; text-align: left;\"><span style=\"font-size: 14px; color: rgb(136, 136, 136);\">一定程度符合 Http 规范，包括返回 ResponseCode(2xx、3xx、4xx、5xx）的处 理,请求头的处理,缓存机制的支持等。并支持重试及优先级定义。</span></p></li><li><p style=\"font-size: 15.5555562973022px; white-space: normal; line-height: 28.4444465637207px; text-align: left;\"><span style=\"font-size: 14px; color: rgb(136, 136, 136);\">默认 Android2.3 及以上基于 HttpURLConnection,2.3 以下基于 HttpClient 实现,这两者的区别及优劣在4.2.1 Volley中具体介绍。</span></p></li><li><p style=\"font-size: 15.5555562973022px; white-space: normal; line-height: 28.4444465637207px; text-align: left;\"><span style=\"font-size: 14px; color: rgb(136, 136, 136);\">提供简便的图片加载工具。总之Volley就是很牛逼啦！</span></p></li></ol><p style=\"font-size: 15.5555562973022px; white-space: normal; line-height: 28.4444465637207px; text-align: left;\"><br  /></p><p style=\"font-size: 15.5555562973022px; white-space: normal; line-height: 28.4444465637207px; text-align: left;\"><span style=\"color: rgb(0, 0, 0); font-size: 16px;\"><strong>Volley执行流程图</strong></span><br  /><span style=\"font-size: 16px; color: rgb(84, 84, 84);\">英语好的看洋文，不行看国语。 </span><br  /></p><p style=\"font-size: 15.5556px; white-space: normal; line-height: 28.4444px; text-align: center;\"><img data-w=\"539\" data-ratio=\"0.9053803339517625\" data-s=\"300,640\" data-type=\"png\" data-src=\"http://mmbiz.qpic.cn/mmbiz/GVyeDObNlrFR0dYKefVyGkYnibBJh97EU0NqCdwxHxuTwY8rwibNSQ4BEaSNbZWZfsFd3tWiaG9VPiby4nxOQBBfGQ/0?wx_fmt=png\"  /></p><p style=\"font-size: 15.5556px; white-space: normal; line-height: 28.4444px; text-align: center;\"><img data-w=\"\" data-ratio=\"0.75\" data-s=\"300,640\" data-type=\"png\" data-src=\"http://mmbiz.qpic.cn/mmbiz/GVyeDObNlrFR0dYKefVyGkYnibBJh97EUxg49wHpibADWYR8tECBoDbrgk0f752HdeVvRO4FSPaDniap2j5khmUJA/0?wx_fmt=png\"  /><br  /></p><p style=\"font-size: 15.5555562973022px; white-space: normal; line-height: 28.4444465637207px; text-align: left;\"><br  /></p><p style=\"font-size: 15.5556px; white-space: normal; text-align: left; line-height: 1.5em;\"><span style=\"color: rgb(0, 0, 0); font-size: 16px;\"><strong>Volley中的一些概念简介</strong></span><br  /><strong><span style=\"font-size: 16px; color: rgb(54, 54, 54);\">Volley</span></strong><span style=\"color: rgb(84, 84, 84); font-size: 16px;\">：Volley 对外暴露的 API，通过 newRequestQueue(…) 函数新建并启动一个请求队列RequestQueue。<br  /><br  /><span style=\"font-size: 16px; color: rgb(54, 54, 54);\"><strong>Request</strong></span>：表示一个请求的抽象类。StringRequest、JsonRequest、ImageRequest 都是它的子类，表示某种类型的请求。<br  /><br  /><span style=\"font-size: 16px; color: rgb(54, 54, 54);\"><strong>RequestQueue</strong></span>：表示请求队列，里面包含一个CacheDispatcher(用于处理走缓存请求的调度线程)、NetworkDispatcher数组(用于处理走网络请求的调度线程，默认长度为4)，一个ResponseDelivery(返回结果分发接口)，通过 start() 函数启动时会启动CacheDispatcher和NetworkDispatcher。<br  /><br  /><span style=\"font-size: 16px; color: rgb(54, 54, 54);\"><strong>CacheDispatcher</strong></span>：一个线程，用于调度处理走缓存的请求。启动后会不断从缓存请求队列中取请求处理，队列为空则等待，请求处理结束则将结果传递给ResponseDelivery去执行后续处理。当结果未缓存过、缓存失效或缓存需要刷新的情况下，该请求都需要重新进入NetworkDispatcher去调度处理。<br  /><br  /><span style=\"font-size: 16px; color: rgb(54, 54, 54);\"><strong>NetworkDispatcher</strong></span>：一个线程，用于调度处理走网络的请求。启动后会不断从网络请求队列中取请求处理，队列为空则等待，请求处理结束则将结果传递给ResponseDelivery去执行后续处理，并判断结果是否要进行缓存。<br  /><br  /><span style=\"font-size: 16px; color: rgb(54, 54, 54);\"><strong>ResponseDelivery</strong></span>：返回结果分发接口，目前只有基于ExecutorDelivery的在入参 handler 对应线程内进行分发。<br  /><br  /><span style=\"font-size: 16px; color: rgb(54, 54, 54);\"><strong>HttpStack</strong></span>：处理 Http 请求，返回请求结果。目前 Volley 中有基于 HttpURLConnection 的HurlStack和 基于 Apache HttpClient 的HttpClientStack。<br  /><br  /><span style=\"font-size: 16px; color: rgb(54, 54, 54);\"><strong>Network</strong></span>：调用HttpStack处理请求，并将结果转换为可被ResponseDelivery处理的NetworkResponse。<br  /><br  /><span style=\"font-size: 16px; color: rgb(54, 54, 54);\"><strong>Cache</strong></span>：缓存请求结果，Volley 默认使用的是基于 sdcard 的DiskBasedCache。NetworkDispatcher得到请求结果后判断是否需要存储在 Cache，CacheDispatcher会从 Cache 中取缓存结果。</span></p><p style=\"font-size: 15.5555562973022px; white-space: normal; line-height: 28.4444465637207px; text-align: left;\"><br  /></p><p style=\"font-size: 15.5555562973022px; white-space: normal; line-height: 28.4444465637207px; text-align: left;\"><span style=\"color: rgb(0, 0, 0);\"><strong>Volley类关系图</strong></span><br  /><span style=\"color: rgb(84, 84, 84); font-size: 16px;\">其中红色框内组成了Volley的核心。 </span><br  /><span style=\"font-family: 仿宋_GB2312; font-size: 16px; color: rgb(84, 84, 84);\"></span></p><p style=\"font-size: 15.5555562973022px; white-space: normal; line-height: 28.4444465637207px; text-align: left;\"><span style=\"color: rgb(54, 54, 54);\"><strong><span style=\"font-size: 18px; font-family: 仿宋_GB2312;\"><img data-w=\"\" data-ratio=\"1.3884892086330936\" data-s=\"300,640\" data-type=\"png\" data-src=\"http://mmbiz.qpic.cn/mmbiz/GVyeDObNlrFR0dYKefVyGkYnibBJh97EURqxzibD4jMrdicVSiamr2zgNQJvuRR0eDh4qrCkDJ3LibucWXcuGUBTSIg/0?wx_fmt=png\"  /></span></strong></span></p><h2><strong>正式开始Volley之旅</strong></h2><blockquote><p><span style=\"color: rgb(136, 136, 136);\">由于微信平台对字数的限制，不能完全展示，「<strong>正式开始Volley之旅</strong>」版块代码太多，在微信平台展示太多代码也不方便观看，下面讲的有关volley的使用例子和demo。欢迎大家直接点击最下方的「<span style=\"color: rgb(0, 122, 170);\">阅读原文</span>」或直接复制「原文链接」到电脑端进行进一步学习和了解。</span><br  /></p></blockquote><p><br  /></p><p><img data-w=\"\" data-ratio=\"0.5233812949640287\" data-s=\"300,640\" data-type=\"png\" data-src=\"http://mmbiz.qpic.cn/mmbiz/GVyeDObNlrH7dtpbpAsKj9Yj2tS6Pp3XffpOgBCGiaZHg486Aj6oCcGrD0UEeQfGrf73hvQMgP7elriaIsQ2fswg/0?wx_fmt=png\"  /></p>\n" +
            "                    </div>\n" +
            "                    <script type=\"text/javascript\">\n" +
            "                        var first_sceen__time = (+new Date());\n" +
            "\n" +
            "                        if (\"\" == 1 && document.getElementById('js_content'))\n" +
            "                            document.getElementById('js_content').addEventListener(\"selectstart\",function(e){ e.preventDefault(); });\n" +
            "\n" +
            "                                        (function(){\n" +
            "                            if (navigator.userAgent.indexOf(\"WindowsWechat\") != -1){\n" +
            "                                var link = document.createElement('link');\n" +
            "                                var head = document.getElementsByTagName('head')[0];\n" +
            "                                link.rel = 'stylesheet';\n" +
            "                                link.type = 'text/css';\n" +
            "                                link.href = \"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/style/page/appmsg/page_mp_article_improve_winwx2c9cd6.css\";\n" +
            "                                head.appendChild(link);\n" +
            "                            }\n" +
            "                        })();\n" +
            "                    </script>\n" +
            "                    <link rel=\"stylesheet\" type=\"text/css\" href=\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/style/page/appmsg/page_mp_article_improve_combo2c9cd6.css\">\n" +
            "                    \n" +
            "                    \n" +
            "                                        \n" +
            "                                        <div class=\"reward_area tc\" id=\"js_reward_area\" style=\"display:none;\">\n" +
            "                                                <p class=\"tips_global reward_tips\">随心而赏，重在分享</p>\n" +
            "                                                <p>\n" +
            "                            <a class=\"reward_access\" id='js_reward_link' href=\"javascript:;\">赞赏</a>\n" +
            "                        </p>\n" +
            "                        <div id=\"js_reward_inner\" class=\"reward_area_inner\" style=\"display:none;\">\n" +
            "                            <p class=\"tips_global reward_user_tips\"><a href=\"javascript:;\" id=\"js_reward_total\"></a>人赞赏</p>\n" +
            "                            <div id=\"js_reward_list\" class=\"reward_user_list\"></div>\n" +
            "                        </div>\n" +
            "                    </div>\n" +
            "                                        \n" +
            "                                        <div class=\"rich_media_tool\" id=\"js_toobar3\">\n" +
            "                                                                    <a class=\"media_tool_meta meta_primary\" id=\"js_view_source\" href=\"javascript:void(0);\">阅读原文</a>\n" +
            "                                                <div id=\"js_read_area3\" class=\"media_tool_meta tips_global meta_primary\" style=\"display:none;\">阅读 <span id=\"readNum3\"></span></div>\n" +
            "\n" +
            "                        <span style=\"display:none;\" class=\"media_tool_meta meta_primary tips_global meta_praise\" id=\"like3\">\n" +
            "                            <i class=\"icon_praise_gray\"></i><span class=\"praise_num\" id=\"likeNum3\"></span>\n" +
            "                        </span>\n" +
            "\n" +
            "                        <a id=\"js_report_article3\" style=\"display:none;\" class=\"media_tool_meta tips_global meta_extra\" href=\"javascript:void(0);\">投诉</a>\n" +
            "\n" +
            "                    </div>\n" +
            "\n" +
            "\n" +
            "\n" +
            "                                    </div>\n" +
            "\n" +
            "                <div class=\"rich_media_area_primary sougou\" id=\"sg_tj\" style=\"display:none\">\n" +
            "\n" +
            "                </div>\n" +
            "\n" +
            "                <div class=\"rich_media_area_extra\">\n" +
            "\n" +
            "                    \n" +
            "                                        <div class=\"mpda_bottom_container\" id=\"js_bottom_ad_area\">\n" +
            "                        \n" +
            "                    </div>\n" +
            "                                        \n" +
            "                    <div id=\"js_iframetest\" style=\"display:none;\"></div>\n" +
            "                                        \n" +
            "                                        <div class=\"rich_media_extra\" id=\"js_cmt_area\" style=\"display:none\">\n" +
            "\n" +
            "                        <div class=\"discuss_container\" id=\"js_cmt_main\" style=\"display:none\">\n" +
            "                            <div class=\"rich_tips with_line title_tips discuss_title_line\">\n" +
            "                                <span class=\"tips\">精选留言</span>\n" +
            "                            </div>\n" +
            "                            <p class=\"tips_global tc title_bottom_tips\" id=\"js_cmt_nofans1\" style=\"display:none;\">关注该公众号可参与留言</p>\n" +
            "                            <p class=\"discuss_icon_tips title_bottom_tips tr\" id=\"js_cmt_addbtn1\" style=\"display:none\">\n" +
            "                                \n" +
            "                                                                <a href=\"#comment\">写留言<img class=\"icon_edit\" src=\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/images/icon/appmsg/icon_edit25ded2.png\" alt=\"\"></a>\n" +
            "                                                            </p>\n" +
            "                            <ul class=\"discuss_list\" id=\"js_cmt_list\"></ul>\n" +
            "                        </div>\n" +
            "\n" +
            "\n" +
            "                        <div class=\"tips_global rich_split_tips tc\" id=\"js_cmt_nofans2\" style=\"display:none;\">\n" +
            "                            关注该公众号可参与留言\n" +
            "                        </div>\n" +
            "\n" +
            "                        <p class=\"discuss_icon_tips rich_split_tips tr\" id=\"js_cmt_addbtn2\" style=\"display:none\">\n" +
            "                            \n" +
            "                                                        <a href=\"#comment\">写留言<img class=\"icon_edit\" src=\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/images/icon/appmsg/icon_edit25ded2.png\" alt=\"\"></a>\n" +
            "                                                    </p>\n" +
            "\n" +
            "                        <p class=\"rich_split_tips tc tips_global\" id=\"js_cmt_tips\" style=\"display:none;\"></p>\n" +
            "\n" +
            "\n" +
            "                        <div class=\"rich_tips tips_global loading_tips\" id=\"js_cmt_loading\">\n" +
            "                            <img src=\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/images/icon/common/icon_loading_white2805ea.gif\" class=\"rich_icon icon_loading_white\" alt=\"\">\n" +
            "                            <span class=\"tips\">加载中</span>\n" +
            "                        </div>\n" +
            "\n" +
            "                        <div class=\"rich_tips with_line tips_global\" id=\"js_cmt_statement\" style=\"display:none\">\n" +
            "                            <span class=\"tips\">以上留言由公众号筛选后显示</span>\n" +
            "                        </div>\n" +
            "\n" +
            "                        <p class=\"rich_split_tips tc\" id=\"js_cmt_qa\" style=\"display:none;\">\n" +
            "                            <a href=\"http://kf.qq.com/touch/sappfaq/150211YfyMVj150313qmMbyi.html?scene_id=kf264\">\n" +
            "                                了解留言功能详情\n" +
            "                            </a>\n" +
            "                        </p>\n" +
            "\n" +
            "                    </div>\n" +
            "                                    </div>\n" +
            "               \n" +
            "            </div>\n" +
            "            <div id=\"js_pc_qr_code\" class=\"qr_code_pc_outer\" style=\"display:none;\">\n" +
            "                <div class=\"qr_code_pc_inner\">\n" +
            "                    <div class=\"qr_code_pc\">\n" +
            "                        <img id=\"js_pc_qr_code_img\" class=\"qr_code_pc_img\">\n" +
            "                        <p>微信扫一扫<br>关注该公众号</p>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        </div>\n" +
            "    </div>\n" +
            "\n" +
            "\n" +
            "        \n" +
            "        <script>\n" +
            "    var __DEBUGINFO = {\n" +
            "        debug_js : \"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_wap/debug/console2ca724.js\",\n" +
            "        safe_js : \"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_wap/safe/moonsafe2c5484.js\",\n" +
            "        res_list: []\n" +
            "    };\n" +
            "</script>\n" +
            "        <script>window.moon_map = {\"appmsg/emotion/caret.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/emotion/caret278965.js\",\"biz_wap/jsapi/cardticket.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_wap/jsapi/cardticket275627.js\",\"appmsg/emotion/map.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/emotion/map278965.js\",\"appmsg/emotion/textarea.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/emotion/textarea27cdc5.js\",\"appmsg/emotion/nav.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/emotion/nav278965.js\",\"appmsg/emotion/common.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/emotion/common278965.js\",\"appmsg/emotion/slide.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/emotion/slide2a9cd9.js\",\"pages/report.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/pages/report2c9cd6.js\",\"pages/music_player.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/pages/music_player2b674b.js\",\"pages/loadscript.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/pages/loadscript2c9cd6.js\",\"appmsg/emotion/dom.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/emotion/dom278965.js\",\"biz_wap/utils/hashrouter.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_wap/utils/hashrouter2805ea.js\",\"a/gotoappdetail.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/a/gotoappdetail2a2c13.js\",\"a/ios.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/a/ios275627.js\",\"a/android.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/a/android2c5484.js\",\"a/profile.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/a/profile29b1f8.js\",\"a/card.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/a/card2c5484.js\",\"biz_wap/utils/position.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_wap/utils/position29b1f8.js\",\"appmsg/a_report.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/a_report2b6c15.js\",\"biz_common/utils/respTypes.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_common/utils/respTypes2c57d0.js\",\"appmsg/cmt_tpl.html.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/cmt_tpl.html2a2c13.js\",\"sougou/a_tpl.html.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/sougou/a_tpl.html2c6e7c.js\",\"appmsg/emotion/emotion.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/emotion/emotion2a9cd9.js\",\"biz_common/utils/report.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_common/utils/report275627.js\",\"biz_common/utils/huatuo.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_common/utils/huatuo293afc.js\",\"biz_common/utils/cookie.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_common/utils/cookie275627.js\",\"pages/voice_component.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/pages/voice_component2c5484.js\",\"new_video/ctl.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/new_video/ctl292ed8.js\",\"biz_common/utils/monitor.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_common/utils/monitor2a30ee.js\",\"biz_common/utils/spin.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_common/utils/spin275627.js\",\"biz_wap/jsapi/pay.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_wap/jsapi/pay275627.js\",\"appmsg/reward_entry.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/reward_entry2b1291.js\",\"appmsg/comment.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/comment2c5484.js\",\"appmsg/like.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/like2b5583.js\",\"appmsg/a.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/a2b6c8f.js\",\"pages/version4video.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/pages/version4video2c7543.js\",\"rt/appmsg/getappmsgext.rt.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/rt/appmsg/getappmsgext.rt2c21f6.js\",\"biz_wap/utils/storage.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_wap/utils/storage2a74ac.js\",\"biz_common/tmpl.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_common/tmpl2b3578.js\",\"appmsg/img_copyright_tpl.html.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/img_copyright_tpl.html2a2c13.js\",\"appmsg/a_tpl.html.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/a_tpl.html2c7543.js\",\"biz_common/ui/imgonepx.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_common/ui/imgonepx275627.js\",\"biz_common/dom/attr.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_common/dom/attr275627.js\",\"biz_wap/utils/ajax.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_wap/utils/ajax2c7a90.js\",\"biz_common/utils/string/html.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_common/utils/string/html29f4e9.js\",\"sougou/index.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/sougou/index2c7543.js\",\"appmsg/report.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/report2c7b4e.js\",\"biz_common/dom/class.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_common/dom/class275627.js\",\"appmsg/report_and_source.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/report_and_source2c0ff9.js\",\"appmsg/page_pos.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/page_pos2c7629.js\",\"appmsg/cdn_speed_report.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/cdn_speed_report2c57d0.js\",\"appmsg/voice.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/voice2ab8bd.js\",\"appmsg/qqmusic.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/qqmusic2ab8bd.js\",\"appmsg/iframe.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/iframe2c2c35.js\",\"appmsg/review_image.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/review_image2a5394.js\",\"appmsg/outer_link.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/outer_link275627.js\",\"biz_wap/jsapi/core.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_wap/jsapi/core2c30c1.js\",\"biz_common/dom/event.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_common/dom/event275627.js\",\"appmsg/copyright_report.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/copyright_report2c57d0.js\",\"appmsg/cache.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/cache2a74ac.js\",\"appmsg/pay_for_reading.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/pay_for_reading2c5484.js\",\"appmsg/async.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/async2ca7fa.js\",\"biz_wap/ui/lazyload_img.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_wap/ui/lazyload_img2b18f6.js\",\"biz_common/log/jserr.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_common/log/jserr2805ea.js\",\"appmsg/share.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/share2b5583.js\",\"biz_wap/utils/mmversion.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_wap/utils/mmversion275627.js\",\"appmsg/cdn_img_lib.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/cdn_img_lib275627.js\",\"biz_common/utils/url/parse.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_common/utils/url/parse275627.js\",\"biz_wap/utils/device.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_wap/utils/device2b3aae.js\",\"biz_wap/jsapi/a8key.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_wap/jsapi/a8key2a30ee.js\",\"appmsg/index.js\":\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/appmsg/index2c7629.js\"};window.moon_crossorigin = true;</script><script type=\"text/javascript\" src=\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/js/biz_wap/moon2c7b0a.js\" crossorigin></script>\n" +
            "    <script id=\"voice_tpl\" type=\"text/html\">        \n" +
            "        <span id=\"voice_main_<#=voiceid#>_<#=posIndex#>\" class=\"db audio_area <#if(!musicSupport){#> unsupport<#}#>\">\n" +
            "            <span class=\"tc tips_global unsupport_tips\" <#if(show_not_support!==true){#>style=\"display:none;\"<#}#>>\n" +
            "            当前浏览器不支持播放音乐或语音，请在微信或其他浏览器中播放            </span>\n" +
            "            <span class=\"audio_wrp db\">\n" +
            "                <span id=\"voice_play_<#=voiceid#>_<#=posIndex#>\" class=\"audio_play_area\">\n" +
            "                    <i class=\"icon_audio_default\"></i>\n" +
            "                    <i class=\"icon_audio_playing\"></i>\n" +
            "                    <img src=\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/images/icon/appmsg/audio/icon_audio_unread26f1f1.png\" alt=\"\" class=\"pic_audio_default\">\n" +
            "                </span>\n" +
            "                <span class=\"audio_length tips_global\"><#=duration_str#></span>\n" +
            "                <span class=\"db audio_info_area\">\n" +
            "                    <strong class=\"db audio_title\"><#=title#></strong>\n" +
            "                    <span class=\"audio_source tips_global\"><#if(window.nickname){#>来自<#=window.nickname#><#}#></span>\n" +
            "                </span>\n" +
            "                <span id=\"voice_progress_<#=voiceid#>_<#=posIndex#>\" class=\"progress_bar\" style=\"width:0px;\"></span>\n" +
            "            </span>\n" +
            "        </span>\n" +
            "    </script>\n" +
            "\n" +
            "    <script id=\"qqmusic_tpl\" type=\"text/html\">        \n" +
            "        <span id=\"qqmusic_main_<#=comment_id#>_<#=posIndex#>\" class=\"db qqmusic_area <#if(!musicSupport){#> unsupport<#}#>\">\n" +
            "            <span class=\"tc tips_global unsupport_tips\" <#if(show_not_support!==true){#>style=\"display:none;\"<#}#>>\n" +
            "            当前浏览器不支持播放音乐或语音，请在微信或其他浏览器中播放            </span>\n" +
            "            <span class=\"db qqmusic_wrp\">\n" +
            "                <span class=\"db qqmusic_bd\">\n" +
            "                    <span id=\"qqmusic_play_<#=musicid#>_<#=posIndex#>\" class=\"play_area\">\n" +
            "                        <i class=\"icon_qqmusic_switch\"></i>\n" +
            "                        <img src=\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/images/icon/appmsg/qqmusic/icon_qqmusic_default.2x26f1f1.png\" alt=\"\" class=\"pic_qqmusic_default\">\n" +
            "                        <img src=\"<#=music_img#>\" data-autourl=\"<#=audiourl#>\" data-musicid=\"<#=musicid#>\" class=\"qqmusic_thumb\" alt=\"\">\n" +
            "                    </span>\n" +
            "                                        <a id=\"qqmusic_home_<#=musicid#>_<#=posIndex#>\" href=\"javascript:void(0);\" class=\"access_area\">\n" +
            "                        <span class=\"qqmusic_songname\"><#=music_name#></span>\n" +
            "                        <span class=\"qqmusic_singername\"><#=singer#></span>\n" +
            "                        <span class=\"qqmusic_source\"><img src=\"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/images/icon/appmsg/qqmusic/icon_qqmusic_source263724.png\" alt=\"\"></span>\n" +
            "                    </a>\n" +
            "                </span>\n" +
            "            </span>       \n" +
            "        </span>\n" +
            "    </script>\n" +
            "  <script type=\"text/javascript\">\n" +
            "      var not_in_mm_css = \"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/style/page/appmsg/not_in_mm2c9cd6.css\";\n" +
            "      var windowwx_css = \"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/style/page/appmsg/page_mp_article_improve_winwx2c9cd6.css\";\n" +
            "      var tid = \"\";\n" +
            "      var aid = \"\";\n" +
            "      var clientversion = \"0\";\n" +
            "      var appuin = \"MjM5NDkxMTgyNw==\"||\"\";\n" +
            "\n" +
            "      var source = \"0\";\n" +
            "      var scene = 75;\n" +
            "      \n" +
            "      var itemidx = \"\";\n" +
            "\n" +
            "      var _copyright_stat = \"1\";\n" +
            "      var _ori_article_type = \"科技互联网\";\n" +
            "\n" +
            "      var nickname = \"非著名程序员\";\n" +
            "      var appmsg_type = \"9\";\n" +
            "      var ct = \"1458913269\";\n" +
            "      var publish_time = \"2016-03-25\" || \"\";\n" +
            "      var user_name = \"gh_f926f0011273\";\n" +
            "      var user_name_new = \"\";\n" +
            "      var fakeid   = \"\";\n" +
            "      var version   = \"\";\n" +
            "      var is_limit_user   = \"0\";\n" +
            "      var msg_title = \"Android&nbsp;Volley核心源码解析\";\n" +
            "      var msg_desc = \"Android&nbsp;Volley核心源码解析<br/>by&nbsp;from&nbsp;一口仨馍\";\n" +
            "      var msg_cdn_url = \"http://mmbiz.qpic.cn/mmbiz/GVyeDObNlrFR0dYKefVyGkYnibBJh97EUXMN2V0P6dnJD4FYH59jRcDPpgPjxJuM1ZdTlhPSPSicjxcBXnY8eE9g/0?wx_fmt=jpeg\";\n" +
            "      var msg_link = \"http://mp.weixin.qq.com/s?__biz=MjM5NDkxMTgyNw==&amp;mid=405358135&amp;idx=1&amp;sn=a66a7aef1f821995a45d05189d60a04a#rd\";\n" +
            "      var user_uin = \"0\"*1;\n" +
            "      var msg_source_url = 'http://blog.csdn.net/qq_17250009/article/details/50897747#rd';\n" +
            "      var img_format = 'jpeg';\n" +
            "      var srcid = '';\n" +
            "      var networkType;\n" +
            "      var appmsgid = '' || '405358135'|| \"\";\n" +
            "      var comment_id = \"4073349261\" * 1;\n" +
            "      var comment_enabled = \"\" * 1;\n" +
            "      var is_need_reward = \"1\" * 1;\n" +
            "      var is_https_res = (\"\" * 1) && (location.protocol == \"https:\");\n" +
            "\n" +
            "      var devicetype = \"\";\n" +
            "      var source_username = \"\";  \n" +
            "      var profile_ext_signature = \"\" || \"\";\n" +
            "      var reprint_ticket = \"\";\n" +
            "      var source_mid = \"\";\n" +
            "      var source_idx = \"\";\n" +
            "\n" +
            "      var show_comment = \"\";\n" +
            "      var __appmsgCgiData = {\n" +
            "            can_use_page : \"0\"*1,\n" +
            "            is_wxg_stuff_uin : \"0\"*1,\n" +
            "            card_pos : \"\",\n" +
            "            copyright_stat : \"1\",\n" +
            "            source_biz : \"\",\n" +
            "            hd_head_img : \"http://wx.qlogo.cn/mmhead/Q3auHgzwzM79G61W2RyU7ia9DOaXv5TxPvx4quUxu24BKKRM1icS6a5g/0\"||(window.location.protocol+\"//\"+window.location.host + \"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/images/pic/appmsg/pic_rumor_link.2x264e76.jpg\")\n" +
            "      };\n" +
            "      var _empty_v = \"http://res.wx.qq.com/mmbizwap/zh_CN/htmledition/images/pic/pages/voice/empty26f1f1.mp3\";\n" +
            "\n" +
            "      var copyright_stat = \"1\" * 1;\n" +
            "\n" +
            "      var pay_fee = \"\" * 1;\n" +
            "      var pay_timestamp = \"\";\n" +
            "      var need_pay = \"\" * 1;\n" +
            "\n" +
            "      var need_report_cost = \"0\" * 1;\n" +
            "      var use_tx_video_player = \"\" * 1;\n" +
            "      \n" +
            "            window.wxtoken = \"\";\n" +
            "          if(!!window.__initCatch){\n" +
            "        window.__initCatch({\n" +
            "            idkey : 27613,\n" +
            "            startKey : 0,\n" +
            "            limit : 128,\n" +
            "            reportOpt : {\n" +
            "                uin : uin,\n" +
            "                biz : biz,\n" +
            "                mid : mid,\n" +
            "                idx : idx,\n" +
            "                sn  : sn\n" +
            "            },\n" +
            "            extInfo : {\n" +
            "                network_rate : 0.01    \n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "  </script>\n" +
            "  <script type=\"text/javascript\">\n" +
            "          seajs.use('appmsg/index.js');\n" +
            "  </script>\n" +
            "\n" +
            "    </body>\n" +
            "</html>\n" +
            "\n" +
            " \n";


    public static final String strHTML2 ="<p align=\"left\">&nbsp;&nbsp; 托福考试报名官网<a href=\"http://toefl.etest.net.cn/cn/\" target=\"_blank\">http://toefl.etest.net.cn/cn/</a></p>\n" +
            "<p align=\"left\">&nbsp;</p>\n" +
            "<p align=\"left\">&nbsp; &nbsp;<font color=\"#ff0033\">第一步： 注册成为网上报名系统用户，创建个人档案。</font></p>\n" +
            "<p align=\"left\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　首次使用教育部考试中心托福网考网上报名系统，须先注册成为用户。完成这一步，您需要提供基本的个人资料有：姓名、证件号码、邮寄地址、电话号码和电子信箱地址，并为自己设置密码用来以后登录个人档案。提交所需要的资料后，教育部考试中心报名系统分配给您的一个NEEA用户(NEEA user ID) 号码。注册之前，您将看到网上报名协议，它为网上报名系统用户设定了相应的条款。您须点击&ldquo;同意&rdquo;按钮，同意遵守这些条款，否则，系统将不允许您进行注册。当成功注册成为系统用户后，系统将向您的电子邮箱发送一封确认邮件。</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　<font color=\"#ff0033\">第二步：支付考试费</font></p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;&nbsp;&nbsp; 在注册考试或预定服务前，您须先支付费用，支付成功后，才可注册或预定。我们建议您尽早计划可能要选择的服务以便随时注册或预定。</p>\n" +
            "\n" +
            "\n" +
            "<p align=\"center\" style=\"line-height: 2\"><a href=\"http://uploadfile.bailitop.com/uploadfile/1000/2.jpg\" target=\"_blank\"><img border=\"0\" src=\"http://uploadfile.bailitop.com/uploadfile/1000/1.jpg\" /></a></p>\n" +
            "\n" +
            "<p align=\"center\" style=\"line-height: 2\"><a href=\"http://uploadfile.bailitop.com/uploadfile/1000/2.jpg\" target=\"_blank\">点击变大</a></p>\n" +
            "\n" +
            "\n" +
            "<p style=\"line-height: 2\">　　<font color=\"#ff0033\">第三步：注册考试</font></p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　当&ldquo;我的主页&rdquo;显示的帐户余额已够支付托福网考服务项目时，点击&ldquo;注册考试&rdquo;，即可注册托福网考考试。</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　!请注意：</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　距考试日7天前(不含考试日)为常规报名日;距考试日前第7天至考试日第3天(不含考试日)前为逾期报名日，报名要支付逾期报名附加费，考前3天停止报名。</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　例如：考试日为8月8日，则此次考试的常规报名将在8月1日零时截止。8月1日零时至8月5日零时为逾期报名阶段，在此阶段报名须支付逾期报名附加费。8月5日零时起停止报名。</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　接下来的页面供您搜索考试地点和考试日期。请至少选择一个月份和一个地区然后点击&ldquo;继续&rdquo;，系统会根据指定的月份和地点列举所有符合条件的考场。选择某个考场点击&ldquo;注册&rdquo;按扭即可，当该考场没有安排考试或者座位已全被注册完，&ldquo;注册&rdquo;按扭就无法点击。注册完后，屏幕会显示您注册考试的详细信息，包括考试名称、考试日期和时间、考场名称和考场地址，此页面还有一个&ldquo;取消&rdquo;按纽，点击它继而点击&ldquo;继续&rdquo;就可取消您的注册。</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　确认注册考试后，下一个页面会要求您输入四个免费送分学校的信息，如您还没有这方面的信息，可暂时不填。但请注意，如您想以后再给学校送分，那么每送给一个学校您就要支付人民币136元。</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　<font color=\"#ff0033\">第四步：填写背景调查</font></p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　报名的最后一步是回答关于您个人背景信息的问题，这部分为自愿项，也可选择不填。回答完以后，系统会要求您阅读并同意托福网考考生手册中的有关考试实施、费用支付及成绩报告方面的条款和ETS关于隐私保护方面的政策。您须选择同意，这也是您注册考试要同意的一项。至此，您已完成注册一个托福网考考试需要的所有步骤，您的邮箱会收到一封邮件确认报名成功。在&ldquo;我的主页&rdquo;，点击&ldquo;查看已注册信息&rdquo;来查看您的报名状态。</p>\n";


    public static final String strHTML = "<p align=\"left\">&nbsp;&nbsp; 托福考试报名官网<a href=\"http://toefl.etest.net.cn/cn/\" target=\"_blank\">http://toefl.etest.net.cn/cn/</a></p>\n" +
            "<p align=\"left\">&nbsp;</p>\n" +
            "<p align=\"left\">&nbsp; &nbsp;<font color=\"#ff0033\">第一步： 注册成为网上报名系统用户，创建个人档案。</font></p>\n" +
            "<p align=\"left\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　首次使用教育部考试中心托福网考网上报名系统，须先注册成为用户。完成这一步，您需要提供基本的个人资料有：姓名、证件号码、邮寄地址、电话号码\n" +
            "和电子信箱地址，并为自己设置密码用来以后登录个人档案。提交所需要的资料后，教育部考试中心报名系统分配给您的一个NEEA用户(NEEA user ID) 号码。注册之前，您将看到网上报名协\n" +
            "议，它为网上报名系统用户设定了相应的条款。您须点击&ldquo;同意&rdquo;按钮，同意遵守这些条款，否则，系统将不允许您进行注册。当成功注册成为系统用户后，系统将向您的电子邮\n" +
            "箱发送一封确认邮件。</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　<font color=\"#ff0033\">第二步：支付考试费</font></p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;&nbsp;&nbsp; 在注册考试或预定服务前，您须先支付费用，支付成功后，才可注册或预定。我们建议您尽早计划可能要选择的服务以便随时注册或预定。\n" +
            "</p>\n" +
            "<p align=\"center\" style=\"line-height: 2\"><img border=\"0\" src=\"http://uploadfile.bailitop.com/uploadfile/2012/0611/20120611124332123.jpg\" /></p>\n" +
            "<p style=\"line-height: 2\">　　<font color=\"#ff0033\">第三步：注册考试</font></p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　当&ldquo;我的主页&rdquo;显示的帐户余额已够支付托福网考服务项目时，点击&ldquo;注册考试&rdquo;，即可注册托福网考考试。</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　!请注意：</p>\n" +
            "<p align=\"center\" style=\"line-height: 2\"><img border=\"0\" src=\"http://uploadfile.bailitop.com/uploadfile/2012/0611/20120611124332123.jpg\" /></p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　距考试日7天前(不含考试日)为常规报名日;距考试日前第7天至考试日第3天(不含考试日)前为逾期报名日，报名要支付逾期报名附加费，考前3天停止报名。\n" +
            "</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　例如：考试日为8月8日，则此次考试的常规报名将在8月1日零时截止。8月1日零时至8月5日零时为逾期报名阶段，在此阶段报名须支付逾期报名附加费。8月\n" +
            "5日零时起停止报名。</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　接下来的页面供您搜索考试地点和考试日期。请至少选择一个月份和一个地区然后点击&ldquo;继续&rdquo;，系统会根据指定的月份和地点列举所有符合条\n" +
            "件的考场。选择某个考场点击&ldquo;注册&rdquo;按扭即可，当该考场没有安排考试或者座位已全被注册完，&ldquo;注册&rdquo;按扭就无法点击。注册完后，屏幕会显示您注册考试的详细\n" +
            "信息，包括考试名称、考试日期和时间、考场名称和考场地址，此页面还有一个&ldquo;取消&rdquo;按纽，点击它继而点击&ldquo;继续&rdquo;就可取消您的注册。</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　确认注册考试后，下一个页面会要求您输入四个免费送分学校的信息，如您还没有这方面的信息，可暂时不填。但请注意，如您想以后再给学校送分，那么\n" +
            "每送给一个学校您就要支付人民币136元。</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　<font color=\"#ff0033\">第四步：填写背景调查</font></p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　报名的最后一步是回答关于您个人背景信息的问题，这部分为自愿项，也可选择不填。回答完以后，系统会要求您阅读并同意托福网考考生手册中的有关考\n" +
            "试实施、费用支付及成绩报告方面的条款和ETS关于隐私保护方面的政策。您须选择同意，这也是您注册考试要同意的一项。至此，您已完成注册一个托福网考考试需要的所有步骤，您的邮箱\n" +
            "会收到一封邮件确认报名成功。在&ldquo;我的主页&rdquo;，点击&ldquo;查看已注册信息&rdquo;来查看您的报名状态。</p>\n";



    public static final String strHTML1 ="<p align=\"left\">&nbsp;&nbsp; 托福考试报名官网<a href=\"http://toefl.etest.net.cn/cn/\" target=\"_blank\">http://toefl.etest.net.cn/cn/</a></p>\n" +
            "<p align=\"left\">&nbsp;</p>\n" +
            "<p align=\"left\">&nbsp; &nbsp;<font color=\"#ff0033\">第一步： 注册成为网上报名系统用户，创建个人档案。</font></p>\n" +
            "<p align=\"left\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　首次使用教育部考试中心托福网考网上报名系统，须先注册成为用户。完成这一步，您需要提供基本的个人资料有：姓名、证件号码、邮寄地址、电话号码和电子信箱地址，并为自己设置密码用来以后登录个人档案。提交所需要的资料后，教育部考试中心报名系统分配给您的一个NEEA用户(NEEA user ID) 号码。注册之前，您将看到网上报名协议，它为网上报名系统用户设定了相应的条款。您须点击&ldquo;同意&rdquo;按钮，同意遵守这些条款，否则，系统将不允许您进行注册。当成功注册成为系统用户后，系统将向您的电子邮箱发送一封确认邮件。</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　<font color=\"#ff0033\">第二步：支付考试费</font></p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;&nbsp;&nbsp; 在注册考试或预定服务前，您须先支付费用，支付成功后，才可注册或预定。我们建议您尽早计划可能要选择的服务以便随时注册或预定。</p>\n" +
            "\n" +
            "\n" +
            "<p align=\"center\" style=\"line-height: 2\"><img border=\"0\" src=\"http://uploadfile.bailitop.com/uploadfile/1000/1.jpg\" /></p>\n" +
            "\n" +
            "<p align=\"center\" style=\"line-height: 2\"><a href=\"http://uploadfile.bailitop.com/uploadfile/1000/2.jpg\" target=\"_blank\">点击变大</a></p>\n" +
            "\n" +
            "\n" +
            "<p style=\"line-height: 2\">　　<font color=\"#ff0033\">第三步：注册考试</font></p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　当&ldquo;我的主页&rdquo;显示的帐户余额已够支付托福网考服务项目时，点击&ldquo;注册考试&rdquo;，即可注册托福网考考试。</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　!请注意：</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　距考试日7天前(不含考试日)为常规报名日;距考试日前第7天至考试日第3天(不含考试日)前为逾期报名日，报名要支付逾期报名附加费，考前3天停止报名。</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　例如：考试日为8月8日，则此次考试的常规报名将在8月1日零时截止。8月1日零时至8月5日零时为逾期报名阶段，在此阶段报名须支付逾期报名附加费。8月5日零时起停止报名。</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　接下来的页面供您搜索考试地点和考试日期。请至少选择一个月份和一个地区然后点击&ldquo;继续&rdquo;，系统会根据指定的月份和地点列举所有符合条件的考场。选择某个考场点击&ldquo;注册&rdquo;按扭即可，当该考场没有安排考试或者座位已全被注册完，&ldquo;注册&rdquo;按扭就无法点击。注册完后，屏幕会显示您注册考试的详细信息，包括考试名称、考试日期和时间、考场名称和考场地址，此页面还有一个&ldquo;取消&rdquo;按纽，点击它继而点击&ldquo;继续&rdquo;就可取消您的注册。</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　确认注册考试后，下一个页面会要求您输入四个免费送分学校的信息，如您还没有这方面的信息，可暂时不填。但请注意，如您想以后再给学校送分，那么每送给一个学校您就要支付人民币136元。</p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　<font color=\"#ff0033\">第四步：填写背景调查</font></p>\n" +
            "<p style=\"line-height: 2\">&nbsp;</p>\n" +
            "<p style=\"line-height: 2\">　　报名的最后一步是回答关于您个人背景信息的问题，这部分为自愿项，也可选择不填。回答完以后，系统会要求您阅读并同意托福网考考生手册中的有关考试实施、费用支付及成绩报告方面的条款和ETS关于隐私保护方面的政策。您须选择同意，这也是您注册考试要同意的一项。至此，您已完成注册一个托福网考考试需要的所有步骤，您的邮箱会收到一封邮件确认报名成功。在&ldquo;我的主页&rdquo;，点击&ldquo;查看已注册信息&rdquo;来查看您的报名状态。</p>\n";
}
