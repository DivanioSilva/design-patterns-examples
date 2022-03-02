package com.ds.designpattern.chainOfResponsability.cardif;

public abstract class ValidationStep{
    private ValidationStep next;

    public ValidationStep linkWith(ValidationStep next) {
        this.next = next;
        return next;
    }

    public abstract void verify(Context toValidate);

    protected void checkNext(Context toValidate){
        if(next == null){
            System.out.println();
        }
        next.checkNext(toValidate);
    }
}
