//package org.ssara;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.currentThread().join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("sara");
//                System.out.println(Thread.currentThread().getName());
//            }
//        }, "T1");
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("amir");
//                System.out.println(Thread.currentThread().getName());
//            }
//        }, "T2");
//        Thread thread3 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("amirreza");
//                try {
//                    Thread.currentThread().join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName());
//            }
//        }, "T3");
//
//
////        thread1.start();
////        thread2.start();
////        thread3.start();
//
////        thread3.interrupt();
////        System.out.println(thread3.isAlive());
////
//
////        Thread.currentThread().getName();
////        thread1.getName();
//        Thread.currentThread().setName("sara");
//        System.out.println(Thread.currentThread().getName());
//
////        throw new RuntimeException();
//
//        Thread thread4 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("alo");
//            }
//        }, "sara");
//
//        thread4.setDaemon(true);
//
//
//        System.out.println(thread4.isDaemon());
//
//
//    }
//}
