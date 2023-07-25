package designpattern.StatePattern.basic;

/**
 * 状态抽象类
 */
public abstract class State {

    /**
     * 环境上下文
     */
    public Context context;

    public State(Context context) {
        this.context = context;
    }

    /**
     * 定义了所有状态的抽象方法
     */
    abstract void handler1();

    abstract void handler2();
}