package Canal;

import junit.*;
import models.Canal;
import models.Message;
import models.Utilisateur;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.*;

import org.junit.Assert;
import org.junit.Test;
import Exceptions.ActionNonAutoriseeException;
public class TestCanal {
	
	
    @Test
    public void ecrireMessageOK() throws ActionNonAutoriseeException {
        // Etape 1 : préparation des objets
        Canal c = new Canal();

        Message m = new Message();
       /* m.setDestinaire(c);
        m.setTexte("Bonne fêtes de fin d'année !");*/

        Utilisateur utilisateur = new Utilisateur();
    /*    c.getMapping_role_utilisateurs().put(new Rôle("Membre"), Arrays.asList(utilisateur));
        c.getMapping_role_habilitations().put(new Rôle("Membre"), Arrays.asList(Habilitation.ECRITURE));*/

        // Etape 2 : appel de la méthode testée
        c.ecrireMessage(utilisateur, m);

        // Etape 3 test du retour
        List<Message> historiques = c.getHistoriques();
      //  Assert.assertEquals(1, historiques.size());
     //   System.out.println(historiques.get(0).getTexte());
    }

    @Test
    public void ecrireMessageKO() {

        // Etape 1 : préparation des objets
        Canal c = new Canal();

        Message m = new Message();
     /*   m.setDestinaire(c);
        m.setTexte("Bonne année 2021 !"); */

        Utilisateur utilisateur = new Utilisateur();

        // Etape 2 : appel de la méthode testée
    /*   try {
            c.ecrireMessage(utilisateur, m);

            // Etape 3 test du retour
            fail("L'exception aurait du être levée, on ne doit pas passer ici !");
        } catch (ActionNonAutoriseeException e) {
*/
            // Etape 3 test du retour = si on arrive ici, le test est concluant
        }
    
	
	@Test
	public void CompareToTEST() {
		Canal canal1 = new Canal();
		
		Canal canal2 = new Canal();
		
		Canal canal3 = new Canal();
		
		canal1.ordre = 10;
		
		canal2.ordre = 10;
		
		canal3.ordre = 100;
		
		assertEquals("égaux",0, canal1.compareTo(canal2));
		
		assertNotEquals("faux",0, canal1.compareTo(canal3));
		
	}
	
	
}