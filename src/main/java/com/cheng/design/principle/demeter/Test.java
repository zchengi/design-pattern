package com.cheng.design.principle.demeter;

/**
 * @author cheng
 *         2018/10/24 14:43
 */
public class Test {
    public static void main(String[] args) {

        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
