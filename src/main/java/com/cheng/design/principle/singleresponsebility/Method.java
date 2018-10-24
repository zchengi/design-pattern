package com.cheng.design.principle.singleresponsebility;

/**
 * @author cheng
 *         2018/10/24 14:23
 */
public class Method {

    private void updateUserInfo(String userName, String address) {
        userName = "cheng";
        address = "hangzhou";
    }

    private void updateUserInfo(String userName, String... properties) {
        userName = "cheng";
//        address = "hangzhou";
    }

    private void updateUserName(String userName, String address) {
        userName = "cheng";
    }

    private void updateUserAddress(String userName, String address) {
        address = "hangzhou";
    }

    private void updateUserInfo(String userName, String address, boolean bool) {
        if (bool) {
            // todo something1
        } else {
            // todo something2
        }

        userName = "cheng";
        address = "hangzhou";
    }


}