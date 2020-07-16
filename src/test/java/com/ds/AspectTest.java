package com.ds;

import com.ds.aspect.ReducerAspect;
import com.ds.stream.Reducer;
import org.junit.jupiter.api.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AspectTest {

    @Test
    public void aopFirstTest(){
        Reducer target = new Reducer();
        AspectJProxyFactory factory = new AspectJProxyFactory(target);
        ReducerAspect aspect = new ReducerAspect();
        factory.addAspect(aspect);
        factory.getProxy();
    }
}
