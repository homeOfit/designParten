package com.tangqi.java.singlePattern;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import sun.java2d.loops.GraphicsPrimitive;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: designPattern
 * @description:
 * @author: tangqia@ecej.com
 * @create: 2018-05-10 18:32
 **/
public class AA {

    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    private static AtomicBoolean atomicBoolean = new AtomicBoolean(false);

    private static boolean nonAutomicBoolean = false;

    private long timeStamp;

    public AA(long timeStamp) {
        System.out.println(timeStamp + "   " + atomicInteger.incrementAndGet() +
                "  atomicBoolean= " + atomicBoolean.getAndSet(!atomicBoolean.get()) + "  nonAutomicBoolean=" + nonAutomicBoolean );

        //atomicBoolean.set(!atomicBoolean.get());

        nonAutomicBoolean = !nonAutomicBoolean;

//        if (atomicInteger.get() != 0) {
//            System.out.println("value = " + atomicInteger.incrementAndGet());
//            try {
//                throw new Exception("ccc");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else {
//            atomicInteger.incrementAndGet();
//        }
    }

    public static void main(String[] args) {

//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        for (int i = 0; i < 10; i++) {
//            executorService.execute(new Runnable() {
//                @Override
//                public void run() {
//                    AA aa = new AA(System.currentTimeMillis());
//                }
//            });
//        }
//
//        executorService.shutdown();
        for (int i = 0; i < 10; i++) {
            AA aa = new AA(System.currentTimeMillis());

        }
    }

}
