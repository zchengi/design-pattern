package com.cheng.design.principle.singleresponsebility;

/**
 * @author cheng
 *         2018/10/24 13:53
 */
public class Bird {

    public void mainMoveMode(String birdName) {
        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName + "用脚走");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }
    }
}
