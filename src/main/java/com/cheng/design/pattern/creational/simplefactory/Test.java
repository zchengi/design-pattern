package com.cheng.design.pattern.creational.simplefactory;

/**
 * @author cheng
 *         2018/10/25 12:25
 */
public class Test {
    public static void main(String[] args) {

//        AbstractVideo video = new JavaVideo();
//        video.produce();
//        AbstractVideo video2 = new PythonVideo();
//        video2.produce();

        VideoFactory videoFactory = new VideoFactory();
        AbstractVideo video = videoFactory.getVideo("java");
        if (video == null) {
            return;
        }
        video.produce();

        AbstractVideo video2 = videoFactory.getVideo2(PythonVideo.class);
        if (video2 == null) {
            return;
        }
        video2.produce();
    }
}
