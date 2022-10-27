package com.ds.designpattern.mediator;

import org.springframework.stereotype.Service;

@Service
public class RemoteService {
    private final RemoteImpl remote;
    private final AirConditioner airConditioner;
    private final Fan fan;

    public RemoteService() {
        this.remote = new RemoteImpl();
        this.airConditioner = new AirConditioner();
        this.fan = new Fan();
    }

    public String turnOnAirConditioner() {
        return this.remote.initialize(this.airConditioner).on();
    }

    public String turnOffAirConditioner() {
        return this.remote.initialize(this.airConditioner).off();
    }

    public String turnOnFan() {
        return this.remote.initialize(this.fan).on();
    }

    public String turnOffFan() {
        return this.remote.initialize(this.fan).off();
    }
}
