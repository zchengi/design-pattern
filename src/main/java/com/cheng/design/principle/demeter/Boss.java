package com.cheng.design.principle.demeter;

/**
 * @author cheng
 *         2018/10/24 14:43
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourses();
    }
}
