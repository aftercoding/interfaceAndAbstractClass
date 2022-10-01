package com.sean.order;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-10-01 22:45
 */
public class WeixinPayWay extends AbstractPayWay{
    @Override
    public boolean pay() {
        System.out.println("weixin pay ok");
        return true;
    }

    @Override
    public boolean doPay() {
        return false;
    }
}
