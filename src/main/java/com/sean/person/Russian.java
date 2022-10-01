package com.sean.person;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-10-01 21:46
 */
public class Russian extends Person implements Action{
    @Override
    public void playBasketball() {
        System.out.println("I can play basketball");
    }

    @Override
    void eyes() {
        System.out.println("my eye is blue");
    }

    @Override
    void skin() {
        System.out.println("my skin is white");
    }
}
