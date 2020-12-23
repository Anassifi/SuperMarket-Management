package superMarcher;

public class Achat{
	
	private Article articleAcheter;
	private int quantiteAcheter;

	
	public Achat(Article articleAcheter, int quantiteAcheter) {
		// TODO Auto-generated constructor stub
		this.articleAcheter = articleAcheter;
		this.quantiteAcheter = quantiteAcheter;
	}
	
	public Article getArticleAcheter() {
		return articleAcheter;
	}
	public void setArticleAcheter(Article articleAcheter) {
		this.articleAcheter = articleAcheter;
	}
	public int getQuantiteAcheter() {
		return quantiteAcheter;
	}
	public void setQuantiteAcheter(int quantiteAcheter) {
		this.quantiteAcheter = quantiteAcheter;
	}
	
	
	public String afficher() {
		return articleAcheter.getNom() + ": " + articleAcheter.getPrix() + " x " + quantiteAcheter + " = " + (articleAcheter.getPrix() * quantiteAcheter);
	}
	
	
	
	
}
