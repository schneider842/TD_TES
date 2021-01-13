package orangesrc;
import java.util.ArrayList;


public class Panier {
	
	int CONTENANCEMAX = 10;
	
	
	private ArrayList<Orange> Panier = new ArrayList<Orange>();
	private int size;
		
	
	public Panier(ArrayList<Orange> panier, int size) {
		super();
		Panier = panier;
		this.size=size;
	}
	
	

	public boolean estPlein() {
		if(CONTENANCEMAX == Panier.size()) {
			return true;
		}
		return false;
		
		
	}
	
	public boolean estVide() {
		if(this.Panier.isEmpty()) {
			return true;
		}
		return false;
	}

	public void retirer() {
		Panier.remove(Panier.get(Panier.size()));
	}
	
	public double getPrix() throws Exception {
		double prixPanier = 0;
		if (!estVide()) {
			for (int i=0 ; i < Panier.size();i++) {
				prixPanier += Panier.get(i).getPrix();
			}
		}
		return prixPanier;
	}
	
	

	@Override
	public String toString() {
		String r="";
		for (int i=0; i<Panier.size();i++) {
		r+= "Element "+i+": "+Panier.get(i)+"\n";
	}
		return r;
		
	}
	
	public Panier ajouter(Orange o) {	
		//initialiser un novueau panier basé sur le this.panier (P= this.panier)
		Panier P;
//tester si le panier est plein ?? il a atteint son maximum
			//si plein ==> return this.panier
		/*//PAnier est la liste et non pas l'objet panier
		if((this.estPlein()) {
			return this;
		}*/
		if((!this.estPlein())) {
			this.Panier.add(o);
		}
		P=new Panier(this.Panier, CONTENANCEMAX);
			//sinon: ajouter l'orange dans le panier et retourné le panier modifié (retourner P après avoir ajouté l'orange)
		return P;
	}
	
	
	public boolean equals(Panier p1) {
		Boolean s=false;
		if(this.Panier.size()==p1.Panier.size()) {
			
			for (int i=0 ; i>Panier.size();i++) {
				s=false;
					
				for (int j=0; j < p1.Panier.size() ; j++) {
					if (this.Panier.get(j)==p1.Panier.get(j)) {
						s=true;
						break;
					
					}
				}
				if (!s) {
					return s;
				}
				
			}
			
		}
		return s;
		
		
	}
	
	
}
