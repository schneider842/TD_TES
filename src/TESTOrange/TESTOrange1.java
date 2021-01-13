package TESTOrange;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import orangesrc.Orange;

public class TESTOrange1 {

	//créer la variable b ==> alloué de l'espace mémoire pour la varaible ***globale**
			private Orange a,b,c,d;
			private ArrayList<Orange> listePanier;
			private ArrayList<Orange> listePanier1;
		
		@Before
		public void init()
		{
			//on va utiliser la variable réée et l'initialiser
			 d=new Orange(0.90, "France");
			 listePanier = new ArrayList<Orange>();
			 listePanier1 = new ArrayList<Orange>();
			 //orange b ==> tu va ecraser la variable globale et b devient une variable locale inaccessible depuis le autres méthodes
			 
			listePanier.add(new Orange(0.80, "France"));
			listePanier.add(new Orange(0.80, "Espagne"));
			listePanier.add(new Orange(0.90, "Floride"));
			listePanier1.add(new Orange(0.90, "Floride"));
			listePanier1.add(new Orange(0.90, "Floride"));
			listePanier1.add(new Orange(0.90, "Floride"));
			
		 
		}
		
		
		
		@Test
		public void testequalsorange() throws Exception {		
			 b = new Orange(0.80, "France");
			 c = new Orange(0.80, "France");
			assertTrue(b.equals(c)); 
		}
		
		@Test 
		public void testequalspanier() {
			listePanier = new ArrayList<Orange>();
			listePanier1 = new ArrayList<Orange>();
			assertTrue(listePanier.equals(listePanier1));
		}
			
			
		@Test 
		public void testconstructeur()  {
			 a = new Orange(0.80, "France");
			 b = new Orange(0.80, "France");
			 c = new Orange(0.80, "France");
			// tester si a n'est pas nulle ==> le constructeur est bien pris en compte
					assertNotNull(a);
					//tester si 2 varaibls créées identiquement ont la même valeur ou pas
					try {
						assertTrue(a.equals(b));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
			
			
		}
	
	
	
	

}
