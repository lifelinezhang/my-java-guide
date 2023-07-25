package designpattern.StatePattern.basic;

public class ConcreteStateB extends State{
    public ConcreteStateB(Context context) {
        super(context);
    }

    @Override
    void handler1() {
        System.out.println("执行ConcreteStateB中handler1的逻辑");
        this.context.setState(new ConcreteStateC(context));
    }

    @Override
    void handler2() {
        System.out.println("执行ConcreteStateB中handler2的逻辑");
        this.context.setState(new ConcreteStateA(context));
    }
}