package designpattern.StatePattern.basic;

public class ConcreteStateA extends State {

    public ConcreteStateA(Context context) {
        super(context);
    }

    @Override
    void handler1() {
        System.out.println("执行ConcreteStateA中handler1的逻辑");
        this.context.setState(new ConcreteStateB(context));
    }

    @Override
    void handler2() {
        System.out.println("执行ConcreteStateA中handler2的逻辑");
        this.context.setState(new ConcreteStateC(context));
    }
}