package designpattern.StatePattern.basic;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.handler1();
        context.handler1();
        context.handler1();
        context.handler1();
    }
}
