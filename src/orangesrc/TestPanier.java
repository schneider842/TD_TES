package orangesrc;
import java.util.ArrayList;

public class TestPanier {

	public static void main(String[] args) throws Exception {
		ArrayList<Orange> Panier = new ArrayList<Orange>();
		
		Panier b = new Panier(Panier, 3);
		b.ajouter(new Orange(1, "France"));
	
		Panier c= new Panier(Panier, 3);
		c.ajouter(new Orange(1, "France"));
		
		System.out.println(b.getPrix());
		System.out.println(b.estPlein());
		System.out.println(b.estVide());
		System.out.println(b.toString());
		System.out.println(b.equals(c));
	}

}
