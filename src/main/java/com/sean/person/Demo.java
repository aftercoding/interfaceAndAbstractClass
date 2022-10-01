package com.sean.person;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-10-01 21:48
 */
public class Demo {
    public static void main(String[] args) {
        Person a = new Chinese();
        a.eyes();
        a.skin();

        Russian b = new Russian();
        b.eyes();
        b.skin();
        b.playBasketball();
    }
}
