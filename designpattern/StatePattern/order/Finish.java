package designpattern.StatePattern.order;

/**
 * 订单完成
 */
public class Finish implements IOrderStatus {

    public void finish(OrderContext context) {
        System.out.println("订单完成");
    }
}