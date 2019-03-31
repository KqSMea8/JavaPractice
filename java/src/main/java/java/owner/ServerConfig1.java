package java.owner;

import org.aeonbits.owner.Config;

public interface ServerConfig1 extends Config {

    @Key("server.http.port")
    int port();

    @Key("server.host.name")
    String hostname();

    @Key("server.max.threads")
    @DefaultValue("42")
    int maxThreads();
}