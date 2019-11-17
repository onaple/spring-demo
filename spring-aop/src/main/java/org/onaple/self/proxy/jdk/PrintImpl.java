package org.onaple.self.proxy.jdk;

public class PrintImpl implements Print {

    @Override
    public String action(String input) {
        return "PrintImpl.action print" + input;
    }
}
