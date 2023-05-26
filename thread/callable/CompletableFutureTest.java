package thread.callable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<UserInfo> completableFuture = CompletableFuture.supplyAsync(() -> {
            UserInfo userInfo = new UserInfo();
            return userInfo;
        });
        UserInfo userInfo = completableFuture.get();
    }
}
