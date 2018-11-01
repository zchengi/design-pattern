package com.cheng.design.pattern.structural.composite;

/**
 * 组合模式
 *
 * @author cheng
 *         2018/11/1 12:33
 */
public class Test {
    public static void main(String[] args) {

        CatalogComponent linuxCourse = new Course("Linux课程", 123D);
        CatalogComponent windowsCourse = new Course("Windows课程", 456D);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录",2);

        CatalogComponent mallCourse = new Course("Java电商1期", 200D);
        CatalogComponent mallCourse2 = new Course("Java电商2期", 300D);
        CatalogComponent designPattern = new Course("Java设计模式", 400D);

        javaCourseCatalog.add(mallCourse);
        javaCourseCatalog.add(mallCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent mainCourseCatalog = new CourseCatalog("课程主目录",1);
        mainCourseCatalog.add(linuxCourse);
        mainCourseCatalog.add(windowsCourse);
        mainCourseCatalog.add(javaCourseCatalog);

        mainCourseCatalog.print();
    }
}
