package org.onaple.self.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class CglibLuncher {



    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Printer.class);
        enhancer.setCallback(new MyMethodInterceptor());

        Printer printer = (Printer) enhancer.create();
        System.out.println(printer.action("onaple input"));
    }
}
