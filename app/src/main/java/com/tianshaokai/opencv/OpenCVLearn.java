package com.tianshaokai.opencv;

public class OpenCVLearn {
    static {
        System.loadLibrary("opencv_learn");
    }

    //变灰处理
    public native int[] gray(int[] buf, int w, int h);
}
