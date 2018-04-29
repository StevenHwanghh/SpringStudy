package com.hh;

public class Answer {
    private int id;
    private String name;
    private String answeredBy;
    
    public Answer() {}
    
    public Answer(int id, String name, String answeredBy) {
        super();
        this.id=id;
        this.name=name;
        this.answeredBy=answeredBy;
    }
    
    public String toString() {
        return id +" "+name+" "+answeredBy;
    }
}
