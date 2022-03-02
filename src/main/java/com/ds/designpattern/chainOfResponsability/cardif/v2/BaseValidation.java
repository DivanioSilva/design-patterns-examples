package com.ds.designpattern.chainOfResponsability.cardif.v2;

import com.ds.designpattern.chainOfResponsability.cardif.Context;
import com.ds.exceptions.ParamException;

public abstract class BaseValidation {
    protected BaseValidation nextChain;

    public void nextChain(BaseValidation nextChain) {
        this.nextChain = nextChain;
    }

    public abstract void validate(Context context) throws ParamException;
}
