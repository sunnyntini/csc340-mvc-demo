package com.example.mvc;

/**
 *
 * @author Sunny Ntini
 */
class Greeting {
    private String message;
    private String recipient;

    public Greeting(String message, String recipient) {
        this.message = message;
        this.recipient = recipient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    
}
