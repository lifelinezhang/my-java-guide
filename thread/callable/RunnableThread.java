package thread.callable;

public class RunnableThread implements Runnable {
    int sum = 0;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            sum++;
        }
    }
}
