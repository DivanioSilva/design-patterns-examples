package com.ds.designpatternsexamples.observable;

public abstract class Observer {

    public Observer(Subject subject) {
        this.subject = subject;
    }

    protected Subject subject;
    public abstract void update();
}
