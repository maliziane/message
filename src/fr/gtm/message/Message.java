package fr.gtm.message;

public class Message {
	private String contenu;
	private boolean status;

	public Message(String contenu) {
		this.setContenu(contenu);
		}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
