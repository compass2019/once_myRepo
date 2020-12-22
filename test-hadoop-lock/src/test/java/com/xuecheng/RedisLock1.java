package com.xuecheng;


public class RedisLock1 {

    public final String lockKey= "lock_";

//    public void lock(){
//
//        while (true){
//            Jedis jedis = new Jedis();
//            if(!jedis.exists(lockKey)){
//
//                String result = jedis.set(lockKey, "true");
//
//
//                if ("OK".equals(result)){
//                    break;
//                }
//
//            }
//
//            jedis.close();
////            waitFor(100);
//
//        }
//    }
//
//    public void unlock() {
//
//        Jedis jedis = new Jedis();
//        jedis.del(lockKey);
//        jedis.close();
//    }
}
