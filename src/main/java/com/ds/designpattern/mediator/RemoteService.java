package com.ds.designpattern.mediator;

import com.ds.annotations.LogExecutionTime;
import com.ds.designpattern.mediator.devices.AirConditioner;
import com.ds.designpattern.mediator.devices.Fan;
import com.ds.designpattern.mediator.devices.TV;
import org.springframework.stereotype.Service;

@Service
public class RemoteService {
    private final RemoteImpl remote;
    private final AirConditioner airConditioner;
    private final TV tv;
    private final Fan fan;

    public RemoteService() {
        this.remote = new RemoteImpl();
        this.airConditioner = new AirConditioner();
        this.tv = new TV();
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

    @LogExecutionTime
    public String turnOnTV() {
        return this.remote.initialize(this.tv).on();
    }

    @LogExecutionTime
    public String turnOffTV() {
        return this.remote.initialize(this.tv).off();
    }
}
