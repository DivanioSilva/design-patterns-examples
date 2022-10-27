package com.ds.designpattern.mediator;

import com.ds.annotations.LogExecutionTime;
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

    @LogExecutionTime
    public String turnOnAirConditioner() {
        return this.remote.initialize(this.airConditioner).on();
    }

    @LogExecutionTime
    public String turnOffAirConditioner() {
        return this.remote.initialize(this.airConditioner).off();
    }

    @LogExecutionTime
    public String turnOnFan() {
        return this.remote.initialize(this.fan).on();
    }

    @LogExecutionTime
    public String turnOffFan() {
        return this.remote.initialize(this.fan).off();
    }
}
