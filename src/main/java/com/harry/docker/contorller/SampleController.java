package com.harry.docker.contorller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * This is Description
 *
 * @author: wangruirui
 * @date: 2018/08/06
 */


@Controller
@EnableAutoConfiguration
public class SampleController {

    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @RequestMapping("/")
    @ResponseBody
    String home() {
        logger.info("Hello World!");
        new Thread(() -> {
            System.out.println("hello world");
            logger.info("kakka");
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(" hello");
            }
        }).start();

        return "Hello World!";
    }

}
