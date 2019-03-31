package java.commons.Logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author dz on 2018/11/4.
 */
public class LoggingTest {
    //提供的是一个Java 的日志接口,同时兼顾轻量级和不依赖于具体的日志实现工具。
    private static Log log = LogFactory.getLog(LoggingTest.class);
    //日志打印
    public static void main(String[] args) {
        log.error("ERROR");
        log.debug("DEBUG");
        log.warn("WARN");
        log.info("INFO");
        log.trace("TRACE");
        System.out.println(log.getClass());
    }
}
