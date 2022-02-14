package com.yun.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoApplicationTests {

    @BeforeEach
    void before() {
        System.out.println("--------开始测试--------");
    }

    @AfterEach
    void after() {
        System.out.println("--------测试结束--------");
    }

	@Test
	void contextLoads() {
	}

}
