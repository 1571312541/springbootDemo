package com.zhangchao.springboot.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 〈定时任务〉
 *
 * @author 22902
 * @create 2018/11/13
 */
@Component
public class SchedulerTask {

    private AtomicInteger num = new AtomicInteger(0);
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM--dd HH:mm:ss");

    /**
     * corn表达式 6s一次
     */
    @Scheduled(cron = "*/6 * * * * ?")
    private void countNum(){
        System.out.println("定时任务触发次数 "+num.getAndIncrement());
    }
    /**
     *  6s一次
     */
    @Scheduled(fixedRate = 6000)
    private void currentTime(){
        System.out.println("定时任务当前时间： "+format.format(new Date()));
    }

}
