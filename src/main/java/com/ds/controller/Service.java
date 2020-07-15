package com.ds.controller;

import com.ds.exceptions.DBException;

@org.springframework.stereotype.Service
public class Service {

    public String message() throws DBException.BadExecution {
            throw  new DBException.BadExecution();
    }
}
