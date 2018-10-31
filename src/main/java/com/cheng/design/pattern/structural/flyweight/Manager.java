package com.cheng.design.pattern.structural.flyweight;

/**
 * @author cheng
 *         2018/10/31 18:11
 */
public class Manager implements Employee {

    /**
     * 内部状态
     */
    private String title = "部门经理";
    /**
     * 外部状态
     */
    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
