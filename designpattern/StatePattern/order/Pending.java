package designpattern.StatePattern.order;

/**
 * 待付款
 */
public class Pending implements IOrderStatus {
    public Pending() {
        System.out.println("当前状态::待付款");

    }

    public void toPay(OrderContext context) {
        System.out.println("付款完成了, 待出库");
        context.setOrderStatus(new WaitOut());
    }

    /*
     * 取消付款
     */
    public void toCancelPay(OrderContext context) {
        System.out.println("不想要了, 要取消付款");
        context.setOrderStatus(new CancelPay());
    }

}