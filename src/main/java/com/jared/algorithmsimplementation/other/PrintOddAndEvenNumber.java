package com.jared.algorithmsimplementation.other;

import java.util.concurrent.locks.LockSupport;

/**
 * 两个线程交替打印奇偶数
 */
public class PrintOddAndEvenNumber {
    public static  Integer count = 0;
    public static int maxCount = 100;
    public static Object lock = new Object();

    public static void main(String[] args) {

       Thread threadOdd  = new Thread(()->{
           synchronized (lock){
               while (count < maxCount){
                   lock.notify();
                   if(count%2 == 0){
                       System.out.println("偶数" + count);
                       count ++;
                   }
                   try {
                       if(count + 1<= maxCount){
                           lock.wait();
                       }
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           }
       });
        Thread threadEven  = new Thread(()->{
            synchronized (lock){

                while (count< maxCount){
                    lock.notify();
                    if(count%2 != 0){
                        System.out.println("奇数" + count);
                        count ++;
                    }
                    try {
                        if(count + 1<= maxCount){
                            lock.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }


        });
        threadOdd.start();
        threadEven.start();
    }
}
