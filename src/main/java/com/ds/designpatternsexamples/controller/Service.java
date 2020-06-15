package com.ds.designpatternsexamples.controller;

import com.ds.designpatternsexamples.exceptions.DBException;

@org.springframework.stereotype.Service
public class Service {

    public String message() throws DBException.BadExecution {
            throw  new DBException.BadExecution();
    }
}
