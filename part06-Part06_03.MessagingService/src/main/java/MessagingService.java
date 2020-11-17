/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rynef
 */

import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messages;
    
    public MessagingService(){
        this.messages = new ArrayList<>();
    }
    
    public void add(Message newContent){
        String messageContent = newContent.getContent(); //need to get the size of the arraylist
        if(messageContent.length() <= 280){
            this.messages.add(newContent);
        }
    }
    
    public ArrayList<Message> getMessages(){
        return this.messages;
    }
}
