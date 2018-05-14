package com.tangqi.java.factoryPattern;

/**
 * @program: designPattern
 * @description:
 * @author: tangqia@ecej.com
 * @create: 2018-05-11 14:22
 **/
public class FactoryPatternMainClassTest {


    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape square =  shapeFactory.getShape(Square.class);
        Shape circle =  shapeFactory.getShape(Circle.class);
        square.print();
        circle.print();

    }

}
