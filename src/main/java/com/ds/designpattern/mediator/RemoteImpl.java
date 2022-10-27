package com.ds.designpattern.mediator;

import org.springframework.stereotype.Component;

@Component
public class RemoteImpl implements Remote, Invoker{
    private Remote remote;

    @Override
    public Remote initialize(Remote remote) {
        this.remote = remote;
        return this;
    }

    @Override
    public String on() {
        return remote.on();
    }

    @Override
    public String off() {
       return remote.off();
    }
}
