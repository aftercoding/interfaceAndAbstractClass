package com.sean.order;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-10-01 22:48
 */
public abstract class AbstractPayWay implements PayWay{
    private Double money;
    private boolean verify(){
        return money != null && money > 0;
    }
    @Override
    public boolean pay() {
        boolean verify = this.verify();
        if(!verify){
            System.out.println("pay error");
            return false;
        }
        return this.doPay();
    }
    public abstract boolean doPay();
}
