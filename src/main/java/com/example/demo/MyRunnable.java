package com.example.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyRunnable {


    public void run(String parameter) {
        // 在run()方法中使用参数
        System.out.println("子线程执行，参数为：" + parameter);
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        String parameter = "参数值";
        MyRunnable myRunnable = new MyRunnable();
    }

}