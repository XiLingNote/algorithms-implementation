package com.jared.algorithmsimplementation.other;

/**
 * 两个线程交替打印奇偶数
 */
public class PrintOddAndEvenNumber_1 {

    public static void main(String[] args) {
        PrintNum printNum = new PrintNum();
        Thread t1 = new Thread(printNum);
        t1.setName("奇数");
        Thread t2 = new Thread(printNum);
        t2.setName("偶数");
        t1.start();
        t2.start();
    }

    public static class PrintNum implements Runnable {
        int count = 0;
        int maxCount = 100;

        @Override
        public void run() {
            synchronized (this) {
                while (count < maxCount) {
                    notify();
                    System.out.println(Thread.currentThread().getName() + count);
                    count++;
                    try {
                        if (count + 1 < maxCount) {
                            wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


            }
        }
    }
}
