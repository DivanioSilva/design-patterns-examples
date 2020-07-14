package com.ds.objects.familyObject;

public class Mae extends Pessoa{
    public Mae(String name) {
        super(name);
        this.setType();
    }

    @Override
    public void setType() {
        super.type = PersonType.MAE.value;
    }
}
