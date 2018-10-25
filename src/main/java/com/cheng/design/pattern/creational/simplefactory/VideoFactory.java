package com.cheng.design.pattern.creational.simplefactory;

/**
 * @author cheng
 *         2018/10/25 12:27
 */
public class VideoFactory {

    public AbstractVideo getVideo(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }

    public AbstractVideo getVideo2(Class c) {
        AbstractVideo video = null;
        try {
            video = (AbstractVideo) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return video;
    }
}
