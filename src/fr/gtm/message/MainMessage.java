package fr.gtm.message;

public class MainMessage {

	public MainMessage() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

MessageSender sender= new MessageSender();
Message m1 = new Email("toto","moi","dest1","subject1");
Message m2 = new Sms("tata","0165457841");
Message m3 =new Sms("titi","0645478541");
Message m4=new Email("mama","moi","gtm@gtm.fr","urgent");

sender.add(m1);
sender.add(m2);
sender.add(m3);

sender.sendAll();


sender.add(m4);
sender.sendAll();

	}
}
