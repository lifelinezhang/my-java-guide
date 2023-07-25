package designpattern.StatePattern.order;

/**
 * 取消付款
 */
public class CancelPay implements IOrderStatus {


    /*
     * 取消付款
     */
    public void cancelPay(OrderContext context) {
        System.out.println("执行取消付款逻辑");
        context.setOrderStatus(new Finish());
    }

}