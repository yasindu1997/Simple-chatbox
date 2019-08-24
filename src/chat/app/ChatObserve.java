/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.app;

import java.util.ArrayList;

/**
 *
 * @author yasin
 */
public class ChatObserve {
    static ArrayList<ChatWindow> windows=new ArrayList<>();
    
    public void addChatObserver(ChatWindow chatWindow){
        chatWindow.setVisible(true);
        windows.add(chatWindow);
    }
    
}
