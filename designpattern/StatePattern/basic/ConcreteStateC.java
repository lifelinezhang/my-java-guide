package designpattern.StatePattern.basic;

public class ConcreteStateC extends State{
    public ConcreteStateC(Context context) {
        super(context);
    }

    @Override
    void handler1() {
        System.out.println("执行ConcreteStateC中handler1的逻辑");
        this.context.setState(new ConcreteStateA(context));
    }

    @Override
    void handler2() {
        System.out.println("执行ConcreteStateC中handler2的逻辑");
        this.context.setState(new ConcreteStateB(context));
    }
}

