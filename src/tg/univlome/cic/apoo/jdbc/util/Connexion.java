/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.cic.apoo.jdbc.util;

import java.io.FileInputStream;
import java.sql.DriverManager;
import java.util.Properties;
import java.sql.Connection;

/**
 *
 * @author 
 */
public class Connexion {

    private static final Connexion instance;

    static {
        instance = new Connexion();
    }

    private Connexion() {

    }

//    public static Connexion getInstance() {
//        return instance;
//    }

    public static Connection getInstance() throws Exception {
        return instance.getConnexion();
    }
    
    public Connection getConnexion() throws Exception {
        Properties proprietes = new Properties();
        try ( FileInputStream fichier = new FileInputStream("conf.properties")) {
            proprietes.load(fichier);// Chargement du fichier
        }
        return DriverManager.getConnection(
            proprietes.getProperty("jdbc.url"),
            proprietes.getProperty("jdbc.login"),
            proprietes.getProperty("jdbc.password")
        );
    }
}

