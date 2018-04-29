package com.hh;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Answer {
    private int id;
    private String answer;
    private Date postedDate;
    
    public Answer() {}
    
    public Answer(int id, String answer, Date postedDate) {
        super();
        this.id=id;
        this.answer=answer;
        this.postedDate=postedDate;
    }
    
    public String toString() {
    	SimpleDateFormat ft = new SimpleDateFormat("MM/dd/YYYY");
    	return "Id:"+id+" Answer:"+answer+" Posted Date:"+ft.format(postedDate); 
    }
}
