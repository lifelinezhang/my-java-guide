package thread.callable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CompletableFutureTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<UserInfo> completableFuture = CompletableFuture.supplyAsync(() -> {
            UserInfo userInfo = new UserInfo();
            return userInfo;
        });
        UserInfo userInfo = completableFuture.get();
    }

    public static void test() {
        CallableThread callableThread = new CallableThread();
        FutureTask<Object> futureTask = new FutureTask<>(callableThread);
        Thread thread = new Thread(futureTask);
        thread.start();
    }

}
