package designpattern.StatePattern.basic;

public class Context {
    // 在环境类中维护一个抽象状态State的实例, 这个实例存储当前状态。
    private State state;

    public Context() {
        this.state = new ConcreteStateA(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 在环境类中定义所有状态执行的方法.
     */
    public void handler1() {

        this.state.handler1();
    }

    public void handler2() {
        this.state.handler2();
    }

}
