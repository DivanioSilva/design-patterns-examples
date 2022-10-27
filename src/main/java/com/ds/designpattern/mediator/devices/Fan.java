package com.ds.designpattern.mediator.devices;

import com.ds.designpattern.mediator.DevicesMessages;
import com.ds.designpattern.mediator.Remote;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Fan implements Remote {
    @Override
    public String on() {
        log.info(DevicesMessages.FAN_ON.getValue());
        return DevicesMessages.FAN_ON.getValue();
    }

    @Override
    public String off() {
        log.info(DevicesMessages.FAN_OFF.getValue());
        return DevicesMessages.FAN_OFF.getValue();
    }
}
