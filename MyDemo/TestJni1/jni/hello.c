#include <jni.h>
JNIEXPORT jstring JNICALL Java_com_example_testjni1_MainActivity_hellc
  (JNIEnv * env, jobject obj){
	char* cstr = "hello from c zp";
	return (*env)->NewStringUTF(env,cstr);
}
