package com.tangqi.java.abstractFactoryPattern;

/**
 * @program: designPattern
 * @description:
 * @author: tangqia@ecej.com
 * @create: 2018-05-11 14:19
 **/
public class Square implements Shape {

    public String id;

    public String name;

    @Override
    public void print() {
        System.out.println("I am square");
    }
}
