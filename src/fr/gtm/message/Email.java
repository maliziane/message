package fr.gtm.message;

public class Email extends Message {
	private String from;
	private String to;
	private String subject;
	
	public Email(String contenu, String from, String to, String subject) {
		super(contenu);
		this.setFrom(from);
		this.setTo(to);
		this.setSubject(subject);
		
		
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void setStatus(boolean status) {
		super.setStatus(status);
		if (status ==true) {
			System.out.println("l'email a été envoyé avec le contenu "+getContenu()+" et l'objet "+getSubject()+" de "+getFrom()+" vers "+getTo());
			}
			else {
				System.out.println("l'email n'a pas été envoyé");
			}
	}
}
