package com.bridgelabz.greeting;

public class Greeting {
    private String name;
    private long id;

    public Greeting() {
    }

    public Greeting(long incrementAndGet, String format) {
        this.name = format;
        this.id = incrementAndGet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
