package com.cheng.design.pattern.creational.prototype;

/**
 * 原型模式
 *
 * @author cheng
 *         2018/10/29 14:19
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        Mail mail = new Mail();
        mail.setContent("初始化模版");
        System.out.println("初始化 mail：" + mail);

        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setEmailAddress("姓名" + i + "@me.com");
            mailTemp.setContent("恭喜您，此次活动中奖了");
            MailUtil.sendMain(mailTemp);
            System.out.println("克隆的 mailTemp：" + mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
