package com.cheng.design.pattern.behavioral.observer;

/**
 * 观察者模式
 *
 * @author cheng
 *         2018/11/14 0:02
 */
public class Test {
    public static void main(String[] args) {

        Course course = new Course("Java设计模式");
        Teacher teacher = new Teacher("wx");
        Teacher teacher2 = new Teacher("tc");

        course.addObserver(teacher);
        course.addObserver(teacher2);

        // 业务逻辑代码
        Question question = new Question();
        question.setUserName("cheng");
        question.setQuestionContent("jvm虚拟机怎么学");

        course.produceQuestion(course, question);
    }
}
