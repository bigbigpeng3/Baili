# Eclipse上Jni的基本操作。 #

---

### 使用IDE一键创建JNI ###

1. 下载好NDK
 `NDK：native developement kit：开发jni必备，就是模拟其他平台特性来编译代码的工具`。
在windows-> Preferences-> Android -> NDK Location 中确认NDK的路径正确指向了NDK。
2. 新建一个Android工程，鼠标右键该工程-> Android Tools -> Add Native Support。完成后在工程目录下会多出一个jni目录。（这个目录不能被删除。删除后会报错，这个时候，你就只能重新新建另一个项目了）
3. 为了让你的APP能在ARM，X86平台上运行，需要在jni目录下新建一个Application.mk 文件。文件中加入：
	* 这行代码可以让你的c/c++ 语言运行在任何平台
APP_ABI:= all 
	* //这行代码可以让你的c/c++  语言运行在 arm x86平台上（一般使用这行）
APP_ABI: armeabi armeabi-v7a x86

4. 给工程中添加代码。
	* 在布局文件中添加一个Button
	* 在MainActivity中给这个Button添加点击事件。
	* public native String hellc();//声明方法
	* 在点击监听的方法中，这里我就使用一个Toast让它显示一下c代码中的数据。
5. **重要步骤**
>1. 将Android.mk中的LOCAL_SRC_FILES := hello.cpp改成
> LOCAL_SRC_FILES := hello.c
>2. 由于我声明的本地方法在MainActivity里面。选中MainActivity.java 点击左边的三角箭头，出现一个绿色的MainActivity，右键选中并点击Copy Qulified Name。
>3. 找到项目src目录，进入src，Shift + 鼠标右键。在此处打开命令窗口。
>输入 javah + 右键选中粘贴。 回车。这个时候该目录下多出了一个c头文件。使用记事本打开它。
>复制类似这样的代码

     JNIEXPORT jstring JNICALL Java_com_example_testjni1_MainActivity_hellc
     (JNIEnv *, jobject)
> 复制到jni中的c文件中。
> 修改成

    JNIEXPORT jstring JNICALL Java_com_example_testjni_MainActivity_helloC
      (JNIEnv * env, jobject obj){
    char* cstr = "hello from c zp";
    return (*env)->NewStringUTF(env,cstr);
    }

6. 生成so类库

	>1. 程序运行的时候会自动生成对应的类库，这里为了保险起见，我就先不添加static静态代码块了，等它生成好后再去调用。
	>2. 我这里生成的armeabi文件中的 libhello.so 
	>3. 在MainActivity中添加
	
	    static {
    		System.loadLibrary("hello");
    	}
7. 运行成功。

**这样就完成了Android中调用c中的方法了。**
效果图：
![gif](https://github.com/you-big-big/MyDemo/blob/master/TestJni1/gif/jniDemo.gif)
---


## 还可以把c代码装换成为c++代码。 ##

过程就简便一些了。

1. 将C文件后缀改名成CPP
2. 在Android.mk中将LOCAL_SRC_FILES := hello.c 改名为 hello.cpp
3.  c++的使用的环境变量结构中，访问了c使用的结构体的函数指针，函数名全部都是一样的，只是参数去掉了结构体指针
4.  访问函数指针时，把env前面的*号去掉，因为此时env已经是一级指针
5.  Project 中的clean清除之前编译的残留文件
6.  将之前c用的javah生成的文件剪切到jni文件里。然后在Cpp文件中include。就能运行了


	
zp 
于2015/11月。
如有问题请联系我 [bigbigpeng3@gmail.com](bigbigpeng3@gmail.com "bigbigpeng3@gmail.com")