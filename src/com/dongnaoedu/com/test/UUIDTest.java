package com.dongnaoedu.com.test;

import java.util.UUID;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-12-11 15:03
 */
public class UUIDTest {

    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString().replace("-", "").substring(0, 14));
        System.out.println("148484848484848484".length());

        System.out.println("14848484848484848x".matches("\\d{17}(\\d{1}|[X|x])"));
    }
}
