package com.oop15.people;

public class Tool {

    protected String name;

    public Tool(String name) {
        this.name = name;
    }

    public void use() {}

    @Override
    public String toString() {
        return name;
    }
}
