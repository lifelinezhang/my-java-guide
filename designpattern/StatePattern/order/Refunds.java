package designpattern.StatePattern.order;

public class Refunds implements IOrderStatus {

    public Refunds() {
        System.out.println("当前状态 :: 退货退款");
    }


    public void refunded(OrderContext context) {
        System.out.println("完成退款");
        context.setOrderStatus(new Finish());
    }
}