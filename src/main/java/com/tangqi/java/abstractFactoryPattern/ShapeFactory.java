package com.tangqi.java.abstractFactoryPattern;

/**
 * @program: designPattern
 * @description:
 * @author: tangqia@ecej.com
 * @create: 2018-05-11 14:20
 **/
public class ShapeFactory extends AbstractFactory{

    @Override
    public <T extends Shape> Shape getShape(Class<T> tClass) {
        try {
            return tClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public <T extends Color> Color getColor(Class<T> tClass) {
        return null;
    }
}
