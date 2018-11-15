package com.zhangchao.springboot.commandLineRunner;

import com.zhangchao.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 〈CommandLineRunner和ApplicationRunner〉
 *
 *  容器启动完成时执行run方法中内容
 *  注意添加 @Component
 *
 *  获取 application-dev.properties 中user配置的属性
 * @author 22902
 * @create 2018/11/15
 */
/*@Component
public class TestCommandLineRunner implements CommandLineRunner {
    @Autowired
    private User user;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(user.toString());
    }
}*/
@Component
public class TestCommandLineRunner implements ApplicationRunner {
    @Autowired
    private User user;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(user.toString());
    }

}
