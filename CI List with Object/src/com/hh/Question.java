package com.hh;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Question {
    private int id;
    private String question;
    private List<Answer> answer;
    
    public Question(){}
    
    public Question(int id, String question, List<Answer> answer) {
        super();
        this.id = id;
        this.question = question;
        this.answer = answer;
    }
    
    public void displayInfo() {
        System.out.println("id="+id);
        System.out.println("Question is:"+question);
        System.out.println("Answer are:");
        Iterator<Answer> it=answer.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
