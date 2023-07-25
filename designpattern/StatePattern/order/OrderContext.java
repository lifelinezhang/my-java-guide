package designpattern.StatePattern.order;

/**
 * 订单上下文
 */
public class OrderContext {

    /**在上下文类中记录订单状态*/
    private IOrderStatus orderStatus;

    public OrderContext() {
        System.out.println("开始购物");
        // 最开始是待付款状态
        this.orderStatus = new Pending();
    }

    public void setOrderStatus(IOrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }


    /**
     * 去付款
     */
    public void toPay() {
        ((Pending)this.orderStatus).toPay(this);
    }

    /**
     * 取消付款
     */
    public void toCancelPay() {
        ((Pending)this.orderStatus).toCancelPay(this);
    }

    /**
     * 取消付款
     */
    public void cancelPay() {
        ((CancelPay)this.orderStatus).cancelPay(this);
    }

    /**
     * 去发货
     */
    public void toSendProduct() {
        ((WaitOut)this.orderStatus).toSendProduct(this);
    }

    /**
     * 申请退款
     */
    public void toRefunds() {
        ((Confirm)this.orderStatus).toRefunds(this);
    }

    /**
     * 已退款
     */
    public void refunded() {
        ((Refunds)this.orderStatus).refunded(this);
    }

    public void toReceiveProduct() {
        ((WaitReceive)this.orderStatus).toReceiveProduct(this);
    }

    /**
     * 点击确认收货按钮
     */
    public void toConfirmReceived() {
        ((Confirm)this.orderStatus).toConfirmReceived(this);
    }

    /**
     * 去评价订单
     */
    public void toOrderEvaluation() {
        ((OrderEvaluation)this.orderStatus).toOrderEvaluation(this);
    }

    /**
     * 已完成
     */
    public void finish() {
        ((Finish)this.orderStatus).finish(this);
    }
}