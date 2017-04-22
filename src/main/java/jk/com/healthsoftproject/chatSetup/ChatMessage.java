/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jk.com.healthsoftproject.chatSetup;

import java.util.Date;

public class ChatMessage {
    private String message;
    private String sender;
    private Date recieved;

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the sender
     */
    public String getSender() {
        return sender;
    }

    /**
     * @param sender the sender to set
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * @return the recieved
     */
    public Date getRecieved() {
        return recieved;
    }

    /**
     * @param recieved the recieved to set
     */
    public void setRecieved(Date recieved) {
        this.recieved = recieved;
    }

    @Override
    public String toString() {
        return "ChatMessage{" + "message=" + message + ", sender=" + sender + ", recieved=" + recieved + '}';
    }
    
    
    
}
