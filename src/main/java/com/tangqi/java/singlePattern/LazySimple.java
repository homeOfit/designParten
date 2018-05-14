package com.tangqi.java.singlePattern;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: designPattern
 * @description: 懒汉模式
 * @author: tangqia@ecej.com
 * @create: 2018-05-10 17:37
 **/
public class LazySimple {




    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    private static Integer nonAtomicInteger = 0;


    private static AtomicBoolean atomicBoolean = null;

    static {
        atomicBoolean = new AtomicBoolean(false);
    }


    private static boolean isCreate = false;

    private static LazySimple lazySimple = new LazySimple();




    private LazySimple(){
        System.out.println("isCreate + " + isCreate +
                "  atomicInteger=" + atomicInteger.incrementAndGet() +
                "  nonAtomicInteger=" + nonAtomicInteger++ +
                "  atomicBoolean=" + atomicBoolean.getAndSet(!atomicBoolean.get()));
         isCreate = !isCreate;
    }

    public static LazySimple getInstance() {

        return lazySimple;

    }

    @Override
    public String toString() {
        super.toString();
        System.out.println("哈哈哈哈");
        return super.toString();
    }
}
