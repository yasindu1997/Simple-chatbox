/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.app;

/**
 *
 * @author yasin
 */
public class ChatApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChatObserve ob=new ChatObserve();
        ob.addChatObserver(new ChatWindow(ob, "Danapala"));
        ob.addChatObserver(new ChatWindow(ob, "Gunapala"));
        ob.addChatObserver(new ChatWindow(ob, "Siripala"));
    }
    
}
