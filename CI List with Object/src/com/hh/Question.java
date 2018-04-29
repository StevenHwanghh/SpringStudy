package com.hh;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Question {
    private int id;
    private String question;
    private Map<Answer, User> answers;
    
    public Question(){}
    
    public Question(int id, String question, Map<Answer, User> answers) {
        super();
        this.id = id;
        this.question = question;
        this.answers = answers;
    }
    
    public void displayInfo() {
        System.out.println("id="+id);
        System.out.println("Question is:"+question);
        System.out.println("Answers are:");
        Set<Map.Entry<Answer, User>> set = answers.entrySet();
        Iterator<Map.Entry<Answer, User>> it=set.iterator();
        while(it.hasNext()) {
        	Map.Entry<Answer, User> entry=it.next();
        	Answer answer = entry.getKey();
        	User user = entry.getValue();
        	System.out.println("Answer Information:");  
            System.out.println(answer);  
            System.out.println("Posted By:");  
            System.out.println(user); 
        }
    }

}
