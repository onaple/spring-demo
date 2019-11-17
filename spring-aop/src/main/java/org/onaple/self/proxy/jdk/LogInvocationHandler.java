package org.onaple.self.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LogInvocationHandler implements InvocationHandler {


    private static final Logger LOGGER = LoggerFactory.getLogger(LogInvocationHandler.class);

    private Print print;

    public LogInvocationHandler(Print print) {
        this.print = print;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("action".equals(method.getName())) {
            LOGGER.info("LogInvocationHandler.invoke print " + Arrays.toString(args));
        }
        return method.invoke(print, args);
    }
}
