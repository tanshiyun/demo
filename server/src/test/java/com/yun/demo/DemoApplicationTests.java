package com.yun.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @BeforeAll
    static void before() {
        System.out.println("--------开始测试--------");
    }

    @AfterAll
    static void after() {
        System.out.println("--------测试结束--------");
    }

	@Test
	void contextLoads() {
	}

}
