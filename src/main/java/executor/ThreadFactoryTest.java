package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * /**
 * Alipay.com Inc
 * Copyright (c) 2004-2017 All Rights Reserved.
 *
 * @author dz on 2018/9/1.
 */

public class ThreadFactoryTest {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool(new ThreadFactory() {

            final AtomicInteger threadNumber = new AtomicInteger(1);

            public Thread newThread(Runnable runnable) {
                // Use our own naming scheme for the threads.
                Thread thread = new Thread(Thread.currentThread().getThreadGroup(), runnable,
                        "pool-spark" + threadNumber.getAndIncrement(), 0); //这里实现命名
                // Make workers daemon threads.
                thread.setDaemon(true);
                if (thread.getPriority() != Thread.NORM_PRIORITY) {
                    thread.setPriority(Thread.NORM_PRIORITY);
                }
                return thread;
            }
        });

    }
}
