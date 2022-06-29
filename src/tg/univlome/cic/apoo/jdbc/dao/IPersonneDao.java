/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tg.univlome.cic.apoo.jdbc.dao;

import java.util.List;
import tg.univlome.cic.apoo.jdbc.entities.Personne;

/**
 *
 * @author steeltitan
 */
public interface IPersonneDao {
    public void ajouter(Personne personne);
    public Personne modifier(Personne personne);
    public Personne enregistrer(Personne personne);
    public void supprimer(Personne personne);
    public void supprimer(int id);
    public List<Personne> lister();
    public List<Personne> lister(String nomOuPrenom);
    public Personne trouver(int id);
}
