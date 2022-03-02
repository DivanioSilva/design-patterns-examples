package com.ds.designpattern.chainOfResponsability.validations;

import com.ds.entities.BaseEntity;
import com.ds.exceptions.ParamException;

import java.util.List;

public interface Chain <T extends BaseEntity>{

    void nextChain(Chain<T> nextChain);

    void validate(List<T> employees) throws ParamException;
}
