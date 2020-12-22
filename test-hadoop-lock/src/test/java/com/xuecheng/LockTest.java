package com.xuecheng;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LockTest {


    @Test
    public void deduct(){
        Deducter d = new Deducter();

        //创建线程
        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            Thread thread = new Thread(d);
            list.add(thread);
            thread.start();
        }

        //等待所有线程结束
        for (Thread t : list) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

//        打印库存是否为0
        System.out.println(d.count);


    }

    static class Deducter implements Runnable{

        volatile   int count = 100;
        Lock1 lock1 = new Lock1();




        @Override
        public  void run() {


            for (int i = 0; i < 10; i++) {

//                lock1.lock();

                count = count -1;

//                lock1.unlock();

                waitTime();
            }


        }

        public void waitTime(){
            try {
                Thread.sleep(10+new Random().nextInt(10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
