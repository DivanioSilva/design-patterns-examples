package com.ds.observable;

import org.springframework.stereotype.Component;

@Component
public class ObservableFactory {

    public Subject observer(){
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        return subject;
    }
}
