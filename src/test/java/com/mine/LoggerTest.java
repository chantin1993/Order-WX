package com.mine;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * Created by
 * 2017-06-02 17:44
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
//@Data
public class LoggerTest {

    @Test
    public void test1() {
        String name = "admin";
        String password = "admin";
//        log.debug("debug...");
//        log.info("name: " + name + " ,password: " + password);
//        log.info("name: {}, password: {}", name, password);
//        log.error("error...");
//        log.warn("warn...");
    }
}
