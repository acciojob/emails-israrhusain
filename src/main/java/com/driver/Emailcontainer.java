package com.driver;

import java.sql.Date;

public class Emailcontainer {
    Date date;
    String sender;
    String message;
    public Emailcontainer(Date date, String sender, String message) {
        this.date = date;
        this.sender = sender;
        this.message = message;
    }

    
}
