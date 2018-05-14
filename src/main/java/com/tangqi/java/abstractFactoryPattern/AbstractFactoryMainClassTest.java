package com.tangqi.java.abstractFactoryPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: designPattern
 * @description:
 * @author: tangqia@ecej.com
 * @create: 2018-05-11 14:45
 **/
public class AbstractFactoryMainClassTest {

    public static void main(String[] args) {

        AbstractFactory abstractFactory = FactoryProducer.getFactory(ColorFactory.class);
        Color color = abstractFactory.getColor(Yellow.class);
        color.showColor();
        color = abstractFactory.getColor(Red.class);
        color.showColor();
        System.out.println("/n/n");

        abstractFactory = FactoryProducer.getFactory(ShapeFactory.class);
        Shape shape = abstractFactory.getShape(Circle.class);
        shape.print();

        Map<String, Integer> map = new HashMap<>();
        map.put("1",100);
        map.put("2",50);
        map.put("3",80);
        map.put("4",70);


        Map<String, Integer> map1 = new HashMap<>();
        map1.put("1",80);
        map1.put("2",400);
        map1.put("3",20);
        map1.put("4",90);


        map.putAll(map1);
        //map.

        map.forEach((key, value)-> System.out.println(value));


    }

}
