package fr.gtm.message;

import java.util.ArrayList;
import java.util.List;

public class MessageSender {

	List<Message> messages = new ArrayList<Message>();
	
		public void sendAll() {
			for (int i=0; i<messages.size();i++){
				if(!messages.get(i).isStatus()) {
				messages.get(i).setStatus(true);
				}
			}System.out.println("Tous les messages ont été envoyés!");
			
			}
	
		public void add(Message message) {
			messages.add(message);
		
		}
		
}
