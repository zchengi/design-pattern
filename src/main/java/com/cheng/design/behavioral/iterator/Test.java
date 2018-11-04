package com.cheng.design.behavioral.iterator;

/**
 * 迭代器模式
 *
 * @author cheng
 *         2018/11/4 15:51
 */
public class Test {
    public static void main(String[] args) {

        Course course0 = new Course("课程0");
        Course course1 = new Course("课程1");
        Course course2 = new Course("课程2");
        Course course3 = new Course("课程3");
        Course course4 = new Course("课程4");
        Course course5 = new Course("课程5");

        CourseAggregate courseAggregate = new CourseAggregateImpl();

        courseAggregate.addCourse(course0);
        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);

        System.out.println("---------- 课程列表 ---------");
        printCourses(courseAggregate);

        courseAggregate.removeCourse(course1);
        courseAggregate.removeCourse(course5);

        System.out.println("----- 删除操作之后的课程 -----");
        printCourses(courseAggregate);

    }

    private static void printCourses(CourseAggregate courseAggregate) {

        CourseIterator courseIterator = courseAggregate.getCourseIterator();
        while (!courseIterator.isLastCourse()) {
            Course course = courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }
}
