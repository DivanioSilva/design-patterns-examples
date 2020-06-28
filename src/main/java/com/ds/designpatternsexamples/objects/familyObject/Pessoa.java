package com.ds.designpatternsexamples.objects.familyObject;

public abstract class Pessoa {
    private String name;
    private Integer age;
    protected String type;

    public Pessoa(String name) {
        this.name = name;
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

    public String getType() {
        return type;
    }

    public abstract void setType();
}
