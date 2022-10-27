package com.ds.designpattern.mediator.devices;

import com.ds.designpattern.mediator.DevicesMessages;
import com.ds.designpattern.mediator.Remote;

public class TV implements Remote {
    @Override
    public String on() {
        return DevicesMessages.TV_ON.getValue();
    }

    @Override
    public String off() {
        return DevicesMessages.TV_OFF.getValue();
    }
}
