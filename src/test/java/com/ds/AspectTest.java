package com.ds;

import com.ds.aspect.LoggingAspect;
import com.ds.stream.Reducer;
import org.junit.jupiter.api.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AspectTest {

    @Autowired
    private Reducer target;

    @Test
    public void aopFirstTest(){
        AspectJProxyFactory factory = new AspectJProxyFactory(this.target);
        LoggingAspect aspect = new LoggingAspect();
        factory.addAspect(aspect);
        factory.getProxy();
    }
}
