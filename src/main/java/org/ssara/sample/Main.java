//package org.ssara.sample;
//
//public class Main {
//    public static void main(String[] args) {
//        ThreadImplSum thread = new ThreadImplSum(12,14);
//        ThreadImplSum thread1 = new ThreadImplSum(12,16);
//
//        thread.start();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(thread.getSum());//26
//        thread1.start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(thread1.getSum());//28
//
//    }
//}
