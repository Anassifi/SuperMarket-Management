package superMarcher;

import java.util.*;

public class Chariot {

	private List<Achat> lesAchats = new ArrayList<Achat>();
	
	private Achat achat;
	private int qnt;	
	private double total;
	private double totalTicket;

	public Chariot() {
		// TODO Auto-generated constructor stub
	}

	public Achat getAchat() {
		return achat;
	}



	public void setAchat(Achat achat) {
		this.achat = achat;
	}



	public int getQnt() {
		return qnt;
	}



	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	public double getTotalTicket() {
		return totalTicket;
	}

	public void setTotalTicket(double totalTicket) {
		this.totalTicket = totalTicket;
	}

	public List<Achat> getLesAchats() {
		return lesAchats;
	}

	public void remplir(Article article, int qnt) {
		this.achat = new Achat(article, qnt);
		lesAchats.add(achat);
	}

	// Not sure
	public void setLesAchats(List<Achat> lesAchats) {
		this.lesAchats = lesAchats;
	}
	
	public double scanner() { 
		totalTicket = 0;
		for(int i = 0; i < getLesAchats().size(); i++) {
			int qnt = getLesAchats().get(i).getQuantiteAcheter();
			double price = getLesAchats().get(i).getArticleAcheter().getPrix();
			String itemName = getLesAchats().get(i).afficher();
			total = qnt * price;
			totalTicket += total;
			System.out.println(itemName);
		}
		
		System.out.println("-----------------------------");
		System.out.print("Total chariot: ");
		return totalTicket;
		
	}
	
	//Chariot array adds ticketTotal to the array loop over the array
	
	

}
