package com.bridgelabz.greeting;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GREETINGS")
public class Greeting {

    private String name;
    @Id
    private long id;

    public Greeting() {
        id=0;
        name="";
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
