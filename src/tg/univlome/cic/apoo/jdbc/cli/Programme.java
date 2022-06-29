
package tg.univlome.cic.apoo.jdbc.cli;

import tg.univlome.cic.apoo.jdbc.dao.IPersonneDao;
import tg.univlome.cic.apoo.jdbc.dao.PersonneDaoImpl;
import tg.univlome.cic.apoo.jdbc.entities.Personne;


public class Programme {
    private static final IPersonneDao personneDao = new PersonneDaoImpl();
    
    public static void main(String[] args) {
        Personne personne = new Personne("OLI", "Marc", 29);
        personneDao.ajouter(personne);
    }
}
