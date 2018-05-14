package com.tangqi.java.builder;

/**
 * @program: designPattern
 * @description:
 * @author: tangqia@ecej.com
 * @create: 2018-05-14 15:01
 **/
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }


    public abstract float price();


}
