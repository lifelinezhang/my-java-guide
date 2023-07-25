package designpattern.StatePattern.order;

public class Confirm implements IOrderStatus {

    public Confirm() {
        System.out.println("当前状态 :: 确认收货");
    }

    public void toRefunds(OrderContext context) {
        System.out.println("不想要了, 想退款");
        context.setOrderStatus(new Refunds());
    }


    public void toConfirmReceived(OrderContext context) {
        System.out.println("执行确认收货逻辑");
        context.setOrderStatus(new OrderEvaluation());
    }
}