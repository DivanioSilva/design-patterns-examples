package com.ds.designpattern.observable;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
