package com.cheng.design.pattern.structural.adapter;

/**
 * @author cheng
 *         2018/10/31 17:43
 */
public class PowerAdapter implements DC5 {

    private AC220 ac220 = new AC220();

    @Override
    public int outputDCV() {

        int adapterInput = ac220.outputAC220V();

        // 变压器...
        int adapterOutput = adapterInput / 44;

        System.out.println("使用PowerAdapter输入AC：" + adapterInput + "V，输出DC：" + adapterOutput + "V");

        return adapterOutput;
    }
}
