package com.example.demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Test {

    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();
        Random random = new Random();

        // 模拟按下和释放 F15 键
        int key = KeyEvent.VK_F15;
        System.out.println(System.currentTimeMillis());
        Long start = System.currentTimeMillis();
        while (true) {
            robot.keyPress(key);
            robot.keyRelease(key);

            // 生成随机等待时间（3到5分钟之间）
            int waitTime = random.nextInt(3 * 60 * 1000)+180000;

            // 休眠随机等待时间
            Thread.sleep(waitTime);
            Long diff = (System.currentTimeMillis() - start)/1000/60;
            System.out.println("test: "+diff+" minutes");
        }
    }
}
