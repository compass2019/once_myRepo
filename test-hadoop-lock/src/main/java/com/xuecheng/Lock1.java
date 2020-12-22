package com.xuecheng;

import java.util.concurrent.atomic.AtomicBoolean;

public class Lock1 {

    AtomicBoolean isLock = new AtomicBoolean();


    public void lock() {
        while (true) {
//        CAS操作，原子操作
            boolean isOk = isLock.compareAndSet(false, true);



            if (isOk) {
                break;
            }
        //等待一会，重试
        //            waitFor();
        }
    }

//解锁
    public void unlock() {
        isLock.set(false);
    }


}
