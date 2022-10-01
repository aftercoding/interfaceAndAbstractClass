package com.sean.order;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-10-01 22:47
 */
public class ZhifubaoPayWay implements PayWay{
    @Override
    public boolean pay() {
        System.out.println("zhifubao zhifu successfully");
        return true;
    }
}
