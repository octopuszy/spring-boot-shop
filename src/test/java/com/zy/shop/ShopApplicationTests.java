package com.zy.shop;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class ShopApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void printLog(){
        String a = "hello";
        log.info("test {}", a);
    }

}
