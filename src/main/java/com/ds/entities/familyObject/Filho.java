package com.ds.entities.familyObject;

public class Filho extends Pessoa {

    public Filho(String name) {
        super(name);
        this.setType();
    }

    @Override
    public void setType() {
        super.type = PersonType.FILHO.value;
    }
}
