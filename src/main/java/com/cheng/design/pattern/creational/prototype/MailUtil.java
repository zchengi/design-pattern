package com.cheng.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @author cheng
 *         2018/10/29 14:16
 */
public class MailUtil {

    public static void sendMain(Mail mail) {

        String outputContent = "向{0}同学，邮件地址：{1}，邮件内容：{2}发送邮件成功";
        System.out.println(
                MessageFormat.format(outputContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("存储 originMail记录，OriginMail：" + mail.getContent());
    }
}
