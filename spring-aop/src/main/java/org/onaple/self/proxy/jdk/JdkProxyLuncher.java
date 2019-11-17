package org.onaple.self.proxy.jdk;

import java.lang.reflect.Proxy;

public class JdkProxyLuncher {

    public static void main(String[] args) {
        Print print = (Print) Proxy.newProxyInstance(JdkProxyLuncher.class.getClassLoader(),
                new Class<?>[]{Print.class}, new LogInvocationHandler(new PrintImpl()));
        System.out.println(print.action("onaple input"));
    }
}
