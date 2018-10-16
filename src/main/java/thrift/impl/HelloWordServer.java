package thrift.impl;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import thrift.HelloWordService;

import java.net.ServerSocket;


public class HelloWordServer {
    public static void main(String[] args) throws Exception {
        ServerSocket socket = new ServerSocket(7912);
        TServerSocket serverTransport = new TServerSocket(socket);
        HelloWordService.Processor processor = new HelloWordService.Processor(new HelloWordServiceImpl());
        TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));
        System.out.println("Running server...");
        server.serve();
    }
}

