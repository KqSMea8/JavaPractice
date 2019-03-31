package java.thrift.impl;

import org.apache.commons.lang3.StringUtils;
import org.apache.thrift.TException;
import thrift.HelloWordService;
import thrift.Request;
import thrift.RequestException;
import thrift.RequestType;

import java.util.Date;


public class HelloWordServiceImpl implements HelloWordService.Iface {
    // 实现这个方法完成具体的逻辑。
    public String doAction(Request request) throws RequestException, TException {
        System.out.println("Get request: " + request);
        if (StringUtils.isBlank(request.getName()) || request.getType() == null) {
            throw new RequestException();
        }
        String result = "Hello, " + request.getName();
        if (request.getType() == RequestType.SAY_HELLO) {
            result += ", Welcome!";
        } else {
            result += ", Now is " + new Date().toLocaleString();
        }
        return result;
    }
}


