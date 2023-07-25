package designpattern.StatePattern.order;

/**
 * 待收货
 */
public class WaitReceive implements IOrderStatus {

    public WaitReceive() {
        System.out.println("当前状态 :: 待收货");
    }

    /*
     * 退货退款
     */
    public void refunds(OrderContext context) {
        System.out.println("申请退货");
        context.setOrderStatus(new Refunds());
    }

    /**
     * 去收获
     * @param context
     */
    public void toReceiveProduct(OrderContext context) {
        System.out.println("执行收货逻辑, 完成收货操作");
        context.setOrderStatus(new Confirm());

    }
}