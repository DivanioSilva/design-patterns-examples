package com.ds.designpattern.builders.myOwnBuilder;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Slf4j
public class Person {

    private String name;
    private Integer age;
    private List<String> apelidos;

    public Person(PersonBuilder personBuilder) {
        this.age = personBuilder.age;
        this.name = personBuilder.name;
        this.apelidos = personBuilder.apelidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!Objects.equals(name, person.name)) return false;
        if (!Objects.equals(age, person.age)) return false;
        return Objects.equals(apelidos, person.apelidos);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (apelidos != null ? apelidos.hashCode() : 0);
        return result;
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
            log.info("Vou buildar uma nova pessoa!");
            Person person = new Person(this);
            return person;
        }
    }
}
