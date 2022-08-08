//package org.ssara;
//
//import org.ssara.sample.ThreadImplMul;
//import org.ssara.sample.ThreadImplSum;
//
//import java.util.Scanner;
//
//public class Ex {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("row1 : ");
//        Integer row1 = scanner.nextInt();
//        System.out.println("column1 : ");
//        Integer column1 = scanner.nextInt();
//
//        System.out.println("row2 : ");
//        Integer row2 = scanner.nextInt();
//        System.out.println("column2 : ");
//        Integer column2 = scanner.nextInt();
//
//        if (column2.equals(row2)) {
//            Integer[][] matrix1 = new Integer[row1][column1];
//            Integer[][] matrix2 = new Integer[row2][column2];
//            Integer[][] result = new Integer[row1][column2];
//
//            System.out.println("matrix1 : ");
//            for (int i = 0; i < row1; i++) {
//                for (int j = 0; j < column2; j++) {
//                    matrix1[i][j] = scanner.nextInt();
//                }
//            }
//            System.out.println("matrix2 : ");
//            for (int i = 0; i < row2; i++) {
//                for (int j = 0; j < column2; j++) {
//                    matrix2[i][j] = scanner.nextInt();
//                }
//            }
//
//
//            Integer sum = new Integer(0);
//            for (int i = 0; i < row1; i++) {
//                for (int j = 0; j < column2; j++) {
//                    for (int k = 0; k < row2; k++) {
//                        ThreadImplMul threadImplMul = new ThreadImplMul(matrix1[i][k] , matrix2[k][j]);
//                        threadImplMul.start();
////                        try {
////                            threadImplMul.join();
////                        } catch (InterruptedException e) {
////                            e.printStackTrace();
////                        }
//                        ThreadImplSum threadImplSum = new ThreadImplSum(threadImplMul.getMultiplication(),sum);
//                        threadImplSum.start();
//
//                        try {
//                            threadImplSum.join();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//
//
//                        try {
//                            Thread.sleep(1000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        sum=threadImplSum.getSum();
//                        //sum = sum + (matrix1[i][k] * matrix2[k][j]);
//
//                    }
//                    result[i][j] = sum;
//                    sum = 0;
//                }
//            }
//
//
//
//
//
//            for (int i = 0; i < row1; i++) {
//                for (int j = 0; j < column2; j++) {
//                    System.out.println(result[i][j]);
//                }
//            }
//        } else {
//            System.out.println("oops!!!");
//        }
//
//
//
//    }
//}
