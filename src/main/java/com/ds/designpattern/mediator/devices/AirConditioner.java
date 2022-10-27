package com.ds.designpattern.mediator.devices;

import com.ds.designpattern.mediator.DevicesMessages;
import com.ds.designpattern.mediator.Remote;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AirConditioner implements Remote {
    @Override
    public String on() {
      log.info(DevicesMessages.ACC_ON.getValue());
        return DevicesMessages.ACC_ON.getValue();
    }

    @Override
    public String off() {
        log.info(DevicesMessages.AC_OFF.getValue());
        return DevicesMessages.AC_OFF.getValue();
    }
}
