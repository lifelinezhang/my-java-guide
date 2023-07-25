package designpattern.StatePattern.order;

/**
 * 订单评价
 */
public class OrderEvaluation implements IOrderStatus {

    public OrderEvaluation() {
        System.out.println("当前状态 :: 订单待评价");
    }

    public void toOrderEvaluation(OrderContext context) {
        System.out.println("订单评价完了");
        context.setOrderStatus(new Finish());
    }
}