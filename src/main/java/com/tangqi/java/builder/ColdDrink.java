package com.tangqi.java.builder;

/**
 * @program: designPattern
 * @description:
 * @author: tangqia@ecej.com
 * @create: 2018-05-14 15:03
 **/
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
