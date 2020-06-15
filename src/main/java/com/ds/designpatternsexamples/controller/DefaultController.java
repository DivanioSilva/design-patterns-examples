package com.ds.designpatternsexamples.controller;

import com.ds.designpatternsexamples.exceptions.BaseException;
import com.ds.designpatternsexamples.exceptions.DBException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class DefaultController {

    @RequestMapping(value = "v0/test/{value}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String get(@PathVariable(name = "value") String value) throws BaseException {

        if(true){
            throw new DBException.BadExecution();
        }

        return value;
    }

    @RequestMapping(value = "v1/test/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String get1() throws BaseException {

        if(true){
            throw new DBException.NoData();
        }

        return "ping";
    }
}