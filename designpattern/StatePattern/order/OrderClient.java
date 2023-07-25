package designpattern.StatePattern.order;


public class OrderClient {
    public static void main(String[] args) {
        System.out.println("==========张三   开始下单==========");
        OrderContext o1 = new OrderContext();

        System.out.println("===========取消付款==============");
        o1.toCancelPay();
        o1.cancelPay();


        System.out.println("");
        System.out.println("");
        System.out.println("==========李四    开始下单  收货后退款==========");
        OrderContext o2 = new OrderContext();

        System.out.println("===========付款==============");
        o2.toPay();

        System.out.println("===========发货==============");
        o2.toSendProduct();
        System.out.println("===========收获==============");
        o2.toReceiveProduct();
        System.out.println("===========退货==============");
        o2.toRefunds();
        o2.refunded();
        System.out.println("===========完成==============");
        o2.finish();


        System.out.println();
        System.out.println();
        System.out.println("==========王五    开始下单走完全流程==========");
        OrderContext o3 = new OrderContext();

        System.out.println("===========付款==============");
        o3.toPay();

        System.out.println("===========出库==============");
        o3.toSendProduct();

        System.out.println("===========收货==============");
        o3.toReceiveProduct();

        System.out.println("===========确认收货==============");
        o3.toConfirmReceived();

        System.out.println("===========订单评价==============");
        o3.toOrderEvaluation();

        System.out.println("===========订单完成==============");
        o3.finish();

    }
}