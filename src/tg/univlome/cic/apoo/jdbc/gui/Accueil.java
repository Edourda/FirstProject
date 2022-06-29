package tg.univlome.cic.apoo.jdbc.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Accueil extends JFrame {

    public static void main(String[] args) {

        Accueil accueil = new Accueil();
        accueil.setSize(900, 600);

        accueil.setDefaultCloseOperation(accueil.DISPOSE_ON_CLOSE);
        JPanel panel = (JPanel) accueil.getContentPane();
        panel.setLayout(new GridLayout(6, 3));
        panel.setLayout(new BorderLayout());

        JPanel nord = new JPanel();
        nord.setBackground(Color.blue);
        panel.add(nord, BorderLayout.NORTH);

        JPanel sud = new JPanel();
        sud.setBackground(Color.red);
        panel.add(sud, BorderLayout.SOUTH);

        JPanel Est = new JPanel();
        Est.setBackground(Color.green);
        panel.add(Est, BorderLayout.EAST);

        JPanel ouest = new JPanel();
        ouest.setBackground(Color.cyan);
        panel.add(ouest, BorderLayout.WEST);

        JButton boutton = new JButton("Mon boutton");
        JTextField texte = new JTextField("Mon texte SWING");
        JLabel label = new JLabel("Mon label");
        JTextArea area = new JTextArea("Zone de texte");
        JButton boutton1 = new JButton("Un boutton pour finir");

        nord.add(texte);
        sud.add(boutton1);
        Est.add(area);
        ouest.add(label);
        

//        panel.add(new JPanel(), BorderLayout.NORTH);
//        panel.add(new JPanel(), BorderLayout.WEST);
//        panel.add(new JPanel(), BorderLayout.EAST);
//        panel.add(new JPanel(), BorderLayout.SOUTH);
//
//        accueil.setLayout(new FlowLayout(FlowLayout.LEFT));
//       
        accueil.setVisible(true);

        nord.add(boutton);

    }

}
