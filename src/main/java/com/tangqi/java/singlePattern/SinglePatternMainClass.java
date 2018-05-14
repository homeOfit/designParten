package com.tangqi.java.singlePattern;

import sun.misc.ClassLoaderUtil;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @program: designPattern
 * @description:
 * @author: tangqia@ecej.com
 * @create: 2018-05-10 17:39
 **/
public class SinglePatternMainClass {

    public static void main(String[] args) {

        LazySimple lazySimple = LazySimple.getInstance();
        lazySimple.toString();

        try {
            LazySimple lazySimple2 = null;
            Constructor<LazySimple> constructor = LazySimple.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            lazySimple2 = constructor.newInstance();
            lazySimple2.toString();
           // System.out.println(lazySimple == lazySimple2);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //testAA();

    }

    public static void testAA() {
        for (int i = 0; i < 10; i++) {
            AA aa = new AA(System.currentTimeMillis());
        }
    }

}
