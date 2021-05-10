package com.ds.designpattern.observable;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllSubjects();
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    private void notifyAllSubjects() {
        observers.forEach(observer -> observer.update());
    }
}
