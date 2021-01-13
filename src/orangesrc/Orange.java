package orangesrc;

public class Orange {
	
	private double prix;
	private String origine;
	public Orange(double prix, String origine) {
		super();
		this.prix = prix;
		this.origine = origine;
	}
	
	public double getPrix() throws Exception {
		if(prix<0) {
			throw new Exception("Prix négatif");
		}
	
		return prix;
	}

	public String getOrigine() {
		return origine;
	}

	@Override
	public String toString() {
		return "Orange [prix=" + prix + ", origine=" + origine + "]";
	}
	
	
	public boolean equals (Orange o) throws Exception
	{
		//condition pour vérifier l'égalité des 2 attributs ==> true / false
		// 1er test pour vérifier que la qte de m est égale à la qté de la somme créée
		if (  o.prix== this.getPrix()&& o.getOrigine().equals(this.getOrigine()))
			return true; // si la condition est vraie
		else
			return false;
	}
	
	
	
}
