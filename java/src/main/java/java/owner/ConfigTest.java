package java.owner;

import org.aeonbits.owner.ConfigFactory;

import java.util.Properties;

/**
 *
 * @author dz on 2018/9/1.
 */

public class ConfigTest {

    public static void main(String[] args) {
        Properties props = new Properties(); // map也可以
        props.setProperty("server.http.port", "8080");
        props.setProperty("server.host.name", "foobar.com");
        props.setProperty("server.max.threads", "100");

        ServerConfig1 config1 = ConfigFactory.create(ServerConfig1.class, props);
        System.out.println(config1.port() + "," + config1.hostname() + "," + config1.maxThreads());
    }
}
