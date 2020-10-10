package com.ds.builders.myOwnBuilder;

import com.ds.aspect.LoggingAspect;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private static final Logger LOGGER = LogManager.getLogger(Person.class);

    private String name;
    private Integer age;
    private List<String> apelidos;

    public Person(PersonBuilder personBuilder) {
        this.age = personBuilder.age;
        this.name = personBuilder.name;
        this.apelidos = personBuilder.apelidos;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", apelidos=" + apelidos +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getApelidos() {
        return apelidos;
    }

    public void setApelidos(List<String> apelidos) {
        this.apelidos = apelidos;
    }

    public static class PersonBuilder {
        private String name;
        private Integer age;
        private List<String> apelidos;

        public PersonBuilder(String name) {
            this.name = name;
            this.apelidos = new ArrayList<>();
        }

        public PersonBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public PersonBuilder apelido(String apelido) {
            this.apelidos.add(apelido);
            return this;
        }

        public Person build() {
            LOGGER.info("Vou buildar uma nova pessoa!");
            Person person = new Person(this);
            return person;
        }
    }
}
