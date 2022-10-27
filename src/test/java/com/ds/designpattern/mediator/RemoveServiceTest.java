package com.ds.designpattern.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveServiceTest {

    private final RemoteService remoteService;

    public RemoveServiceTest() {
        this.remoteService = new RemoteService();
    }

    @Test
    void turnOnAirConditioner(){
        String message = remoteService.turnOnAirConditioner();
        assertEquals(DevicesMessages.ACC_ON.getValue(), message);
    }

    @Test
    void turnOffAirConditioner(){
        String message = remoteService.turnOffAirConditioner();
        assertEquals(DevicesMessages.AC_OFF.getValue(), message);
    }

    @Test
    void turnOnFan(){
        String message = remoteService.turnOnFan();
        assertEquals(DevicesMessages.FAN_ON.getValue(), message);
    }

    @Test
    void turnOffFan(){
        String message = remoteService.turnOffFan();
        assertEquals(DevicesMessages.FAN_OFF.getValue(), message);
    }

    @Test
    void turnOnTV(){
        String message = remoteService.turnOnTV();
        assertEquals(DevicesMessages.TV_ON.getValue(), message);
    }

    @Test
    void turnOffTV(){
        String message = remoteService.turnOffTV();
        assertEquals(DevicesMessages.TV_OFF.getValue(), message);
    }
}
