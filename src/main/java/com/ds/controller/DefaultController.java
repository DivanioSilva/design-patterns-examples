package com.ds.controller;

import com.ds.exceptions.BaseException;
import com.ds.exceptions.DBException;
import com.ds.lambdas.Reducer;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

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

    @RequestMapping(value = "aop/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public BigDecimal getAOP() throws BaseException {

        Reducer reducer = new Reducer();

        BigDecimal response = reducer.justReturn(BigDecimal.TEN);

        return response;
    }
}
