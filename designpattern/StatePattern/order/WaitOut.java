package designpattern.StatePattern.order;

/**
 * 待出库
 */
public class WaitOut implements IOrderStatus {

    public WaitOut() {
        System.out.println("当前状态::待出库");
    }


    /*
     * 退货退款
     */
    public void toRefunds(OrderContext context) {
        System.out.println("不想要了, 申请退货退款");
        context.setOrderStatus(new Refunds());
    }

    /**
     * 去发货
     * @param context
     */
    public void toSendProduct(OrderContext context) {
        System.out.println("出库完成, 待收货");
        context.setOrderStatus(new WaitReceive());
    }
}