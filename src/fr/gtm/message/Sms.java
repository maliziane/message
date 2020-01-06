package fr.gtm.message;

public class Sms extends Message {

	private String telDestinataire;
	
	public Sms(String contenu, String telDestinataire)  {
		super(contenu);
		this.setTelDestinataire(telDestinataire);
		
	}

	public String getTelDestinataire() {
		return telDestinataire;
	}

	public void setTelDestinataire(String telDestinataire) {
		this.telDestinataire = telDestinataire;
		
	}

	public void setStatus(boolean status) {
		super.setStatus(status);
		if (status ==true) {
		System.out.println("le SMS a été envoyé vers le numero "+getTelDestinataire());
		}
		else {
			System.out.println("le SMS n'a pas été envoyé");
		}
	}
}
