/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.cic.apoo.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.Jdbc;
import tg.univlome.cic.apoo.jdbc.entities.Personne;
import tg.univlome.cic.apoo.jdbc.util.Connexion;

/**
 *
 * @author steeltitan
 */
public class PersonneDaoImpl implements IPersonneDao{

    @Override
    public void ajouter(Personne personne) {
        try {
            Connection connexion = Connexion.getInstance();
            String sql = "INSERT INTO personne(nom, prenom, age) VALUES (?, ?, ?);";
            PreparedStatement statement = connexion.prepareStatement(sql);
            statement.setString(1, personne.getNom());
            statement.setString(2, personne.getPrenom());
            statement.setInt(3, personne.getAge());
            statement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Personne modifier(Personne personne) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Personne enregistrer(Personne personne) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void supprimer(Personne personne) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void supprimer(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Personne> lister() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Personne> lister(String nomOuPrenom) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Personne trouver(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
