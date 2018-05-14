package com.tangqi.java.abstractFactoryPattern;

/**
 * @program: designPattern
 * @description:
 * @author: tangqia@ecej.com
 * @create: 2018-05-11 14:17
 **/
public class Circle implements Shape {

    public String name;

    public String id;

    @Override
    public void print() {

        System.out.println("I am circle");
    }

}
