#include "newer_SimpleLInuxso.h"
JNIEXPORT void JNICALL Java_newer_SimpleLInuxso_hello
  (JNIEnv * env, jobject  obj) 
  {
  	printf("hello world java  native(JNI)\n");
  }
