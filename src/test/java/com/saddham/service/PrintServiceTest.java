package com.saddham.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by saddhamp on 3/5/16.
 */
public class PrintServiceTest {

    @Test
    public void testSpringTaskScheduler() throws InterruptedException {
        new ClassPathXmlApplicationContext("app-config.xml");
        Thread.sleep(180000);
    }
}