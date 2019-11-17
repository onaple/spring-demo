package org.onaple.self.proxy.cglib;

import java.lang.reflect.Method;
import java.util.Arrays;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.onaple.self.proxy.jdk.LogInvocationHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class MyMethodInterceptor implements MethodInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogInvocationHandler.class);

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        LOGGER.info("MyMethodInterceptor intercept: " + Arrays.toString(args));
        return proxy.invokeSuper(obj, args);
    }
}