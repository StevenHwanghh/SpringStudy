package com.hh;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Question {
    private int id;
    private String question;
    private Map<String, String> answers;
    
    public Question(){}
    
    public Question(int id, String question, Map<String, String> answers) {
        super();
        this.id = id;
        this.question = question;
        this.answers = answers;
    }
    
    public void displayInfo() {
        System.out.println("id="+id);
        System.out.println("Question is:"+question);
        System.out.println("Answers are:");
        Set<Map.Entry<String, String>> set = answers.entrySet();
        Iterator<Map.Entry<String, String>> it=set.iterator();
        while(it.hasNext()) {
        	Map.Entry<String, String> entry=it.next();
            System.out.println("Answer："+entry.getKey()+" Posted by:"+entry.getValue());
        }
    }

}
