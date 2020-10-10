package com.ds.entities.familyObject;

public class Pai extends Pessoa {

    public Pai() {
        super(null);
        this.setType();
    }

    public Pai(String name) {
        super(name);
        this.setType();
    }

    @Override
    public void setType() {
        super.type = PersonType.PAI.value;
    }
}
