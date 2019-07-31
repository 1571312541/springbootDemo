package com.zhangchao.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 〈〉
 *
 * @author 22902
 * @create 2019/5/21
 */
@Component
public class Test3 {

    @Autowired
    private Test2 test2;
    //在test2中PrintNumber2();是异步方法，在打印时，先打印 1111111和44444444然后才打印PrintNumber2();中的东西
    //在同一个类中使用异步无效，只能在不同类中使用
    public void PrintNumber3() {
        System.out.println(111111111);
        test2.PrintNumber2();
        System.out.println(444444444);
    }



}
