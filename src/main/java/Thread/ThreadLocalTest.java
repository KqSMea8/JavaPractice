package Thread;

/**
 * /**
 * Alipay.com Inc
 * Copyright (c) 2004-2017 All Rights Reserved.
 *
 * @author dz on 2018/9/13.
 */

public class ThreadLocalTest {

    public static void main(String[] args) {

            Thread t = new Thread() {
                ThreadLocal<String> mThreadLocal = new ThreadLocal<String>() {
                    @Override
                    protected String initialValue() {
                        return Thread.currentThread().getName();
                    }
                };

                @Override
                public void run() {
                    super.run();
                    mThreadLocal.set("droidyue.com");
                    System.out.println(mThreadLocal.get());
                }
            };

            t.start();

    }
}
