package slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * /**
 * Alipay.com Inc
 * Copyright (c) 2004-2017 All Rights Reserved.
 *
 * @author dz on 2018/9/7.
 */

public class Slf4jTest {

   private static Logger logger = LoggerFactory.getLogger(Slf4jTest.class);

    public static void main(String[] args) {

        logger.info("hello");
    }
}
