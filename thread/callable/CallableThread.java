package thread.callable;

import java.util.concurrent.Callable;

public class CallableThread implements Callable {
    int sum = 0;

    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 100; i++) {
            sum++;
        }
        return sum;
    }
}
