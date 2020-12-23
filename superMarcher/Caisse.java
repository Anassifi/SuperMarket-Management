package superMarcher;

import java.util.*;

public class Caisse {
	
	private int numeroDeCaisse;
	private double montantTotal;
	private List<Chariot> lesChariot = new ArrayList<Chariot>();

	
	public Caisse(int numeroDeCaisse, double montantTotal) {
		this.numeroDeCaisse = numeroDeCaisse;
		this.montantTotal = montantTotal;
	}
	
	public int getNumeroDeCaisse() {
		return numeroDeCaisse;
	}
	
	public void setNumeroDeCaisse(int numeroDeCaisse) {
		this.numeroDeCaisse = numeroDeCaisse;
	}
	
	public double getMontantTotal() {
		return montantTotal;
	}
	
	public void setMontantTotal(int montantTotal) {
		this.montantTotal = montantTotal;
	}
	
	public double montantTotal() {
		double totalCaisse = 0;
		for(int i = 0; i < lesChariot.size(); i++) {
			double totalChariot = lesChariot.get(i).getTotalTicket();
			totalCaisse += totalChariot;
		}
		System.out.println("Caisse Numero " + numeroDeCaisse + ": " + totalCaisse);
		return totalCaisse;
		
	}
	
	public void scanner(Chariot ch) { 
		System.out.println(ch.scanner());
		lesChariot.add(ch);
	}
}