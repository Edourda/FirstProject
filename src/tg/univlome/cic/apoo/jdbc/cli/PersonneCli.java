/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.cic.apoo.jdbc.cli;

import java.util.List;
import tg.univlome.cic.apoo.jdbc.dao.IPersonneDao;
import tg.univlome.cic.apoo.jdbc.dao.PersonneDaoImpl;
import tg.univlome.cic.apoo.jdbc.entities.Personne;

/**
 *
 * @author Edourda ADADE
 */
public class PersonneCli {
    
    IPersonneDao personneDao = new PersonneDaoImpl();
    public void lister(){
        List <Personne> personnes = personneDao.lister();
        
        for(Personne p : personnes){
            System.out.println(p);
        }
    }
    
    public void lister (String key){
        List <Personne> personne = personneDao.lister(key);
        
        for(Personne p : personne){
            System.out.println(p);
        }
    }
    
}
