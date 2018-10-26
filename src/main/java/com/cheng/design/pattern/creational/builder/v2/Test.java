package com.cheng.design.pattern.creational.builder.v2;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

/**
 * 建造者模式演进版：链式调用
 *
 * @author cheng
 *         2018/10/26 12:15
 */
public class Test {
    public static void main(String[] args) {

        Course course = new Course.CourseBuilder()
                .buildCourseName("Python课程")
                .buildCoursePPT("Python课程PPT")
//                .buildCourseVideo("Python课程视频")
                .buildCourseArticle("Python课程手记")
//                .buildCourseQA("Python课程问答")
                .build();


        // 建造者示例
        System.out.println(course);
        Set<String> set = ImmutableSet.<String>builder()
                .add("A")
                .add("B").build();
        System.out.println(set);
    }
}
