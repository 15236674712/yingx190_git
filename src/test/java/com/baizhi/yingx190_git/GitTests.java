package com.baizhi.yingx190_git;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GitTests {

    @Test
    public void contextLoads() {
        System.out.println("-----");
        int a = 10;

        //dev
        int b = 20;
        int c = 20;

    }

    public static void main(String[] args) {
        System.out.println("===");
    }


    @Test()
    public void testB() {
        System.out.println("=======");
    }
    @Test()
    public void testA() {
        System.out.println("-----");
    }


}
