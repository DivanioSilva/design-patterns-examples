package com.ds.designpatternsexamples.builders.myOwnBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {
    private String name;
    private Integer age;
    private List<String> apelidos;

    public Person(PersonBuilder personBuilder) {
         this.age = personBuilder.age;
         this.name = personBuilder.name;
         this.apelidos = personBuilder.apelidos;
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

    public static class PersonBuilder{
        private String name;
        private Integer age;
        private List<String> apelidos;

        public PersonBuilder(String name) {
            this.name = name;
            this.apelidos = new ArrayList<>();
        }

        public PersonBuilder age(Integer age){
            this.age = age;
            return this;
        }

        public PersonBuilder apelido(String apelido){
            this.apelidos.add(apelido);
            return this;
        }

        public Person build(){
            Person person = new Person(this);
            return person;
        }
    }
}
