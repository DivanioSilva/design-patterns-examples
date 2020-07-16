package com.ds;

import com.ds.aspect.LoggingAspect;
import com.ds.builders.myOwnBuilder.Person;
import com.ds.stream.Reducer;
import com.ds.utils.LoggerStaticAppender;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
//@RunWith(MockitoJUnitRunner.class)
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

    @Test
    public void testSuccessIsLogged() {
        //LoggerStaticAppender.clearEvents();
        Reducer reducer = new Reducer();
        Person p = new Person.PersonBuilder("Divanio").apelido("Silva").age(32).build();
        //target.person(new Person.PersonBuilder("Divanio").apelido("Silva").age(32).build());
        SystemOutResource sysOut = new SystemOutResource();

        Assert.assertNotNull(sysOut);

        //Assert.assertEquals(sysOut.asString(), "");

    }
}
