package com.tangqi.java.builder;

/**
 * @program: designPattern
 * @description:
 * @author: tangqia@ecej.com
 * @create: 2018-05-14 15:28
 **/
public class Bottle implements Packing{

    @Override
    public String pack() {
        return "bottle";
    }
}
