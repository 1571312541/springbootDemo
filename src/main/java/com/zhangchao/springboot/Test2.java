package com.zhangchao.springboot;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 〈〉
 *
 * @author 22902
 * @create 2019/5/21
 */
@Component
public class Test2 {

    @Async
    public void PrintNumber2() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 1; i < 100; i++) {
            System.out.println("------------------");
        }
    }
}
